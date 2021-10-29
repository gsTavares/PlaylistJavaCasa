/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.polimorfismo.teste;

import com.aulas.maratonajava.polimorfismo.model.Computador;
import com.aulas.maratonajava.polimorfismo.model.Televisao;
import com.aulas.maratonajava.polimorfismo.model.Tomate;
import com.aulas.maratonajava.polimorfismo.service.CalculadoraImposto;

/**
 *
 * @author Marketing
 */
public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10I7", 11000);
        Tomate tomate = new Tomate("Tomate ciciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);
        
        CalculadoraImposto.calcularImposto(computador);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------------");
        CalculadoraImposto.calcularImposto(tv);
        
    }
}
