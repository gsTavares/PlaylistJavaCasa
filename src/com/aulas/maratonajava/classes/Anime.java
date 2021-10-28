/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes;

/**
 *
 * @author Marketing
 */
public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio; // Novo atributo
    
    // Construtores
    // Declaração: public nomeDaClasse(parâmetros){}
    // Construtores também podem ser sobrecarregados
    
    public Anime(){
        
    }
    
    public Anime(String nome, String tipo, int episodios, String genero){
        this(); // Chamada de um construtor
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }
    
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    
    // Sobrecarga de método
    /**
    
    Exemplo utilizando o método public void init(argumentos){}
    
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
    }
    **/
    
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.estudio);
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getTipo(){
        return this.tipo;
    }
    
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    
    public int getEpisodios(){
        return this.episodios;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
}
