package MainExercises;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public static void main(String[] args){
    String[] OtrosNombres = {"Ana", "Maria", "Roxana", "Sofia"};
        System.out.println(OtrosNombres[2]);

        List<String> nombres = new ArrayList<>();

        // Agregar elementos
        nombres.add("Seba");
        nombres.add("Maria");
        nombres.add("Juan");
        System.out.println(nombres);

        // Acceder a elementos
        System.out.println(nombres.get(0));
        System.out.println(nombres.getLast());

        // Modificar elementos
        nombres.set(1,"Felipe");
        System.out.println(nombres.get(1));

        // Eliminar elementos
        nombres.remove("Juan");
        System.out.println(nombres);

        // Tamaño de la lista
        System.out.println(nombres.size());

        List<Integer> numeros = new ArrayList<>();

        for(int i = 1 ; i < 5 ; i++){
            numeros.add(i);
        }

        System.out.println(numeros);

        for(int i = 0 ; i < nombres.size() ; i++){
            System.out.println(nombres.get(i));
        }
    }
}
