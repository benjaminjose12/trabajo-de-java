package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwith03 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el valor de 'a': ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de 'b': ");
        double b = scanner.nextDouble();

        if (a != 0) {
            double solucion = resolverEcuacionPrimerGrado(a, b);
            System.out.println("La solución de la ecuación es x = " + solucion);
        } else {
            if (b == 0) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            } else {
                System.out.println("La ecuación no tiene solución.");
            }
        }

        scanner.close();
    }

    public static double resolverEcuacionPrimerGrado(double a, double b) {
        return -b / a;
    }
}

  

