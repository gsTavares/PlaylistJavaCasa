/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes;

/**
 *
 * @author Marketing
 */
public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadeLimite = 250;
    
    // Modificador static: faz com que um atributo se torne padrão para o objeto como um todo
    // e não às suas instâncias
    
    public Carro(String nome, double velocidadeMaxima){
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Velocidade máxima: "+this.velocidadeMaxima);
        System.out.println("Velocidade limite: "+Carro.velocidadeLimite);
    }
    
    // Métodos estáticos
    public static void setVelocidadeLimite(double velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }
    
    public static double getVelocidadeLimite(){
        return Carro.velocidadeLimite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    
    
}
