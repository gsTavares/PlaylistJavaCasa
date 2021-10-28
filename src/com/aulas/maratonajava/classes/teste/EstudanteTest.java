/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.teste;

import com.aulas.maratonajava.classes.Estudante;

/**
 *
 * @author Marketing
 */
public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        
        estudante.nome = "Teste";
        estudante.idade = 23;
        estudante.sexo = 'M';
        
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
