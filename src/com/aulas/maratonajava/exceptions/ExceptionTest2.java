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
public class ExceptionTest2 {
    public static void main(String[] args)throws IOException{
        criarNovoArquivo();
    }
    
    public static void criarNovoArquivo() throws IOException{
        File file = new File("arquivo\\teste.txt");
        
        // Lançamento de IO exception
        
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+isCriado);
        } catch (IOException e) { 
            e.printStackTrace();
            throw e;
        }
        
        
    }
}
