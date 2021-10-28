/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exercicios;

/**
 *
 * @author Marketing
 */
public class Funcionario {

    // public String nome = null;
    // public int idade = 0;
    // public double[] salarios = null;
    
    // Atualização do exercício, utilizando modificadores de acesso, gets e setters
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        
        if(salarios == null){
            return;
        } else {
            for (double i : salarios) {
                System.out.println("Salário: " + i);
            }
            
            calcularMediaSalarios();
        }
        
       
            
        

    }

    public void calcularMediaSalarios() {
        double soma = 0;

        if (salarios == null) {
            return;
        } else {
            for (double i : salarios) {
                soma += i;
            }

            this.media = soma / 3;
        }

        System.out.println("Média dos três salários = R$ " + this.media);
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

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
    
    
}
