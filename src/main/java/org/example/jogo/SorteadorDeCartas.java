package org.example.jogo;

import org.example.carta.CartaMonstro;
import org.example.jogador.CartasDisponiveis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SorteadorDeCartas {
    public static List<CartaMonstro> sortear(int quantidade) {
        List<CartasDisponiveis> cartasDisponiveis = new ArrayList<>(List.of(CartasDisponiveis.values()));
        Collections.shuffle(cartasDisponiveis);
        List<CartaMonstro> mao = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            mao.add(cartasDisponiveis.get(i).construirCarta());
        }
        return mao;
    }
}
