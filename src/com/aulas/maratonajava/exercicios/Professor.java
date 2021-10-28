/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exercicios;

/**
 *
 * @author Marketing
 */
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;
   
    
    public Professor(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.especialidade);
        if(this.seminarios == null){
            System.out.println("Nenhum seminário");
        } else {
            for(Seminario seminario : this.seminarios){
                System.out.println(seminario.getTitulo());
                System.out.println(seminario.getLocal().getEndereco());
                if(seminario.getAlunos() == null || seminario.getAlunos().length == 0){
                    continue;
                }
                for(Aluno aluno : seminario.getAlunos()){
                    System.out.println("Aluno: "+aluno.getNome()+", idade: "+aluno.getIdade());
                }
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
    
    
}
