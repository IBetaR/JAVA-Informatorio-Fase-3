import java.util.*;

public class E2 {
     public static void main(String[] args) {

        //-----Suma de dos números int
        int primerNumeroEntero, segundoNumeroEntero, suma, resta, multiplicacion, resto,incremento1 = 0;
        float division=0;

        try (Scanner numero = new Scanner(System.in)) {
            System.out.println("Ingrese un número entero: ");
            primerNumeroEntero = numero.nextInt();
            System.out.println("Ingresó el número:"+ primerNumeroEntero);
            
            System.out.println("Ingrese otro entero: ");
            segundoNumeroEntero = numero.nextInt();
        }
        System.out.println("Ingresó el número:"+ segundoNumeroEntero);

        suma = primerNumeroEntero+segundoNumeroEntero;
        resta = primerNumeroEntero-segundoNumeroEntero;
        multiplicacion = primerNumeroEntero*segundoNumeroEntero;
        division = primerNumeroEntero/segundoNumeroEntero;
        resto=primerNumeroEntero%segundoNumeroEntero;
       

        System.out.println("La suma de esos números es: "+ suma);
        System.out.println("La resta de esos números es: "+ resta);
        System.out.println("La multiplicación de esos números es: "+ multiplicacion);
        System.out.println("La división de esos números es: "+ division);
        System.out.println("El resto de esos números es: "+ resto);

        System.out.println("Primer numero: "+primerNumeroEntero);
        incremento1 = ++primerNumeroEntero;
        System.out.println("Secuencia incremental del primer numero: "+incremento1);

    
    }

}

