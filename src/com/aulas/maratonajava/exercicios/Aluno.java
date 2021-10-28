/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exercicios;

/**
 *
 * @author Marketing
 */
public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;
    
    
    public Aluno(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(this.seminario == null){
            System.out.println("Não associado a nenhum seminário");
        } else {
            System.out.println(this.seminario.getTitulo());
        }
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
    
    
}
