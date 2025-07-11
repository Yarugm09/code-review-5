package com.generation;

// Importamos la clase Scanner para leer entradas desde consola
import java.util.Scanner;

public class Codigo4 {

    //metodo principal
    public static void main(String[] args) {

        //  Usamos Scanner para leer los datos del usuario
        Scanner s = new Scanner(System.in);

        //  Jugador 1
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        //  Jugador 2
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine();

        //  Verificamos si ambos jugadores eligieron la misma opción
        if (j1.equals(j2)) {
            System.out.println("Empate");
        } else {
            int ganador = 2; // Por defecto, gana el jugador 2

            //  revisamos la jugada del jugador 1 para determinar el ganador
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) {
                        ganador = 1;
                    }
                    break;

                case "papel":
                    if (j2.equals("piedra")) {
                        ganador = 1;
                    }
                    break;

                case "tijeras":
                    if (j2.equals("papel")) {
                        ganador = 1;
                    }
                    break;

                //  Si la opción del jugador 1 no es válida
                default:
                    System.out.println("Opción inválida por parte del jugador 1");
                    return; // Finaliza el programa si hay error
            }

            //  Mostramos el ganador
            System.out.println("Gana el jugador " + ganador);
        }

        //  Cerramos el Scanner para buenas practicas
        s.close();
    }
}
