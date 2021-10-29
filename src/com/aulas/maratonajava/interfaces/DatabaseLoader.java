/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.interfaces;

/**
 *
 * @author Marketing
 */
public class DatabaseLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }
    
    @Override
    public void remove(){
        System.out.println("Removendo do banco de dados");
    }
    
    @Override
    public void chekPermission() {
        System.out.println("Checando permissões no banco de dados");
    }
    
    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retrieveMaxDataSize na DatabaseLoader");
    }
    
}
