/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.IO;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Marketing
 */
public class FileTeste2 {
    public static void main(String[] args) throws IOException{
        
        // Criação de diretório

        File fileDiretorio = new File("pasta");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
        
        // Gravação de arquivo dentro do diretório
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println(isFileCreated);
        
        // Renomeando arquivo
        File fileRenamed = new File(fileDiretorio, "arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println(isRenamed);
        
        // Renomeando diretório
        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenamed = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println(isDiretorioRenamed);
    }
}
