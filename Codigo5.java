// Falta el paquete se importa el scanner
import java.util.Scanner; //Importamos herramienta scanne

public class Codigo5 {

    public static void main(String[] args) {
        //faltaba clase main

    Scanner s = new Scanner(System.in); //se especifica  fuente in para escanner
	    System.out.print("Introduzca un número:"); // se ponen comillas , ya que estaban combinados

        // se cambia la variable para que se vea el texto
        String niString = s.nextLine();
        int c = Integer.parseInt(niString);
        int ni = c;

    int afo = 0;
    int noAfo = 0;

    // se cambia el ciclo con entero ni
	    while (ni > 0) {
        int digito = (int)(ni % 10);
        if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
            afo++;
        } else {
            noAfo++;

            ni /= 10;
        }
            if (afo > noAfo) {
                System.out.println("El " + c + " es un número afortunado.");
            } else {
                System.out.println("El " + c + " no es un número afortunado.");
            }

    }

    }
}
