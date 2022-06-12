import java.util.Scanner;

public class E3 {
    public static void main(String[] args) {

        int numeroEntero, incremento = 0;

        try (Scanner numero = new Scanner(System.in)) {
            System.out.println("Ingrese un número entero: ");
            numeroEntero = numero.nextInt();
            System.out.println("Ingresó el número:"+ numeroEntero);
            
        }

        incremento = ++numeroEntero;

        System.out.println("La suma de esos números es: "+ incremento);
    }
}
