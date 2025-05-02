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
public class Mejia_Trigo_Pagos {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        sc.useDelimiter("\n");
        
        System.out.print("Ingrese código de empleado: ");
        int codigo = sc.nextInt();
        
        System.out.print("Ingrese nombre del empleado: ");
        String nombre = sc.nextLine();
        
        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = sc.nextLine();
        
        System.out.print("Ingrese cantidad de horas del trabajador: ");
        int horasTrabajadas = sc.nextInt();
        
        System.out.print("Ingrese la categoría del empleado (1-4): ");
        int categoria = sc.nextInt();
        
        System.out.println("Información de categoría: ");
        switch (categoria){
            case 1: 
                System.out.println("Categoría - 1: $40 por hora extra");
                break;
            case 2: 
                System.out.println("Categoría - 2: $50 por hora extra");
                break;
            case 3: 
                System.out.println("Categoría - 3: $85 por hora extra");
                break;
            case 4: 
                System.out.println("Categoría - 4: $0 por hora extra (No recibe pago extra)");
                break;
            default: 
                System.out.println("Categoría no valida");
        }
        
        double pagoHorasNormales = 35.99;
        int horasExtras = 0;
        int horasNormales = 0;
        
        if (horasTrabajadas <= 40){
            horasNormales = horasTrabajadas;
        } else { 
            horasNormales = 40;
        }
        
        if (horasTrabajadas > 40){
            horasExtras = horasTrabajadas - 40;
        } if (horasExtras > 15){
            horasExtras = 15;
        } else {
            horasExtras = 0;
        }
        
        double pagoHorasExtras = 0;
        
        switch (categoria){
            case 1 -> pagoHorasExtras = 40;
            case 2 -> pagoHorasExtras = 50;
            case 3 -> pagoHorasExtras = 85;
            case 4 -> pagoHorasExtras = 0;  
        }
        
        double pagoTotal = (horasTrabajadas * pagoHorasNormales) + (horasExtras * pagoHorasExtras);
        
        System.out.println("**** Boleta de pago ****");
        System.out.println("Codigo del empleado: " + codigo);
        System.out.println("Nombre: "+ nombre + " " + apellido);
        System.out.println("Cantidad de horas normales trabajadas: "+ horasTrabajadas);
        System.out.println("Cantidad de horas extras: " + horasExtras);
        System.out.println("Pago total: $ " + pagoTotal);
    }
}
