/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class Escola {

    private String nome;
    private Professor[] professores;
    // Associação unidirecional - Muitos pra um
    // Uma escola possui vários professores
    // Os professores trabalham pra uma única escola

    public Escola() {

    }

    public Escola(String nome) {
        this.nome = nome;
    }

    public Escola(String nome, Professor[] professores) {
        this.nome = nome;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void imprime() {
        System.out.println(this.nome);
        if (professores == null) {
            return;
        } else {
            for (Professor professor : professores) {
                System.out.println(professor.getNome());
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

}
