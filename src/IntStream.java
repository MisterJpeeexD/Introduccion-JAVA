import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntStream {
    public static void main(String[] args){
        List<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        for(Integer numero : numeros){
            if(numero > 20) {
                System.out.println(numero);
            }
        }
        numeros.forEach(numero -> System.out.println(numero));

        numeros.stream()
                .filter(numero -> numero > 20) // Filtra si numero es mayor a 20
                .map(numero -> numero *2) // Toma el numero y lo procesa segun la instruccion, en este caso, lo multiplica por 2
                .sorted() // Ordenar
                .limit(2) // Limitar resultados, en este caso maximo 2
                .forEach(System.out::println); // = .forEach(numero -> System.out.println(numero));

        List<String> nombres = new ArrayList<>();
        nombres.add("Maria");
        nombres.add("Juan");
        nombres.add("Fran");
        nombres.add("Esteban");

        nombres.stream()
                .map(nombre -> nombre.toLowerCase())
                .forEach(System.out::println);

        Map<String, Integer> sueldos = new HashMap<>();

        sueldos.put("Felipe",100);
        sueldos.put("Juan",200);
        sueldos.put("Cristian",300);
        sueldos.put("Esteban",400);
        sueldos.put("Eduardo",500);

        System.out.println("sueldos.entrySet().stream()");
        sueldos.entrySet().stream()
                .forEach(System.out::println);
    }
}

