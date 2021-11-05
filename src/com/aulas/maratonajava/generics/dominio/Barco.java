/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.dominio;

/**
 *
 * @author Marketing
 */
public class Barco {
    private String nome;

    public Barco(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Barco{" + "nome=" + nome + '}';
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}
