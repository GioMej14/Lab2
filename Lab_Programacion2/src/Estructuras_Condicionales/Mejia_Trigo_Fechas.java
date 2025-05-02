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

public class Mejia_Trigo_Fechas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingresar fecha 1 (DD/MM/AAAA): ");
        String fecha1 = sc.nextLine();
        
        System.out.print("Ingresar fecha 2 (DD/MM/AAAA): ");
        String fecha2 = sc.nextLine();
        
        int dia1 = Integer.parseInt(fecha1.substring(0, 2));
        int mes1 = Integer.parseInt(fecha1.substring(3, 5));
        int anio1 = Integer.parseInt(fecha1.substring(6, 10));
        
        int dia2 = Integer.parseInt(fecha2.substring(0, 2));
        int mes2 = Integer.parseInt(fecha2.substring(3, 5));
        int anio2 = Integer.parseInt(fecha2.substring(6, 10));
        
        int totalDias1 = anio1 * 360 + mes1 * 30 + dia1;
        int totalDias2 = anio2 * 360 + mes2 * 30 + dia2;
        
        int diferencia;

        if (totalDias1 > totalDias2) {
            diferencia = totalDias1 - totalDias2;
        } else {
            diferencia = totalDias2 - totalDias1;
        }
        
        System.out.println("\nLa diferencia entre las dos fechas es de " + diferencia + " día(s).");
        
        
    }
}
