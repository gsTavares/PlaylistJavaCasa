/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.interfaces;

/**
 *
 * @author Marketing
 */

// Palavra resevada 'implements' -> utilizada para associar uma interface à uma classe
// Classes podem implementar mais de uma interface

public class FileLoader implements DataLoader, DataRemover{
    
    @Override
    public void load(){
        System.out.println("Carregando dados de um arquivo");
    }
    
    @Override
    public void remove(){
        System.out.println("Deletando dados de um arquivo");
    }

    @Override
    public void chekPermission() {
        System.out.println("Checando permissões no arquivo");
    }
    
    
}
