/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class JogadorTeste {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romário");
        Jogador jogador3 = new Jogador("Cafu");
        
        // Armazenando jogadores em um array
        // Declarações

        // Jogador[] jogadores = new Jogador[3];
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        
        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
