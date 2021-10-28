/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes;

/**
 *
 * @author Marketing
 */
public class Estudante {
    public String nome;
    public int idade;
    public char sexo;
    
    // Método de impressão usando auto referência
    public void imprime(){
        System.out.println("-----------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
