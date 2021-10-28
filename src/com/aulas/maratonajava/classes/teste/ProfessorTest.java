/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.teste;

import com.aulas.maratonajava.classes.Professor;

/**
 *
 * @author Marketing
 */
public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        
        professor.nome = "Prof1";
        professor.idade = 23;
        professor.sexo = 'M';
        
        System.out.println(professor.nome+", "+professor.idade+" anos, sexo: "+professor.sexo);
    }
}
