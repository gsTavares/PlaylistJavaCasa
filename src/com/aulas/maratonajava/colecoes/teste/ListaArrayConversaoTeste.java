/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Marketing
 */
public class ListaArrayConversaoTeste {
    public static void main(String[] args) {
        
        // Conserção List<> --> array[]/ array[] --> List<>
        
        List<Integer> numeros = new ArrayList<>();
        
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        
        // ArrayList<> para Array
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        
        
        Integer[] numerosArray = new Integer[3];
        
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;
        
        // Array para ArrayList<>
        // Obs.: o método asList é imutável, ou seja, cria um link com o array original. Qualquer ateração feita no ArrayList<> afeta também o array
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        
        arrayToList.set(0, 12);
        
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        
        System.out.println("--------------");
        
        // Para realizar alterações com a conversão array->list: passar o array no construtor
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        
        numerosList.add(15);
        
        System.out.println(numerosList);
    }
}
