
/*
 * Ejercicio 6
 * Implementar un programa que le pida dos números enteros al usuario y determine si ambos o
 * alguno de ellos es mayor a 25.
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        System.out.print("Ingrese el primer número: ");
        num1 = keyboard.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = keyboard.nextInt();
        keyboard.close();
        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos números son mayores a 25.");
        } else if (num1 > 25) {
            System.out.println("Sólo numero 1 es mayor a 25.");
        } else if (num2 > 25) {
            System.out.println("Sólo número 2 es mayor a 25");
        } else {
            System.out.println("Ninguno de los números es mayor a 25");
        }
        System.out.println("Fin!");
    }
}
