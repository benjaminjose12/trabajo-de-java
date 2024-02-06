package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwith02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de horas trabajadas a la semana: ");
        int horasTrabajadas = scanner.nextInt();

        double salario = calcularSalarioSemanal(horasTrabajadas);

        System.out.println("El salario semanal del trabajador es: " + salario + " soles.");

        scanner.close();
    }

    public static double calcularSalarioSemanal(int horasTrabajadas) {
        int horasOrdinarias = Math.min(horasTrabajadas, 40
        );
        int horasExtras = Math.max(horasTrabajadas - 40, 0);

        double salarioOrdinario = horasOrdinarias * 12.0;
        double salarioExtras = horasExtras * 16.0;

        return salarioOrdinario + salarioExtras;
    }
}

