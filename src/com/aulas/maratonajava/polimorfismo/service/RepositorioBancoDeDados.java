/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.polimorfismo.service;

import com.aulas.maratonajava.polimorfismo.repositorio.Repositorio;

/**
 *
 * @author Marketing
 */
public class RepositorioBancoDeDados implements Repositorio{
    @Override
    public void salvar() {
        System.out.println("Salvando no banco de dados");
    }
}
