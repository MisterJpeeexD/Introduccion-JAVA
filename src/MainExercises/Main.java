package MainExercises;

public class Main {
    public static void main(String[] args){
        // Comentario
        /* Comentario */
        int numero = 5;
        System.out.println("Numero: " + numero);
        System.out.println("Hola mundo!");
        byte tipoByte = 127;
        short tipoShort = 32000;
        double tipoDouble = 1.74;
        float tipoFloat = 3;
        boolean isReal = true;
        boolean hasCarnet = false;
        char tipoCaracter = 'A'; // Siempre comillas simples y solo un caracter
        String tipoString = "Hola mundo"; // Los primitivos no necesitan clases

        var variable = "Hola";
        // variable = 5; // no se puede

        final double PI = 3.14; // Buena práctica trabajar con mayúsculas
        System.out.println("PI = " + PI);
        System.out.printf("Mi edad es %d, mi altura es %.2f, %s, es %b, que la letra a es %c",numero,tipoDouble,tipoString, isReal, tipoCaracter); // %d entero, %f double, %.2f para recortar a 2 decimales
        System.out.printf("""
        Mi edad es %d,
        mi altura es %.2f,
        %s,
        es %b,
        que la letra a es %c \n
        """,numero,tipoDouble,tipoString, isReal, tipoCaracter); // Se pegará con el imprimir en pantalla junto al de arriba al usar \n o sout sin ln
    }
}
