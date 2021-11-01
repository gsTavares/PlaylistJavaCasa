/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.IO;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Marketing
 */
// FileReader
// new FileReader(File file) --> recebe um arquivo pra leitura
// .read() --> retorna um valor ascII do primeiro caracter do arquivo;
// .read() --> retorna -1 quando chega no final do arquivo
// .read(char[] in) --> recebe um array de caracteres e armazena o valor asc no array; retorna
// a quantidade de caracteres lidos

public class FileReaderTeste {

    public static void main(String[] args) {
        File file = new File("file.txt");

        try (FileReader fr = new FileReader(file)) {
            /*
            char[] in = new char[30];
            fr.read(in);
            
            for(char c : in){
                System.out.print(c);
            }
                 
             */

            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
