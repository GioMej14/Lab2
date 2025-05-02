/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras_Condicionales;

/**
 *
 * @author trigo
 */

import java.util.Scanner;
public class Mejia_Trigo_Tiempo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.print("Ingrese un número de segundos: ");
        int numeroSegundos = sc.nextInt();
        
        String mensaje = (numeroSegundos <= 0) ? "No se permite ese valor":"";
        
        if (!mensaje.isEmpty()) {
            System.out.println(mensaje);
        } else {
            int horas = numeroSegundos / 3600;
            int minutos = (numeroSegundos % 3600) / 60;
            int segundos = numeroSegundos % 60;
            
            System.out.println("Equivale a: " + horas + " hora(s), " + minutos + " minuto(s), " + segundos + " segundo(s).");
        }
            
        
    }
    
}
