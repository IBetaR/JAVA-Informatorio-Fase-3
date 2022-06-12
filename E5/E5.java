import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        int primerNumeroEntero, segundoNumeroEntero, sumaS = 0;

        try (Scanner numero = new Scanner(System.in)) {
            System.out.println("Ingrese un número entero: ");
            primerNumeroEntero = numero.nextInt();
            System.out.println("Ingresó el número:"+ primerNumeroEntero);
            
            System.out.println("Ingrese otro entero: ");
            segundoNumeroEntero = numero.nextInt();
        }
        System.out.println("Ingresó el número:"+ segundoNumeroEntero);

        sumaS = primerNumeroEntero*(segundoNumeroEntero+1);

        System.out.println("La suma de esos números es: "+ sumaS);
    }

}
