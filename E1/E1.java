import java.util.Scanner;



public class E1{
    public static void main(String[] args) {
       
        try (Scanner sc1 = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombreUsuario = sc1.next();
            System.out.println("Hola "+ nombreUsuario+"! Bienvenido al Módulo Java!");
            
        }
        

    }
}