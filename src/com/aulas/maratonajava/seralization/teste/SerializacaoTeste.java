/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.seralization.teste;

import com.aulas.maratonajava.seralization.dominio.Aluno;
import com.aulas.maratonajava.seralization.dominio.Turma;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author Marketing
 */
public class SerializacaoTeste {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L, "Henrique", "123456");
        Turma turma = new Turma("Maratona Java Virado no Jiraya");
        aluno.setTurma(turma);
        serializar(aluno);
        deserializar();
    }
    
    
    // Serializar --> Transformar um objeto em array de bytes
    private static void serializar(Aluno aluno){
        Path path = Paths.get("pasta_serial/aluno.ser");
        
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Faz a leitura de um objeto serializado
    // Não utiliza o construtor no momento da leitura (pode acontecer problemas com herança)
    private static void deserializar(){
        Path path = Paths.get("pasta_serial/aluno.ser");
        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))){
           Aluno aluno  = (Aluno)ois.readObject();
           System.out.println(aluno);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
