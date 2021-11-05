/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import com.aulas.maratonajava.colecoes.dominio.Smartphone;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class SmartphoneListTeste {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1AABC1", "iPhone");
        Smartphone s2 = new Smartphone("222222", "Pixel");
        Smartphone s3 = new Smartphone("333333", "Samsung");
        
        List<Smartphone> smartphones = new ArrayList<>();
        
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);
        
        
        
        
        // Limpar o ArrayList<>;
        // smartphones.clear();
        
        for(Smartphone phone : smartphones){
            System.out.println(phone);
        }
        
        
        
        Smartphone s4 = new Smartphone("222222", "Pixel");
        smartphones.add(s4);
        
        // Verifica se um objeto da lista já existe
        System.out.println(smartphones.contains(s4));
        
        // Retornar o índice de um objeto
        System.out.println("Indice: "+smartphones.indexOf(s4));
        System.out.println("Indice: "+smartphones.get(smartphones.indexOf(s4)));
        
        // Sort de uma lista de objetos
        

    }
}
