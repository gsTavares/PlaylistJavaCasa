/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classesabstratas;

/**
 *
 * @author Marketing
 */

// Modificador abstract em classes -> faz com que a classe se torne um rascunho/template
// não podendo mais ser inicializada/concretizada
// Geralmente utilizada em super classes, que foram feitas para sere estendidas

// Nesse exemplo, Funcionário é uma classe abstrata e ao mesmo tempo subclasse de Pessoa,
// que também a abstrata. A classe Funcionário não necessariamente precisa sobrescrever os métodos
// abstratos de pessoa. Nesse caso, as subclasses de Funcionário que são concretas, precisam.

// Caso os métodos sejam sobrescritos em funcionário, as suas sobclasses não precisam implementar o método
// pois já o herdam por conta do extends

public abstract class Funcionario extends Pessoa{
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
    }
    
    // Método abstrato --> deve obrigatóriamente ser sobrescrito em todas as subclasses concretas
    // de Funcionário
    public abstract void calculaBonus();
    
    @Override
    public String toString() {
        return "Funcionario{" + "nome=" + nome + ", salario=" + salario + '}';
    }
    
    @Override
    public void imprime(){
        System.out.println("Imprimindo...");
    }
    
}
