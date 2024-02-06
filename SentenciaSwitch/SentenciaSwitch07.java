package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwitch07 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese los tres números
        System.out.println("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número: ");
        int num3 = scanner.nextInt();

        // Llamar a la función para ordenar los números
        ordenarNumeros(num1, num2, num3);

        scanner.close();
    }

    public static void ordenarNumeros(int num1, int num2, int num3) {
        // Ordenar los números usando un enfoque simple de intercambio
        int temp;
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        if (num2 > num3) {
            temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if (num1 > num2) {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Mostrar los números ordenados
        System.out.println("Los números ordenados son: " + num1 + ", " + num2 + ", " + num3);
    }
}

