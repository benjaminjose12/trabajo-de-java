public class calculaLaMedia {
    import java.util.Scanner;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("ingresa tu nombre y edad, separados por un espacion:  ");
        String nombre = s.next();
        int edad = s.nextInt();

        System.out.println("Tu nombre es: "+nombre+" y tu edad es "+edad);

        //Ejemplo: programa que alcule la media aritmetica de tres numero decimales
        Scanner d = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = d.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = d.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = d.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("La media aritmética de los tres números es: " + media);

        }
}

