/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica01;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Ejecicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número a evaluar: ");
        long n = sc.nextLong();

        System.out.println(n + " puede ser almacenado en:");

        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
            System.out.println("(*) byte");
        }
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.println("(*) short");
        }
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.println("(*) int");
        }
        if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
            System.out.println("(*) long");
        }

        if (n < Byte.MIN_VALUE || n > Long.MAX_VALUE) {
            System.out.println(n + " no se puede almacenar en ningún lado");
        }
    }
}    

