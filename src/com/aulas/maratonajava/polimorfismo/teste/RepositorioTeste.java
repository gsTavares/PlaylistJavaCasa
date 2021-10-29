/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.polimorfismo.teste;

import com.aulas.maratonajava.polimorfismo.repositorio.Repositorio;
import com.aulas.maratonajava.polimorfismo.service.RepositorioBancoDeDados;

/**
 *
 * @author Marketing
 */
public class RepositorioTeste {
    public static void main(String[] args) {
        
        // Polimorfismo aplicado em interfaces
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();
    }
}
