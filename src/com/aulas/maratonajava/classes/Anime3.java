/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes;

/**
 *
 * @author Marketing
 */
public class Anime3 {
    private String nome;
    private static int[] episodios;
    
    // Bloco de incialização estático -> executado quando a JVM carregar a classe
    // Executado apenas uma vez, antes de alocar o espaço em memória para o objeto
    // O bloco não estático é executado toda vez que uma instância nova do objeto é criada
    
    static{
        System.out.println("Dentro do bloco de incialização estático");
        
        Anime3.episodios = new int[100];
        for (int i = 0; i < Anime3.episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime3() {
        for (int episodio : Anime3.episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println("");
    }

    public Anime3(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
