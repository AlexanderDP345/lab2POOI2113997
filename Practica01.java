package com.mycompany.practica01;

import java.util.Scanner;

public class Practica01 {
    public static void main(String[] args) {
        double currentSalary; // salario anual actual
        int performanceRating; // Calificación de desempeño (1=excelente, 2=bueno, 3=malo)
        double raise = 0; // monto en dólares del aumento

        Scanner scan = new Scanner(System.in);

        // Obtén el salario actual y la calificación de desempeño
        System.out.print("Ingrese el salario anual actual: ");
        currentSalary = scan.nextDouble();

        System.out.print("Ingrese la calificación de desempeño (1=excelente, 2=bueno, 3=malo): ");
        performanceRating = scan.nextInt();

        // Calcula el aumento basado en la calificación de desempeño
        if (performanceRating == 1) {
            raise = currentSalary * 0.06; 
// Aumento del 6% para calificación excelente
        } else if (performanceRating == 2) {
            raise = currentSalary * 0.04; 
// Aumento del 4% para calificación buena
        } else if (performanceRating == 3) {
            raise = currentSalary * 0.015; 
// Aumento del 1.5% para calificación mala
        } else {
            System.out.println("Calificación no válida. Debe ser 1, 2 o 3.");
            return; // Salir del programa si la calificación no es válida
        }

        // Calcula el nuevo salario
        double newSalary = currentSalary + raise;

        // Imprime el resultado
        System.out.println("Monto del aumento: $" + raise);
        System.out.println("Nuevo salario: $" + newSalary);
    }
}