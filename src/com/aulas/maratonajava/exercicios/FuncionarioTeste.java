/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exercicios;

/**
 *
 * @author Marketing
 */
public class FuncionarioTeste {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        
        // funcionario.nome = "João";
        // funcionario.idade = 23;
        // funcionario.salarios = new double[]{200, 500, 300};
        
        funcionario.setNome("João");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{200, 500, 300});
        
        funcionario.imprimirDados();
        
    }
}
