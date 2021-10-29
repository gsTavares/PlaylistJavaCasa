/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exceptions;

import java.io.FileNotFoundException;

/**
 *
 * @author Marketing
 */
public class Funcionario extends Pessoa{
    
    // Em sobrescrita de método, não é obrigatório declara as exceções novamente
    // É válido, por exemplo, adicionar apenas 1 das exceções
    // Ou declarar mais exceções do tipo Runtime
    
    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando funcionario");
    }
}
