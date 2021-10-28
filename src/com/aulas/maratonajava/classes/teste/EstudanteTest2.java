/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.teste;

import com.aulas.maratonajava.classes.Estudante;
import com.aulas.maratonajava.classes.ImpressoraEstudante;

/**
 *
 * @author Marketing
 */
public class EstudanteTest2 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        
        estudante.nome = "Midorya";
        estudante.idade = 15;
        estudante.sexo = 'M';
        
        estudante2.nome = "Sakura";
        estudante2.idade = 16;
        estudante2.sexo = 'F';
        
        impressora.imprimir(estudante);
        impressora.imprimir(estudante2);
        
        
    }
}
