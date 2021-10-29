/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exceptions;

/**
 *
 * @author Marketing
 */

// Exceção customizada
public class LoginInvalidoException extends Exception{

    public LoginInvalidoException() {
        super("Login inválido");
    }

    public LoginInvalidoException(String string) {
        super(string);
    }
    
}
