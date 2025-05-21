package org.example.carta;

import org.example.util.ResultadoBatalha;

public class CartaMonstro extends Carta {

    private int ataque;
    private int defesa;

    public CartaMonstro(String nome, int ataque, int defesa) {
        super(nome);
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public int getAtaque() {
        return this.ataque;
    }

    public int getDefesa() {
        return this.defesa;
    }

    public ResultadoBatalha batalhar(CartaMonstro cartaMonstro) {
        System.out.println(this.nome + " (ATK: " + ataque + ") VS "
                + cartaMonstro.getNome() + " (ATK: "
                + cartaMonstro.getAtaque() + ")");
        if (this.ataque > cartaMonstro.getAtaque()) {
            return ResultadoBatalha.VITORIA;
        } else if (this.ataque < cartaMonstro.getAtaque()) {
            return ResultadoBatalha.DERROTA;
        } else {
            return ResultadoBatalha.EMPATE;
        }
    }

    @Override
    public void exibir() {
        System.out.println("[Monstro] " + nome + " - ATK: "
                + ataque + " / DEF: " + defesa);
    }
}
