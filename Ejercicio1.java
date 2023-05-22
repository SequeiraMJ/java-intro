
/*
 * Ejercicio 1
 * Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
 * 
 * Ejercicio 2
 * ¿Recuerdas las variables que creaste en el ejercicio anterior? Ahora deberás asignarles un valor.
 */

public class Ejercicio1 {
    public static void main (String[] args) {
        System.out.println("Ejercicio 1 declaración de variables");
        System.out.println("Ejercicio 2 asignar valores a las variables");
        int numero = 23456;
        long numero2 = 2345678912345L;
        float numero3 = 123.23456F;
        double numero4 = 123.34567893;
        boolean logged = true;
        char letra = '\uff00'; // Se puede usar Unicode
        String name = "Macgyver"; // No es un tipo de dato primitivo

        System.out.println("Hello " + name + " your variable's values are: ");
        System.out.println(numero);
        System.out.println(numero2);
        System.out.println(numero3);
        System.out.println(numero4);
        System.out.println(logged);
        System.out.println(letra);
    }
}