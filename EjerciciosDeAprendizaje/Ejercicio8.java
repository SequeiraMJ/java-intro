package EjerciciosDeAprendizaje;

/*
 * Ejercicio 8
 * Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
 * el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
 * pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
 * investigar la función Lenght() en Java.
 */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = "";
        do {
            System.out.print("Escribe una frase de 8 caracteres: ");
            frase = sc.nextLine();
            if (frase.length() == 8) {
                System.out.println("CORRECTO");
            } else {
                System.out.println("INCORRECTO");
            }
        } while (frase != "");
        sc.close();
    }
}