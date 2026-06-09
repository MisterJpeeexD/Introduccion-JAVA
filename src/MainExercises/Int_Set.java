package MainExercises;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Int_Set {
    public static void main (String[] args){
        // - NO permite elementos duplicados
        // - No garantiza orden (depende de la implementación)
        // - Almacena valores únicos

        Set<String> correos = new HashSet<>();

        correos.add("a@mail.com");
        correos.add("b@mail.com");
        correos.add("a@mail.com"); // duplicado

        boolean existe = correos.contains("a@mail.com");

        correos.remove("b@mail.com");

        int total = correos.size();

        for (String correo : correos) {
            System.out.println(correo);
        }

        Iterator<String> it = correos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // System.out.println(correos); ❌ El orden puede cambiar.

        // correos.get(0); // ❌ no existe
        /*
        - ranking
        - historial
        - secuencia de pasos
        */

        /*
        ## 🧼 **10. Buenas Prácticas con Set**
        ✔ Usar Set cuando **NO deben existir duplicados**
        ✔ Usar `contains()` para validaciones
        ✔ Preferir `HashSet` para uso general
        ✔ Usar Set para unicidad, no para orden

        ---
        ## ❌ **11. Malas Prácticas**
        ❌ Usar Set como reemplazo de List
        ❌ Asumir orden
        ❌ Forzar conversiones innecesarias
        ❌ Usar Set solo “porque evita duplicados” sin entender el contexto*/



    }
}
