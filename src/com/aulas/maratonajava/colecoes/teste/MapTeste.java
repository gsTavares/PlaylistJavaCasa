/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.colecoes.teste;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Marketing
 */
public class MapTeste {

    public static void main(String[] args) {
        // Map<k, v> --> k: chave; v: valor
        // HashMap<>() --> ordena os valores de acordo com o hash do objeto
        // Primeira regra do Map: não existem chaves duplicadas

        // Se uma chave é duplicada durante a implementação, o seu valor é sobrescrito
        
        // LinkedHashMap<> --> mantém a ordem de inserção usando hash;
        
        Map<String, String> map = new HashMap<>();

        // Adicionar valores: map.put();
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("vc2", "vc");

        System.out.println(map);
        System.out.println("------------------");
        // Iteração : pode ser via chave ou valor
        
        // Por chave
        for(String key : map.keySet()){
            System.out.println(key + ": "+map.get(key));
        }
        
        System.out.println("------------------");
        
        // Por valor
        for(String value : map.values()){
            System.out.println(value);
        }
        
        System.out.println("-----------------");
        
        // Com os dois ao mesmo tempo
        for(Map.Entry<String, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
}
