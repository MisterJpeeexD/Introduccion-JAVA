package MainExercises;

import java.util.Scanner; // Libreria prompt

public class CadenasTexto {
    public static void main(String[] args) {
        String nombre = "Jean";
        final String CONTRASENIA = "1234";
        System.out.println(" Mi nombre es "+ nombre);
        System.out.println("Longitud: " + nombre.length());
        System.out.println("Caracter: " + nombre.charAt(3));
        System.out.println("Minúscula:" + nombre.toLowerCase());
        System.out.println("Mayúscula:" + nombre.toUpperCase());
        System.out.println(nombre.contains("an"));

        System.out.println(nombre == "Jean");
        System.out.println(nombre.equals("JEAN"));

        // PROMPT de JAVA
        Scanner consola = new Scanner(System.in); // Creacion prompt - consola = prompt o input
        System.out.print("Ingresa una contraseña: ");
        String contraseniaIngresada = consola.nextLine();
        System.out.println(CONTRASENIA.equalsIgnoreCase(contraseniaIngresada));
    }
}