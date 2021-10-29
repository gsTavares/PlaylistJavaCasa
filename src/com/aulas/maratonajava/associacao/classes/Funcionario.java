/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */

// Herança --> o funcionário "é" uma pessoa
// Palavra reservada extends
// Agora o funcionário tem os mesmos atributos e métodos da classe pessoa
// Herança múltipla: não existe no Java

public class Funcionario extends Pessoa{
    private double salario;
    static{
        System.out.println("Dentro do bloco de inicialização estático de funcionario");
        
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario 2");
    }
    
    // Construtores com herança
    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionário");
    }
    
    // Método sobrescrito
    @Override
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    
    public void imprimirRelatorioPagamento(){
        System.out.println("Eu, "+this.nome+", declaro que recebi R$ "+this.salario);
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
