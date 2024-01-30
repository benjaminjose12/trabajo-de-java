package Cemana4;

import java.util.Scanner;

/**
 * SentenciaIF1
 */
public class SentenciaIF1 {

    public static void main(String[] args) {
        System.out.println("Ingrese un Numero Entero");
        Scanner S = new Scanner (System.in) ;
        int Numero = S.nextInt();

        if (Numero > 0 ) {
            System.out.println(" El numero"+Numero+"  es positivo" );
        }   else {
            System.out.println("El  numero"+Numero+ " es negativo");
        }

    }
}