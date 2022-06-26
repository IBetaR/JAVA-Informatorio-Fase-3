package E1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.lang.model.element.Element;

/**
 * E1
 */
public class E1 {

    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("Hola", null, "Infomatorio", " ");
        System.out.println(palabras);

       //for (String palabra : palabras) {
        //if(palabra == null && palabra == " "){
            
        //}
        
       //}
        palabras.stream()
                        .filter(elem -> elem != null)
                        .filter(elem -> elem != " ")
                        .forEach(System.out::println);                                
    }
}