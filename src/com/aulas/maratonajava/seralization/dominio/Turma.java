/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.seralization.dominio;

/**
 *
 * @author Marketing
 */
public class Turma {
    private String nome;

    @Override
    public String toString() {
        return "Turma{" + "nome=" + nome + '}';
    }
    
    

    public Turma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
