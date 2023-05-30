package EjerciciosDeAprendizaje;

/*
 * Ejercicio 12
 * Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
 * dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
 * fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que 
 * ser X y el último tiene que ser una O. 
 * Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
 * especial “&&&&&” marca el final de los envíos (llámese FDE), y toda secuencia distinta
 * de FDE, que no respete el formato se considera incorrecta. 
 * Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas 
 * e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
 * siguientes funciones de Java Substring(), Length(), equals().
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada = "";
        boolean valida = false;
        int correctas = 0, incorrectas = 0;
        System.out.println("Inicie la transmisión de datos...");
        do {
            entrada = sc.nextLine();
            valida = validarEntrada(entrada);
            if (valida) {
                correctas += 1;
            } else {
                incorrectas += 1;
            }
        } while (!(entrada.equals("&&&&&")));
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
        sc.close();
    }
    public static boolean validarEntrada(String entrada) {
        boolean esValida = (entrada.length() == 5 && entrada.charAt(0) == 'X' &&
        entrada.charAt(4) == 'O') || (entrada.equals("&&&&&"));
        return esValida;
    }
}