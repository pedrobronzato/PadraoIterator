package org.example;

import java.util.Iterator;

public class Estoque {


    public static Integer contarProdutosFrageisDeposito(Deposito deposito) {
        int quantidade = 0;
        for (Produto produto : deposito) {
            if (produto.isFragil()) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public static Integer contarTotalProdutos(Deposito deposito) {
        int quantidade = 0;
        for (Iterator a = deposito.iterator(); a.hasNext(); ) {
            quantidade++;
            a.next();
        }
        return quantidade;
    }
}
