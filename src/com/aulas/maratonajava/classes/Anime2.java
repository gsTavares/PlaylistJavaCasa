/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes;

/**
 *
 * @author Marketing
 */
public class Anime2 {

    private String nome;
    private int[] episodios;
    // Blocos de incialização -> sempre são executados antes do construtor
    // A inicialização dos objetos acontece antes da sua própria construção

    // Ordem de criação do objeto
    // 1- Alocado espaço em memória pro objeto
    // 2- Cada atributo da classe é criado e incializado
    // 3- Bloco de incialização é executado
    // 4- Construtor é executado
    // Sintaxe do bloco de inicialização: {}
    {
        this.episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime2() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }

        System.out.println("");
    }

    public Anime2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

}
