/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author Marketing
 */
public class QueueTeste {
    public static void main(String[] args) {
        Queue<String> fila = new PriorityQueue<>();
        
        fila.add("C");
        fila.add("A");
        fila.add("B");
        
        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
        
        fila.peek(); // Mostra sempre o primeiro elemento da lista, sem removê-lo
        fila.poll(); // Mostra e remove o primeiro elemento da fila (semelhante ao remove();)
        
        for(String s : fila){
            System.out.println(s);
        }
    }
}
