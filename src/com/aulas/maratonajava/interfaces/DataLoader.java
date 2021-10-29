/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.aulas.maratonajava.interfaces;

/**
 *
 * @author Marketing
 */

// Interfaces são utilizadas para criar vínculos de implementação com as classes do projeto
// Guardam métodos públicos e abstratos, ou seja, qualquer classe que implmente uma interface
// deve obrigatoriamente sobrescrever esses métodos

public interface DataLoader {
    void load();
    
    // Método com implementação na interface
    default void chekPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
