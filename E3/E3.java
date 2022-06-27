package E3;

import java.util.List;

public class E3 {
    public static void main(String[] args) {

        List<String> palabras = List.of("Batman", "Aq", "FLash", "Batgirl", "WondeW", "brainiac");
        System.out.println(palabras);
    
        Long cantidadDeLetrab = palabras.stream()

            .map(String::toLowerCase)
            .filter(palabra -> palabra.startsWith("b"))
            .count();
            //.forEach(System.out::println);
        System.out.println(cantidadDeLetrab);
        
    }
}
