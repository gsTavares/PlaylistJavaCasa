/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.associacao.classes;

/**
 *
 * @author Marketing
 */
public class EscolaTeste {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor professor2 = new Professor("Kakashi Sensei");
        
        Professor[] professores = {professor, professor2};
        Escola escola = new Escola("Konoha", professores);
        
        escola.imprime();
    }
}
