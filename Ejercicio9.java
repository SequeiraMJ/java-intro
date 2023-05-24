
/*
 * Ejercicio 9
 * Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
 * bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
 * el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
 * Nota: recordar el uso de la sentencia break.
 */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma;
        suma = 0;
        do {
            System.out.print("Ingrese un numero: ");
            num = sc.nextInt();
            if (num > 0) {
                suma += num;
            }
        } while (num != 0);
        System.out.print("La suma de los números ingresados es: " + suma);
        sc.close();
    }
}
