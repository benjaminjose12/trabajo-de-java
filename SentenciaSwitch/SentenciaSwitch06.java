package SentenciaSwitch;

import java.util.Scanner;

public class SentenciaSwitch06 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicialización del cuestionario con las preguntas y respuestas correctas
        String[] preguntas = {
            "1. ¿Cuál es la capital de Francia?\n(a) Berlín\n(b) París\n(c) Madrid\n",
            "2. ¿Cuál es la fórmula química del agua?\n(a) H2O\n(b) CO2\n(c) NaCl\n",
            "3. ¿Quién escribió 'Don Quijote de la Mancha'?\n(a) Miguel de Cervantes\n(b) Gabriel García Márquez\n(c) William Shakespeare\n",
            "4. ¿Cuál es el resultado de 2 + 2?\n(a) 3\n(b) 4\n(c) 5\n",
            "5. ¿Cuál es el planeta más grande del sistema solar?\n(a) Tierra\n(b) Júpiter\n(c) Marte\n",
            "6. ¿Cuál es la capital de Italia?\n(a) Roma\n(b) Madrid\n(c) Lisboa\n",
            "7. ¿Cuál es el río más largo del mundo?\n(a) Nilo\n(b) Amazonas\n(c) Misisipi\n",
            "8. ¿Cuál es el resultado de 3 x 3?\n(a) 6\n(b) 9\n(c) 12\n",
            "9. ¿Cuál es el océano más grande del mundo?\n(a) Atlántico\n(b) Pacífico\n(c) Índico\n",
            "10. ¿Quién pintó la Mona Lisa?\n(a) Pablo Picasso\n(b) Leonardo da Vinci\n(c) Vincent van Gogh\n"
        };

        char[] respuestas = {'b', 'a', 'a', 'b', 'b', 'a', 'b', 'b', 'b', 'b'};
        
        // Inicialización del contador de respuestas correctas
        int respuestasCorrectas = 0;

        // Presentar el cuestionario y registrar respuestas
        for (int i = 0; i < preguntas.length; i++) {
            System.out.println(preguntas[i]);
            char respuestaUsuario = scanner.next().charAt(0);

            // Comprobar si la respuesta es correcta
            if (respuestaUsuario == respuestas[i]) {
                respuestasCorrectas++;
            }
        }

        // Mostrar la calificación obtenida
        System.out.println("Tu calificación es: " + respuestasCorrectas + " / " + preguntas.length);

        scanner.close();
    }
} 

