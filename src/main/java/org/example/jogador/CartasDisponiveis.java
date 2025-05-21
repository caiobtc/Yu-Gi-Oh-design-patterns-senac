package org.example.jogador;

import org.example.carta.CartaMonstro;
import org.example.carta.CartaMonstroBuilder;

public enum CartasDisponiveis {
    MAGO_NEGRO("Mago Negro", 2500, 2100),
    DRAGAO_BRANCO("Dragão Branco", 3000, 2500),
    INVOCADOR_DE_CHAMAS("Invocador de Chamas", 1800, 1600),
    GIGANTE_DE_PEDRA("Gigante de Pedra", 1300, 2000),
    NINJA_SOMBRIO("Ninja Sombrio", 1500, 1200),
    GERREIRO_AXE("Guerreiro Axe", 1700, 1500),
    ESPADACHIM_DA_CHAMA("Espadachim da Chama", 1900, 1000),
    DRAGAO_NEGRO("Dragão Negro", 2400, 2000),
    CAVALEIRO_ELITE("Cavaleiro Elite", 2000, 1800),
    SAMURAI_LEAL("Samurai Leal", 1600, 1700);

    private final String nome;
    private final int ataque;
    private final int defesa;

    CartasDisponiveis(String nome, int ataque, int defesa) {
        this.nome = nome;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public CartaMonstro construirCarta() {
        return new CartaMonstroBuilder()
                .setNome(nome)
                .setAtaque(ataque)
                .setDefesa(defesa)
                .builder();
    }
}
