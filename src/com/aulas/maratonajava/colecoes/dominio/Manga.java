/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.dominio;

import java.util.Objects;

/**
 *
 * @author Marketing
 */
public class Manga implements Comparable<Manga> {

    private Long id;
    private String nome;
    private double preco;
    private int quantidade;

    public Manga(Long id, String nome, double preco) {
        Objects.requireNonNull(id);
        Objects.requireNonNull(nome);
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Manga(Long id, String nome, double preco, int quantidade) {
        this(id, nome, preco);
        this.quantidade = quantidade;
    }

    @Override
    public int compareTo(Manga o) {
        // Regra
        // retorna negativo se this < o;
        // retorna 0 se this == o;
        // retorna positivo se this > o;

        // if(this.id < o.getId()){
        //    return -1;
        // } else if(this.id.equals(o.getId())  ){
        //    return 0;
        // } else {
        //    return 1;
        // }
        // Sort by id
        // return this.id.compareTo(o.getId());
        // Sort by preço
        // return Double.valueOf(preco).compareTo(o.getPreco());
        // return DOuble.compare(preco, o.getPreco());
        // Sort by nome
        return this.nome.compareTo(o.getNome());

    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Manga other = (Manga) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Manga{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + '}';
    }

}
