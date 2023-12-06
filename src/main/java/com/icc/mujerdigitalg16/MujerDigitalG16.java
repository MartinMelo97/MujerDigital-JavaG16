/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.icc.mujerdigitalg16;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author martinmelogodinez
 */
public class MujerDigitalG16 {

    public static void main(String[] args) {
        // Vamos a recibir una serie de calificaciones desde el teclado
        // separadas por comas y con ellas debemos de calcular lo siguiente
        // 1. Promedio
        // 2. Mediana
        // 3. Calificación más baja
        // 4. Calififación más alta
        // 5. Moda (tarea)
        
        // A) Recibir las calificaciones desde el teclado
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dame las calificaciones separadas por comas");
        String calificacionesInput = scanner.nextLine();
        
        // B) Convertir un string en un array.
        String[] calificacionesArray = calificacionesInput.split(",");
        System.out.println("Calificaciones Array: " + Arrays.toString(calificacionesArray));
        
        // C) Convertir el arreglo de string a un arreglo de números
        int[] calificaciones = Arrays.stream(calificacionesArray).mapToInt(Integer::parseInt).toArray();
        System.out.println("Calificaciones: " + Arrays.toString(calificaciones));
        
        // D) Calcular promedio
        int noCalificaciones = calificaciones.length;
        
        double totalCalificaciones = 0;
        for(int i = 0; i < noCalificaciones; i++) {
            int calificacionActual = calificaciones[i];
            totalCalificaciones += calificacionActual;
        }
        
        double promedio = totalCalificaciones / noCalificaciones;
        System.out.println("El promedio es: " + promedio);
        
        // E) Calcular la mediana.
        Arrays.sort(calificaciones);
        System.out.println("Calificaciones ordenadas: " + Arrays.toString(calificaciones));
        
        double mediana = 0;
        if (noCalificaciones % 2 == 0) {
            double num1 = calificaciones[(noCalificaciones / 2) - 1];
            double num2 = calificaciones[(noCalificaciones / 2)];
            mediana = (num1 + num2) / 2;
        } else {
            int mitad = (noCalificaciones + 1) / 2;
            mediana = calificaciones[mitad - 1];
        }
        System.out.println("La mediana es: " + mediana);
        
        
       // F) Moda - TAREA
       
       // G) - Calificación más baja
       int califBaja = calificaciones[0];
       System.out.println("La calificación más baja es: " + califBaja);
       
       // H) - Calificación más alta
       int califAlta = calificaciones[noCalificaciones - 1];
       System.out.println("La calificación más alta es: " + califAlta);
       
    }
}
