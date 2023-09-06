
package com.mycompany.practica01;

public class ejercicio4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Por favor, ingrese un año como argumento.");
            return;
        }

        try {
            int year = Integer.parseInt(args[0]);
            int identifier = year % 12;

            String animal;

            switch (identifier) {
                case 0:
                    animal = "Mono";
                    break;
                case 1:
                    animal = "Gallo";
                    break;
                case 2:
                    animal = "Perro";
                    break;
                case 3:
                    animal = "Cerdo";
                    break;
                case 4:
                    animal = "Rata";
                    break;
                case 5:
                    animal = "Buey";
                    break;
                case 6:
                    animal = "Tigre";
                    break;
                case 7:
                    animal = "Conejo";
                    break;
                case 8:
                    animal = "Dragón";
                    break;
                case 9:
                    animal = "Serpiente";
                    break;
                case 10:
                    animal = "Caballo";
                    break;
                default:
                    animal = "Año no válido";
            }

            System.out.println("El año " + year + " corresponde al zodíaco chino del " + animal);
        } catch (NumberFormatException e) {
            System.out.println("Ingrese un año válido como argumento.");
        }
    }
}