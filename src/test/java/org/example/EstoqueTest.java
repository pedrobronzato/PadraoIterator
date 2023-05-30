package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstoqueTest {


    @Test
    void deveContaProdutosFrageisNoDeposito() {
        Deposito deposito = new Deposito(
                new Produto("Copos de cristal", true),
                new Produto("Pelucia", false),
                new Produto("Pratos de porcelana", true),
                new Produto("Taças de Vidro", true)
        );
        assertEquals(3, Estoque.contarProdutosFrageisDeposito(deposito));
    }

    @Test
    void deveContarTotalProdutosDeposito() {
        Deposito deposito = new Deposito(
                new Produto("Copos de cristal", true),
                new Produto("Pelucia", false),
                new Produto("Pratos de porcelana", true),
                new Produto("Taças de Vidro", true)
        );
        assertEquals(4, Estoque.contarTotalProdutos(deposito));
    }

}