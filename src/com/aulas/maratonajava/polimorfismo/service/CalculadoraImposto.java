/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.polimorfismo.service;

import com.aulas.maratonajava.polimorfismo.model.Computador;
import com.aulas.maratonajava.polimorfismo.model.Produto;
import com.aulas.maratonajava.polimorfismo.model.Tomate;

/**
 *
 * @author Marketing
 */
public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getValor());
        System.out.println("Imposto a ser pago: " + imposto);
        
        // produto instanceof Tomate --> se o produto é uma referência para um objeto do tipo tomate,
        // então crie uma variável de referência do tipo Tomate que receba a mesma referência passada
        // por parâmetro
        
        if (produto instanceof Tomate) {
            
            // Casting para forçar o produto que está sendo passado por parâmetro ser uma referência
            // válida para o objeto tomate 
            Tomate tomate = (Tomate) produto;
            // Outra chamada para esse casting 
            // ((Tomate)produto).getDataValidade();
            
            System.out.println(tomate.getDataValidade());
        }

    }

}
