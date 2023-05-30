package org.example;

public class Produto {

    private String descricao;
    private boolean fragil;

    public Produto(String descricao, boolean fragil) {
        this.descricao = descricao;
        this.fragil = fragil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }
}
