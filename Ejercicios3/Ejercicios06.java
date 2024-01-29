package Ejercicios3;
import java.util.Scanner;
public class Ejercicios06 {
    
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            System.out.print("Ingresa la base del triángulo: ");
            double base = s.nextDouble();
            System.out.print("Ingresa la altura del triángulo: ");
    
            double altura = s.nextDouble();
    
            double area = 0.5 * base * altura;
    
            System.out.println("El área del triángulo es: " + area);
        }
    } 

