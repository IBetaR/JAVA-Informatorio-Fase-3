import java.io.IOException;
import java.util.Scanner;

public class E8{
    public static void main(String[] args) throws IOException {

        try (Scanner datos = new Scanner(System.in)) {
            System.out.println("Ingrese su nombre: ");
            String nombre = datos.next();
            System.out.println("Ingrese su Apellido: ");
            String apellido = datos.next();
            System.out.println("Hola "+ nombre+ " "+ apellido +"! Bienvenido al Módulo Java!");
            System.out.println("Ingrese edad: ");
            int edad = datos.nextInt();
            System.out.println("Ingrese la dirección: ");
            String direccion = datos.next();
            System.out.println("Ingrese ciudad: ");
            String ciudad = datos.next();
            System.out.println("Los datos ingresados son:" +nombre +" "+ apellido+" "+edad+" "+direccion+" "+ciudad);
        }
    }
}