/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exercicios;

/**
 *
 * @author Marketing
 */
public class Seminario {

    private String titulo;
    private Local local;
    private Aluno[] alunos;
    

    public Seminario(String titulo, Local local) {
        this.titulo = titulo;
        this.local = local;
    }

    public Seminario(String titulo, Local local, Aluno[] alunos) {
        this.titulo = titulo;
        this.local = local;
        this.alunos = alunos;
        
    }

    public void imprime() {
        System.out.println(this.titulo);
        if (this.local == null) {
            return;
        } else {
            System.out.println(this.local.getEndereco());

            for (Aluno aluno : this.alunos) {
                System.out.print(aluno.getNome() + " ");
            }
            
            System.out.println("");
            
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    

}
