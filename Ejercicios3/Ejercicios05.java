package Ejercicios3
import java.util.Scanner;
public class Ejercicios05 {
    

            public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("Ingresa la longitud del rectángulo: ");
            double largo = s.nextDouble();
            System.out.print("Ingresa la anchura del rectángulo: ");
            double anchura = s.nextDouble();
            double area = largo * anchura;
            System.out.println("El área del rectángulo es: " + area);
        }
    } 
