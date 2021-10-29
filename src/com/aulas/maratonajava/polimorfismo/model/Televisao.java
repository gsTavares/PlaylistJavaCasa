/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.polimorfismo.model;

/**
 *
 * @author Marketing
 */
public class Televisao extends Produto{
    
    public static final double IMPOSTO = 0.21;
    
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da televisão");
        return this.valor * IMPOSTO;
    }
    
    
}
