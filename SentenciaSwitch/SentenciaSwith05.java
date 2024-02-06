package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwith05 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el día de nacimiento
        System.out.println("Ingrese el día de nacimiento (1-31): ");
        int dia = scanner.nextInt();

        // Pedir al usuario que ingrese el mes de nacimiento
        System.out.println("Ingrese el mes de nacimiento (1-12): ");
        int mes = scanner.nextInt();

        // Determinar el horóscopo según el día y el mes de nacimiento
        String horoscopo = determinarHoroscopo(dia, mes);

        // Mostrar el horóscopo
        System.out.println("Tu horóscopo es: " + horoscopo);

        scanner.close();
    }

    public static String determinarHoroscopo(int dia, int mes) {
        String horoscopo = "";
        switch (mes) {
            case 1: // Enero
                if (dia >= 1 && dia <= 20)
                    horoscopo = "Capricornio";
                else
                    horoscopo = "Acuario";
                break;
            case 2: // Febrero
                if (dia >= 1 && dia <= 18)
                    horoscopo = "Acuario";
                else
                    horoscopo = "Piscis";
                break;
            case 3: // Marzo
                if (dia >= 1 && dia <= 20)
                    horoscopo = "Piscis";
                else
                    horoscopo = "Aries";
                break;
            case 4: // Abril
                if (dia >= 1 && dia <= 20)
                    horoscopo = "Aries";
                else
                    horoscopo = "Tauro";
                break;
            case 5: // Mayo
                if (dia >= 1 && dia <= 20)
                    horoscopo = "Tauro";
                else
                    horoscopo = "Géminis";
                break;
            case 6: // Junio
                if (dia >= 1 && dia <= 20)
                    horoscopo = "Géminis";
                else
                    horoscopo = "Cáncer";
                break;
            case 7: // Julio
                if (dia >= 1 && dia <= 22)
                    horoscopo = "Cáncer";
                else
                    horoscopo = "Leo";
                break;
            case 8: // Agosto
                if (dia >= 1 && dia <= 22)
                    horoscopo = "Leo";
                else
                    horoscopo = "Virgo";
                break;
            case 9: // Septiembre
                if (dia >= 1 && dia <= 22)
                    horoscopo = "Virgo";
                else
                    horoscopo = "Libra";
                break;
            case 10: // Octubre
                if (dia >= 1 && dia <= 22)
                    horoscopo = "Libra";
                else
                    horoscopo = "Escorpio";
                break;
            case 11: // Noviembre
                if (dia >= 1 && dia <= 22)
                    horoscopo = "Escorpio";
                else
                    horoscopo = "Sagitario";
                break;
            case 12: // Diciembre
                if (dia >= 1 && dia <= 21)
                    horoscopo = "Sagitario";
                else
                    horoscopo = "Capricornio";
                break;
            default:
                horoscopo = "Mes inválido";
        }
        return horoscopo;
    }
} 

