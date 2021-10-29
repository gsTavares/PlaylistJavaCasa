/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.exceptions;

import java.util.Scanner;

/**
 *
 * @author Marketing
 */
public class LoginInvalidoTeste {
    public static void main(String[] args) {
        try {
            logar();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void logar() throws LoginInvalidoException{
        Scanner ler = new Scanner(System.in);
        String username = "Goku";
        String senha = "ssj";
        
        System.out.println("Usuario");
        String usernameInput = ler.nextLine();
        System.out.println("Senha");
        String senhaInput = ler.nextLine();
        
        if(!usernameInput.equals(username) || !senhaInput.equals(senha)){
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        } else {
            System.out.println("Usuario logado com sucesso");
        }
    }
}
