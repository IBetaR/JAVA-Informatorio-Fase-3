import java.util.Scanner;

public class E6{
    public static void main(String[] args) {
        //-----Potencia de dos números int
        int base;
        int exponente;
        
        try (Scanner numero = new Scanner(System.in)) {
            System.out.println("Ingrese un número entero: ");
            base = numero.nextInt();
            System.out.println("Ingrese otro entero: ");
            exponente = numero.nextInt();
        }
        int potencia = CalcularPotencia(base, exponente);
        System.out.println("La potencia del número "+ base + "^"+ exponente+ "Es igual a: " + potencia);

    }
    static int CalcularPotencia(int base, int exponente){
        if (exponente==0){
            return 1;
        }else{
            return base*CalcularPotencia(base, exponente-1);
        }
    }
}