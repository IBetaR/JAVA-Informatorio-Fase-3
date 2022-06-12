import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre: ");
        String nombreUsuario = sc.next();
        System.out.println("Hola "+ nombreUsuario+"! Bienvenido al Módulo Java!");
        sc.close();
    }
}
