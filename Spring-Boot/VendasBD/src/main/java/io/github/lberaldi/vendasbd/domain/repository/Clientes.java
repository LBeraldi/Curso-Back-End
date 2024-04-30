package io.github.lberaldi.vendasbd.domain.repository;

import io.github.lberaldi.vendasbd.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
//import jakarta.persistence.Entity;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.TypedQuery;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;

//@Repository
public interface Clientes extends JpaRepository<CLiente, int> {}

//    private static String INSERT = "insert into cliente (nome) values (?) ";
//    private static String SELECT_ALL = "SELECT * FROM cliente ";
//    private static String UPDATE = "UPDATE cliente SET nome = ? WHERE id = ? ";
//    private static String DELETE = "DELETE FROM cliente WHERE id = ? ";
//
//    @Autowired
//    private JdbcTemplate jdbcTemplate;

//    @Autowired
//    private EntityManager entityManager;
//
//    @Transactional
//    public Cliente salvar(Cliente cliente){
//        entityManager.persist(cliente);// utilizando jpa
////        jdbcTemplate.update(INSERT, new Object[]{cliente.getNome()});
//        return cliente;
//    }
//
//    @Transactional
//    public Cliente atualizar(Cliente cliente){
//        entityManager.merge(cliente);
////        jdbcTemplate.update(UPDATE, new Object[]{cliente.getNome(), cliente.getId()});
//        return cliente;
//    }
//
//    @Transactional
//    public void deletar(Cliente cliente){
//        if (!entityManager.contains(cliente)){
//            cliente = entityManager.merge(cliente);
//        }
//        entityManager.remove(cliente);
////        deletar(cliente.getId());
//    }
//
//    @Transactional
//    public void deletar(int id){
//        Cliente cliente = entityManager.find(Cliente.class, id);
//        deletar(cliente);
////        jdbcTemplate.update(DELETE, new Object[]{id});
//    }
//
//    @Transactional
//    public List<Cliente> buscarPorNome(String nome){
//        String jpql = " select cliente from Cliente cliente where cliente.nome like :nome ";
//        TypedQuery<Cliente> query = entityManager.createQuery(jpql, Cliente.class);
//        query.setParameter("nome", "%" + nome + "%");
//        return query.getResultList();
////        return jdbcTemplate.query(SELECT_ALL.concat(" WHERE nome like ? "),
////                new Object[]{"%" + nome + "%"},
////                getRowMapper());
//    }
//
//    @Transactional
//    public List<Cliente> obterTodos(){
//        return entityManager.createQuery("from Cliente", Cliente.class).getResultList();
////        return jdbcTemplate.query(SELECT_ALL, getRowMapper());
//    }

//    private static RowMapper<Cliente> getRowMapper() {
//        return new RowMapper<Cliente>() {
//            @Override
//            public Cliente mapRow(ResultSet rs, int i) throws SQLException {
//                int id = rs.getInt("id");
//                String nome = rs.getString("nome");
//                return new Cliente(id, nome);
//            }
//        };
//    }

