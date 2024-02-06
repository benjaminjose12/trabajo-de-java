package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwitch08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un número
        System.out.println("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par y/o divisible entre 5
        if (esPar(numero) && esDivisibleEntre5(numero)) {
            System.out.println(numero + " es par y divisible entre 5.");
        } else if (esPar(numero)) {
            System.out.println(numero + " es par pero no es divisible entre 5.");
        } else if (esDivisibleEntre5(numero)) {
            System.out.println(numero + " no es par pero es divisible entre 5.");
        } else {
            System.out.println(numero + " no es par ni divisible entre 5.");
        }

        scanner.close();
    }

    // Función para verificar si un número es par
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Función para verificar si un número es divisible entre 5
    public static boolean esDivisibleEntre5(int numero) {
        return numero % 5 == 0;
    }
}

