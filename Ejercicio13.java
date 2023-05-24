
/*
 * Ejercicio 13
 * Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
 * define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 * 
 * Ejercicio 14
 * Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
 */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] equipo = new String [5]; // Hasta aquí la parte del ejercicio 13
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el elemento de la posición " + i);
            equipo [i] = sc.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + equipo[i] + "]");
        }
        sc.close();
    }
}
