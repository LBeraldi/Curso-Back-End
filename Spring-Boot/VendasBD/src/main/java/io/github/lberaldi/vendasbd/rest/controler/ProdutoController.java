package io.github.lberaldi.vendasbd.rest.controler;

import io.github.lberaldi.vendasbd.domain.entity.Produto;
import io.github.lberaldi.vendasbd.domain.repository.Produtos;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    private Produtos produtos;

    public ProdutoController(Produtos produtos) {
        this.produtos = produtos;
    }

    // Metodo para encontrar por ID.
    @GetMapping("{id}")
    public Produto getProdutoId(@PathVariable Integer id) {
        return produtos.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não " +
                "encontrado!"));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto save(@RequestBody Produto produto) {
        return produtos.save(produto);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Integer id) {
        produtos.findById(id).map(produto -> {
            produtos.delete(produto);
            return Void.TYPE;
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado!"));
    }

    @PutMapping("{id}")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public void update(@PathVariable Integer id, @RequestBody Produto produto) {
        produtos.findById(id).map(produtoExistente -> {
            produto.setId(produtoExistente.getId());
            produtos.save(produto);
            return produtoExistente;
        }).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Produto não encontrado!"));
    }

    @GetMapping
    public List<Produto> find(Produto filtro){
        ExampleMatcher matcher = ExampleMatcher.matching().withIgnoreCase().withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example example = Example.of(filtro, matcher);
        return produtos.findAll(example);
    }
}
