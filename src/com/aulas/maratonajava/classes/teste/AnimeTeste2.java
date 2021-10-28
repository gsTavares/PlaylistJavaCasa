/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aulas.maratonajava.classes.teste;

import com.aulas.maratonajava.classes.Anime2;

/**
 *
 * @author Marketing
 */
public class AnimeTeste2 {
    public static void main(String[] args) {
        Anime2 anime = new Anime2();
        
        for(int episodio: anime.getEpisodios()){
            System.out.print(episodio + " ");
        }
    }
}
