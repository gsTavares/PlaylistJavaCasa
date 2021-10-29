/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exceptions;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Marketing
 */
public class ExceptionTest {
    public static void main(String[] args) {
        criarNovoArquivo();
    }
    
    private static void criarNovoArquivo(){
        File file = new File("arquivo\\teste.txt");
        
        // Lançamento de IO exception
        
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException e) { 
            e.printStackTrace();
        }
        
        
    }
}
