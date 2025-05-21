package org.example;

import org.example.carta.CartaMonstro;
import org.example.carta.CartaMonstroBuilder;
import org.example.jogador.Jogador;
import org.example.util.ResultadoBatalha;

public class Main {
    public static void main(String[] args) {
        Jogador caio = new Jogador("Caio");
        Jogador henrique = new Jogador("Henrique");

        caio.mostrarMao();
        henrique.mostrarMao();

        System.out.println("\nDuelo: ");
        ResultadoBatalha resultado = caio.getMonstro(0).batalhar(henrique.getMonstro(0));

        switch (resultado) {
            case VITORIA -> System.out.println("Caio venceu!");
            case DERROTA -> System.out.println("Henrique venceu!");
            case EMPATE -> System.out.println("Empate!");
        }
    }
}