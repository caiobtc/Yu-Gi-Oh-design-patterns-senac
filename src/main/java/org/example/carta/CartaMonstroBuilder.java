package org.example.carta;

public class CartaMonstroBuilder {
    private String nome;
    private int ataque;
    private int defesa;

    public CartaMonstroBuilder setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public CartaMonstroBuilder setAtaque(int ataque) {
        this.ataque = ataque;
        return this;
    }

    public CartaMonstroBuilder setDefesa(int defesa) {
        this.defesa = defesa;
        return this;
    }

    public CartaMonstro builder() {
        return new CartaMonstro(nome, ataque, defesa);
    }
}
