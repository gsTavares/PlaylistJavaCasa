/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.polimorfismo.teste;

import com.aulas.maratonajava.polimorfismo.model.Computador;
import com.aulas.maratonajava.polimorfismo.model.Produto;
import com.aulas.maratonajava.polimorfismo.model.Tomate;
import com.aulas.maratonajava.polimorfismo.service.CalculadoraImposto;

/**
 *
 * @author Marketing
 */
public class ProdutoTeste3 {
    
    public static void main(String[] args) {
        
        // Varíavel de refência a um modelo genérico recebendo o endereço de um objeto mais específico
        Produto produto = new Computador("Ryzen 9", 3000);
        
        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");
        
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("--------------------------------------");
        CalculadoraImposto.calcularImposto(produto);
        
    }
}
