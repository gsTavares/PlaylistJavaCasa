/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.interfaces;

/**
 *
 * @author Marketing
 */
public class DataLoaderTeste {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        
        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();
        
        databaseLoader.chekPermission();
        fileLoader.chekPermission();
        
        databaseLoader.retriveMaxDataSize();
        DataLoader.retriveMaxDataSize();
    }
}
