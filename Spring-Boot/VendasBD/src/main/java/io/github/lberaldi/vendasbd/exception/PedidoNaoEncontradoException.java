package io.github.lberaldi.vendasbd.exception;

public class PedidoNaoEncontradoException extends RuntimeException {
    public PedidoNaoEncontradoException() {
        super("Pedido não encontrado.");
    }
}
