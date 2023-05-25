package EjerciciosDeAprendizaje;

/*
 * Ejercicio 2
 * Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
 * pantalla.
 */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("Escribe tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre);
        sc.close();
    }
}
