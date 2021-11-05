/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class BinarySearchTeste {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);
        
        // BinarySearch
        // Precisa de uma lista ordenada -> sortList
        
        Collections.sort(numeros);
        
        // index 0 1 2 3
        // value 0 2 3 4
        // Se o valor não for encontrado, retorna (-(index) -1);
        System.out.println(Collections.binarySearch(numeros, 1));

    }
}
