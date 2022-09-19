/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.resenasjuegos.catalogojuegos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author mawe
 */
public class CatalogoJuegos {

    public static void main(String[] args) {
        List<JuegoPC> listaJuegos = new ArrayList<JuegoPC>();
        
        //Agregar juegos a la lista
        
        for (int i=0; i < listaJuegos.size(); i++) {
            System.out.println(listaJuegos.get(i).getTitulo());
        }
        
    }
}
