package org.example.jogador;

import org.example.carta.CartaMonstro;
import org.example.jogo.SorteadorDeCartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Jogador {
    private String nome;
    private List<CartaMonstro> mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = SorteadorDeCartas.sortear(6);
    }

    public void mostrarMao() {
        System.out.println("Cartas de " + nome + ":");
        for (CartaMonstro cartaMonstro : mao) {
            cartaMonstro.exibir();
        }
    }

    public CartaMonstro getMonstro(int index) {
        return mao.get(index);
    }

    public String getNome() {
        return this.nome;
    }
}
