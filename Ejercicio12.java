
/*
 * Ejercicio 12
 * Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
 * que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
 * segundo, sino informe que no lo son.
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Por favor ingrese dos números: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        esMultiplo(num1, num2);
        sc.close();
    }
    public static void esMultiplo(int num1, int num2) {
        if (num1 % num2 == 0) {
            System.out.println("El número: " + num1 + " es múltiplo de: " + num2);
        } else {
            System.out.println("El número: " + num1 + " no es múltiplo de: " + num2);
        }
    }
}
