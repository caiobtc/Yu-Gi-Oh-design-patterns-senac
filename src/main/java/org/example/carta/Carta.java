package org.example.carta;

public abstract class Carta {

    protected String nome;

    public Carta(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract void exibir();
}
