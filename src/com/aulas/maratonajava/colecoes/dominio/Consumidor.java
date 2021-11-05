/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.dominio;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Marketing
 */
public class Consumidor {
    private Long id;
    private String nome;

    public Consumidor(String nome) {
        // Id automático
        this.id = ThreadLocalRandom.current().nextLong(0, 100000);
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Consumidor{" + "id=" + id + ", nome=" + nome + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
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
        final Consumidor other = (Consumidor) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
    
}
