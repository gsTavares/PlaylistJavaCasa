/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class Jogador {
    private String nome;
    private Time time; 
    // Associação unidirecional - Um pra muitos
    // Um jogador pertence a um time
    // Um time possui vários jogadores
                        
    
    public Jogador(){
        
    }
    
    public Jogador(String nome){
        this.nome = nome;
    }
    
    public void imprime(){
        System.out.println(this.nome);
        if(this.time != null){
            System.out.println(this.time.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    
    
    
}
