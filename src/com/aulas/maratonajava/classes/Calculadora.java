/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes;

/**
 *
 * @author Marketing
 */
public class Calculadora {
    
    
    // Métodos
    // Construção: mod de acesso <tipo_retorno> nomeMetodo(argumentos/parametros){}
    
    public void somarDoisNumeros(){
        System.out.println(10+10);
    }
    
    public void subtrairDoisNumeros(){
        System.out.println(21-2);
    }
    
    public void multiplicarDoisNumeros(int num, int num2){
        System.out.println(num * num2);
    }
    
    public double dividirDoisNumeros(double num1, double num2){
        
        if(num2 == 0){
            return 0;
        }
        
        return num1/num2;   
    }
    
    public void alterarDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
    
    public void somarArray(int[] numeros){
        int soma = 0;
        
        for(int num: numeros){
            soma += num;
        }
        
        System.out.println(soma);
    }
    
    // Utilizando varargs
    // Sintaxe --> <tipo>... parâmetros
    // Se existir mais de um parâmetro, o varargs precisa ser o último deles
    public void somarVarArgs(int... numeros){
        int soma = 0;
        
        for(int num: numeros){
            soma+= num;
        }
        
        System.out.println(soma);
        
    }
}
