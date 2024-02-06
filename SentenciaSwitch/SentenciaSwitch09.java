package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwitch09 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la base imponible
        System.out.println("Ingrese el precio base del producto: ");
        double precioBase = scanner.nextDouble();

        // Pedir al usuario que ingrese el tipo de impuesto aplicado
        System.out.println("Ingrese el tipo de impuesto (general, reducido o superreducido): ");
        String tipoImpuesto = scanner.next();

        // Pedir al usuario que ingrese el código promocional
        System.out.println("Ingrese el código promocional (nopro, mitad, meno5 o 5porc): ");
        String codigoPromocional = scanner.next();

        // Calcular el precio final del producto
        double impuesto;
        switch (tipoImpuesto) {
            case "general":
                impuesto = 0.21;
                break;
            case "reducido":
                impuesto = 0.10;
                break;
            case "superreducido":
                impuesto = 0.04;
                break;
            default:
                impuesto = 0.0;
                System.out.println("Tipo de impuesto inválido.");
                break;
        }

        double precioConImpuesto = precioBase * (1 + impuesto);

        double precioFinal;
        switch (codigoPromocional) {
            case "nopro":
                precioFinal = precioConImpuesto;
                break;
            case "mitad":
                precioFinal = precioConImpuesto / 2;
                break;
            case "meno5":
                precioFinal = precioConImpuesto - 5;
                break;
            case "5porc":
                precioFinal = precioConImpuesto * 0.95;
                break;
            default:
                precioFinal = precioConImpuesto;
                System.out.println("Código promocional inválido.");
                break;
        }

        // Mostrar el precio final del producto
        System.out.println("El precio final del producto es: " + precioFinal);

        scanner.close();
    }
}

