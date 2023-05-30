package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Deposito  implements  Iterable<Produto>{


    private List<Produto> produtos = new ArrayList<Produto>();

    public Deposito(Produto... produtos) {
        this.produtos = Arrays.asList(produtos);
    }

    @Override
    public Iterator<Produto> iterator() {
        return produtos.iterator();
    }

}
