package Exp1JoseJulianALcarrazRodas;

import java.util.Scanner;

public class pregunta05 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del usuario
        int positivos = 0; // Iniciamos  un contador para los números positivos
        int negativos = 0; // Iniciamos  un contador para los números negativos
        
        System.out.println("Introduce diez números:"); // Solicitamos  a un causita  para  que ingrese diez números  para  comprovar  si es positivo o negativo 
        
        // (Comenzamos un bucle como vimos  en el rico youtube )que se ejecutará diez veces para leer diez números
        for (int i = 0; i < 10; i++) {
            int numero = scanner.nextInt(); // Leemos el número ingresado por el usuario
            
            // Verificamos si el número es positivo o negativo y actualizamos los contadores
            if (numero > 0) {
                positivos++; // Incrementamos el contador de números positivos
            } else if (numero < 0) {
                negativos++; // Incrementamos el contador de números negativos
            }
        }
        
        
        System.out.println("Cantidad de números positivos: " + positivos);
        System.out.println("Cantidad de números negativos: " + negativos);
        
        scanner.close(); 
    }
} //    serramos    elcodigo  para que pueda  ejecutar  el programa 
