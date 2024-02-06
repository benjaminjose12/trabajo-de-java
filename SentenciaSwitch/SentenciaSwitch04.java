package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwitch04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese las tres notas
        System.out.println("Ingrese la primera nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Ingrese la tercera nota: ");
        double nota3 = scanner.nextDouble();

        // Calcular la media
        double media = (nota1 + nota2 + nota3) / 3;

        // Determinar la calificación del boletín
        String boletin;
        if (media >= 16 && media <= 20) {
            boletin = "Sobresaliente";
        } else if (media >= 13 && media <= 15) {
            boletin = "Notable";
        } else if (media >= 11 && media <= 12) {
            boletin = "Bien";
        } else if (media >= 1 && media <= 10) {
            boletin = "Insuficiente";
        } else {
            boletin = "Nota fuera de rango";
        }

        // Mostrar la media y la calificación del boletín
        System.out.println("La media de las notas es: " + media);
        System.out.println("Calificación del boletín: " + boletin);

        scanner.close();
    }
} 

