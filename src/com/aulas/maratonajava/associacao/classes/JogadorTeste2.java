/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class JogadorTeste2 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção brasileira");
        
        jogador1.setTime(time);
        jogador1.imprime();
        
    }
}
