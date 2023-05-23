
/*
 * Ejercicio 5
 * Define una variable de tipo boolean, double y char. Guarda información en ellas a través del Scanner.
 */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean myVar;
        double myNum;
        char myChar;
        System.out.print("Ingrese un booleano: ");
        myVar = keyboard.nextBoolean();
        System.out.print("Ingrese un double: ");
        myNum = keyboard.nextDouble();
        System.out.print("Ingrese un char: ");
        myChar = keyboard.next().charAt(0);
        keyboard.close();
        System.out.println(myVar);
        System.out.println(myNum);
        System.out.println(myChar);
    }
}
