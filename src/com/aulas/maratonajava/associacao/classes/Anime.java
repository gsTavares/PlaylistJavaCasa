/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class Anime {

    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }
    
    // Sobrescrita de métodos
    // 1 - Adicionar @Override
    // 2 - O nome do método deve ser exatamente igual ao da super classe
    @Override
    public String toString() {
        return "Anime{" + "nome=" + nome + '}';
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
