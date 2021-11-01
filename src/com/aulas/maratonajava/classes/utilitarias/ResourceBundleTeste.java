/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.utilitarias;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Marketing
 */
public class ResourceBundleTeste {
    // Internacionalização de mensagens usando arquivos .properties

    public static void main(String[] args) {
        ResourceBundle bundle = ResourceBundle.getBundle("messages" , new Locale("en", "US"));
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
        
        bundle = ResourceBundle.getBundle("messages" , new Locale("pt", "BR"));
        
        System.out.println(bundle.getString("hello"));
        System.out.println(bundle.getString("good.morning"));
    }

}
