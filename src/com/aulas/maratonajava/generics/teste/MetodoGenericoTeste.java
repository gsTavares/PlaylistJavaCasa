/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.generics.teste;

import com.aulas.maratonajava.generics.dominio.Barco;
import com.aulas.maratonajava.generics.dominio.Carro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */

// Outro exemplo de classes genéricas

//class VariosAtributos<T,X,I>{
//    private T t;
//    private X x;
//    private I i;
//
//    public VariosAtributos(T t, X x, I i) {
//        this.t = t;
//        this.x = x;
//        this.i = i;
//    }
//    
//    
//}

public class MetodoGenericoTeste {
    public static void main(String[] args) {
        // new VariosAtributos<Cachorro, Gato, Carro>
        List<Barco> barcos = criarArrayComUmObjeto(new Barco("Canoa Marota"));
        System.out.println(barcos);
       
    }
    
    // Métodos genéricos
    // O tipo (<tipo>) vem depois do modificador de acesso e antes do tipo de retorno
    private static <T> List<T> criarArrayComUmObjeto(T t){
        List<T> list = new ArrayList<>();
        list.add(t);
        
        return list;
    }
}
