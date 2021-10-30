/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

/**
 *
 * @author Marketing
 */

// Teste de desempenho usando String, StringBuilder, StringBuffer

public class StringsTeste3 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        
        System.out.println("Tempo gasto para String "+(fim-inicio)+"ms");
        
        inicio = System.currentTimeMillis();
        concatStringBuilder(1000);
        fim = System.currentTimeMillis();
        
        System.out.println("Tempo gasto para StringBuilder "+(fim-inicio)+"ms");
        
    }
    
    private static void concatString(int tamanho){
        String texto = "";
        for(int i = 0; i < tamanho; i++){
            texto+=i;
        }
    }
    
    private static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
    
    private static void concatStringBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for(int i = 0; i < tamanho; i++){
            sb.append(i);
        }
    }
}
