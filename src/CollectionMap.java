import java.util.HashMap;
import java.util.Map;

public class CollectionMap {
    public static void main(String [] args){

        Map<String, Integer> sueldos = new HashMap<>();

        // Agregar valores
        sueldos.put("Felipe",100);
        sueldos.put("Juan",200);
        sueldos.put("Cristian",300);
        sueldos.put("Esteban",400);
        sueldos.put("Eduardo",500);

        // Obtener valores
        System.out.println(sueldos.get("Felipe"));

        // Modificar valor
        sueldos.put("Felipe",1000);
        System.out.println(sueldos);

        // Verificar si esta la clase
        System.out.println(sueldos.containsKey("Felipe"));
        System.out.println(sueldos.containsValue(1000));

        // Eliminar valores
        sueldos.remove("Felipe");

        // Tamaño
        System.out.println(sueldos.size());

        System.out.println(sueldos.entrySet());

        // Recorrer variables
        for(Integer sueldo : sueldos.values()){
            System.out.println(sueldo);
        }

        System.out.println("keyset: " + sueldos.keySet());

        // Recorrer claves
        for(String nombre : sueldos.keySet()){
            System.out.println(nombre);
        }

        // Recorrer la sección completa
        System.out.println("MAP");
        for(Map.Entry<String, Integer> infousers : sueldos.entrySet()){
            System.out.println(infousers.getKey());
            System.out.println(infousers.getValue());
        }


    }
}
