import java.io.IOException;
import java.util.Scanner;

public class E9 {

    public static void main(String[] args) throws IOException {
        try (Scanner scaner = new Scanner(System.in)) {
            String texto;
            char caracter;
            int numeroDeVeces = 0;
            do {
                System.out.println("Introduce texto: ");
                texto = scaner.nextLine();
                System.out.println("Introdujo: " + texto);
                
            } while (texto.isEmpty());
            System.out.print("Introduce un carácter: ");
            caracter = (char) System.in.read();
            System.out.println("Introdujo: " + caracter);
            numeroDeVeces = contarCaracteres(texto, caracter);
            System.out.println("En el texto aparece el carácter (" + caracter + ") " + numeroDeVeces + " veces");
        }                   
    }

    public static int contarCaracteres(String str, char caracter) {
        int posicion, contador = 0;
        posicion = str.indexOf(caracter);
        while (posicion != -1) {
            contador++;           
            posicion = str.indexOf(caracter, posicion + 1);
        }
        return contador;
   }
}