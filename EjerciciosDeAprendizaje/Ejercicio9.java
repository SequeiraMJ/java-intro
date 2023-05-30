package EjerciciosDeAprendizaje;

/*
 * Ejercicio 9
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
 * es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
 * que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
 * la función Substring y equals() de Java.
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;
        System.out.println("Escribe una frase: ");
        frase = sc.nextLine();
        if (frase.charAt(0) == 'A') {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
        sc.close();
    }
}