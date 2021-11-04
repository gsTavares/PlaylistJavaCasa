/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.seralization.dominio;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author Marketing
 */

// implements Serializable --> torna o objeto serializavel
public class Aluno implements Serializable{
    private static final long serialVersionUID = 7299102078980248664L;
    
    private Long id;
    private String nome;
    // transient --> torna o campo ignorável durante a serialização
    private transient String password;
    // Atributos estáticos não são serializados
    private static final String NOME_ESCOLA = "DevDojo";
    
    private transient Turma turma;
    

    public Aluno(Long id, String nome, String password) {
        this.id = id;
        this.nome = nome;
        this.password = password;
    }
    
    private void writeObject(ObjectOutputStream oos){
        try{
            
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void readObject(ObjectInputStream ois){
        try{
            
            ois.defaultReadObject();
            String nomeTurma = ois.readUTF();
            turma = new Turma(nomeTurma);
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    @Override
    public String toString() {
        return "Aluno{" + "id=" + id + ", nome=" + nome + ", password=" + password + ", nomeEscola ="+ NOME_ESCOLA+", Turma ="+turma+'}';
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
