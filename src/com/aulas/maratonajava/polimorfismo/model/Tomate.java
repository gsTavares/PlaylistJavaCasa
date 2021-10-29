/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.polimorfismo.model;

/**
 *
 * @author Marketing
 */
public class Tomate extends Produto{

    public static final double IMPOSTO = 0.06;
    private String dataValidade;
    
    public Tomate(String nome, double valor) {
        super(nome, valor);
    }
    
    @Override
    public double calcularImposto(){
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    
    
    
    
}
