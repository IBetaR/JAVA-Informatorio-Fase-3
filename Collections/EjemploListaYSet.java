import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EjemploListaYSet{
    public static void main(String[] args) {
        //Listas usando ArrayList
        List<String> nombres = new ArrayList<>();
    
        cargarLista(nombres);
        System.out.println("Tamaño de lista: "+nombres.size());
        for (String nombre: nombres){
            System.out.println(nombre);
        }

        
        Set<String> apellidos = new HashSet<>();
        //Set usando HashSet
        cargarSet(apellidos);
        System.out.println("Tamaño del Set: "+ apellidos.size());
        for(String apellido: apellidos){
            System.out.println(apellido);
        }

        System.out.println("Existe \"María\" en la lista: " + nombres.contains("María"));
        System.out.println("Existe \"Toro\" en la lista: " + nombres.contains("Toro"));
        System.out.println("Existe \"Pineda\" en la lista: " + apellidos.contains("Pineda"));


        nombres.remove("Juan");
        System.out.println(nombres);

        //Map implementa HashMap<>
        Map<Integer, String> alumnos = new HashMap<>();
        cargarMap(alumnos);
        System.out.println("Tamaño del Map: "+ alumnos.size());

        for(Map.Entry<Integer, String> registro: alumnos.entrySet()){
            System.out.println("Id: "+ registro.getKey()+" ,Nombre: "+ registro.getValue());
        }
        for(Integer clave: alumnos.keySet()){
            System.out.println("Id: "+clave);
        }

        for(String valor: alumnos.values()){
            System.out.println("Nombre: "+valor);
        }
        System.out.println("Existe la clave 1234 en el map?: "+alumnos.containsKey(1234));
        System.out.println("Existe la clave 123334 en el map?: "+alumnos.containsKey(123334));
        System.out.println("Existe el valor Ilich Betancourt en el map?: "+alumnos.containsValue("Ilich Betancourt"));
        System.out.println("Existe el valor Ilich en el map?: "+alumnos.containsValue("Ilich"));
    }

    private static void cargarMap(Map<Integer, String> alumnos) {
        alumnos.put(1234, "Ilich Betancourt");
        alumnos.put(5678, "Pablo Betancourt");
        alumnos.put(91011, "Ana Betancourt");
    }
    private static void cargarSet(Set<String> apellidos) {
        apellidos.add("Betancourt");
        apellidos.add("Rangel");
        apellidos.add("Pineda");
    }

    private static void cargarLista(List<String> nombres) {
        nombres.add("Juan");
        nombres.add("María");
        nombres.add("Luis");
    }
}