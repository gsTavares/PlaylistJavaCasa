/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes;

/**
 *
 * @author Marketing
 */
public class Pessoa {
    // Modificador de acesso private -> atributos só vão ser acessados pelo objeto
    // Métodos também podem receber modificadores de acesso
    
    private String nome;
    private int idade;
    
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
    }
    
    // Método set -> utilizado para atribuir valores aos atributos do objeto
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setIdade(int idade){
        if(idade < 0){
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }
    
    // Método get -> retorna um atributo específico do objeto
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
}
    
