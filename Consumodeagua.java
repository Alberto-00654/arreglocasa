/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consumodeagua;

/**
 *
 * @author Usuario
 */
public class Consumodeagua {

    public static void main(String[] args) {
        System.out.println("Hello World!");
         int [][]aguac = {
            {100, 50, 30, 120, 60},
            {32, 122, 46, 80, 90},
            {45, 100, 56, 26, 36},
            {6, 110, 72, 33, 40},
        };
        System.out.println("por casa");
        Consumodeagua.consumoPorCasa(aguac);
        System.out.println("pPor dia");
        Consumodeagua.consumoPorDia(aguac);
    }
    public static void consumoPorCasa (int[][]casas){
        for (int i = 0; i < casas.length; i++) {
            int suma = 0;
            for (int j = 0; j < casas[i].length; j++) {
                suma += casas[i][j]; 
                
            }
            System.out.println(suma);
        }
    
    
    
    }
    
    public static void consumoPorDia (int[][]casasd){
        for (int j = 0; j < casasd[0].length; j++) {
            int suma = 0;
            for (int i = 0; i < casasd.length; i++) {
                suma += casasd[i][j]; 
                
            }
            System.out.println(suma);
        
                
                
            }
        }}

    

