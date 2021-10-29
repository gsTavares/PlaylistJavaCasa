/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exceptions;

/**
 *
 * @author Marketing
 */

// Bloco finally -> sempre vai ser executado

public class RuntimeExceptionTeste3 {

    public static void main(String[] args) {
        abrircConexao2();

    }
    
    public static String abrircConexao(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "Conexão aberta";    
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
           System.out.println("Fechando recurso liberado pelo SO"); 
        }
        
        return null;
    }
    
    public static void abrircConexao2(){
        try {
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
             
        } finally{
           System.out.println("Fechando recurso liberado pelo SO"); 
        }
    }
}
