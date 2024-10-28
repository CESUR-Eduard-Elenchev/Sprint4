package Trabajo;

import java.util.*;

public class S05_ElenchevG {

    public static void main(String[] args) {

        // Inicializacion de constantes
        final int punthermano = 40;
        final int puntvivir_poblacion = 30;
        final int punttrabajar_poblacion = 20;
        final int puntdiscapacidad = 10;
        final int puntfamilia = 15;
        final int puntfamilia_escolarizado = 5;

        // Inicializacion de variables
        int puntos = 0;
        int nregistro = 0;
        int phermano = 0;
        int pvivir_poblacion = 0;
        int pptrabajar_poblacion = 0;
        int pdiscapacidad = 0;
        int pfamilia = 0;
        int pfamiliar_escolarizado = 0;

        // Inicializacion variables especiales
        Scanner entrada = new Scanner(System.in);

        // Peticion de numero de registro
        do {
            try {
                System.out.println("Introduce el numero de registro del almuno (1-499)");
                nregistro = entrada.nextInt();
                if (nregistro >= 1 && nregistro <= 499) {
                    break;
                } else {
                    System.out.println("El valor ha de ser de entre 1 y 499");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                entrada.next();
            }
        } while (true);
        System.out.println("Responde las siguientes preguntas:");
        // Pregunta si tiene un hermano en el centro
        do {
            try {
                System.out.println("¿El alumno tiene un hermano en el centro? (0:No; 1:Si)");
                phermano = entrada.nextInt();
                if (phermano == 0 || phermano == 1) {
                    break;
                } else {
                    System.out.println("El valor ha de ser '0' para 'No' y '1' para 'Si'");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                entrada.next();
            }
        } while (true);
        // Pregunta si vive en la misma poblacion del centro
        do {
            try {
                System.out.println("¿El alumno vive en la misma poblacion del centro? (0:No; 1:Si)");
                pvivir_poblacion = entrada.nextInt();
                if (pvivir_poblacion == 0 || pvivir_poblacion == 1) {
                    break;
                } else {
                    System.out.println("El valor ha de ser '0' para 'No' y '1' para 'Si'");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                entrada.next();
            }
        } while (true);
        // Pregunta si sus padres trabajan en la misma poblacion del centro
        do {
            try {
                System.out.println("¿Los padres del alumno trabajan en la misma poblacion del centro? (0:No; 1:Si)");
                pptrabajar_poblacion = entrada.nextInt();
                if (pptrabajar_poblacion == 0 || pptrabajar_poblacion == 1) {
                    break;
                } else {
                    System.out.println("El valor ha de ser '0' para 'No' y '1' para 'Si'");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                entrada.next();
            }
        } while (true);
        // Pregunta si tiene alguna discapacidad o endermedad cornica
        do {
            try {
                System.out.println(
                        "¿El alumno tiene alguna discapacidad igual o superior al 33% o enfermedad crónica? (0:No; 1:Si)");
                pdiscapacidad = entrada.nextInt();
                if (pdiscapacidad == 0 || pdiscapacidad == 1) {
                    break;
                } else {
                    System.out.println("El valor ha de ser '0' para 'No' y '1' para 'Si'");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                entrada.next();
            }
        } while (true);
        // Pregunta si forma parte d euna familia numerosa o monoparental
        do {
            try {
                System.out.println("¿El alumno forma parte de una familia numerosa o monoparental? (0:No; 1:Si)");
                pfamilia = entrada.nextInt();
                if (pfamilia == 0 || pfamilia == 1) {
                    break;
                } else {
                    System.out.println("El valor ha de ser '0' para 'No' y '1' para 'Si'");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                entrada.next();
            }
        } while (true);
        // Pregunta si tiene familiares escolarizados
        do {
            try {
                System.out.println(
                        "¿El padre, madre, tutor legal o hermano del alumno ha sido escolarizado? (0:No; 1:Si)");
                pfamiliar_escolarizado = entrada.nextInt();
                if (pfamiliar_escolarizado == 0 || pfamiliar_escolarizado == 1) {
                    break;
                } else {
                    System.out.println("El valor ha de ser '0' para 'No' y '1' para 'Si'");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: La entrada no es un número entero válido.");
                entrada.next();
            }
        } while (true);

        // Logica de agregar los puntos 
        if (phermano == 1) {
            puntos += punthermano;
        }
        if (pvivir_poblacion >= pptrabajar_poblacion) {
            puntos += puntvivir_poblacion;
        } else {
            if (pptrabajar_poblacion == 1) {
                puntos += punttrabajar_poblacion;
            }
        }
        if (pdiscapacidad == 1) {
            puntos += puntdiscapacidad;
        }
        if (pfamilia == 1) {
            puntos += puntfamilia;
        }
        if (pfamiliar_escolarizado == 1) {
            puntos += puntfamilia_escolarizado;
        }
        // Mustra por pantalla los puntos y numero de registro
        System.out.println("El alumno " + nregistro + " tiene " + puntos + " puntos");
    }
}
