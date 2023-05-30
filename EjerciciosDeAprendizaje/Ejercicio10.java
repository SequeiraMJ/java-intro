package EjerciciosDeAprendizaje;

/*
 * Ejercicio 10
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
 * solicite números al usuario hasta que la suma de los números introducidos supere el
 * límite inicial.
 */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma, lim, num;
        suma = 0;
        System.out.print("Escribe el número límite: ");
        lim = sc.nextInt();
        do {
            System.out.print("Escribe un número: ");
            num = sc.nextInt();
            suma += num;
        } while (suma < lim);
        sc.close();
    }
}