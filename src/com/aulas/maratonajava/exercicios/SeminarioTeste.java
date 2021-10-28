/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exercicios;

/**
 *
 * @author Marketing
 */
public class SeminarioTeste {
    public static void main(String[] args) {
        Local local = new Local("Praça da Matriz, Fernandópolis - SP");
        Professor professor = new Professor("João", "Português");
        Aluno aluno = new Aluno("Gustavo", 19);
        Aluno aluno2 = new Aluno("Ricardo", 16);
        Aluno aluno3 = new Aluno("Maria", 22);
        Aluno[] alunos = {aluno, aluno2, aluno3};
       
        
        Seminario seminario = new Seminario("Seminário piloto", local, alunos);
        Seminario[] seminarios = {seminario};
        
        professor.setSeminarios(seminarios);
        aluno.setSeminario(seminario);
        aluno2.setSeminario(seminario);
        aluno3.setSeminario(seminario);
        
        
        System.out.println("--- Seminário ---");
        seminario.imprime();
        System.out.println("--- Professor ---");
        professor.imprime();
        System.out.println("--- Alunos ---");
        aluno.imprime();
        System.out.println("--------------------");
        aluno2.imprime();
        System.out.println("--------------------");
        aluno3.imprime();
        
        
        
        
    }
}
