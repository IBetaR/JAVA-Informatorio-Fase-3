package E2;

import java.util.Arrays;
import java.util.List;

public class E2 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        System.out.println(numeros);

        numeros.stream()
                        .forEach(numero -> 
                        System.out.println(numero * numero));
    };
}
