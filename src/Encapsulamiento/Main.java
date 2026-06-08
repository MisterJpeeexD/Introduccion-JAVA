package Encapsulamiento;

import static Encapsulamiento.Person.saludarstatic;

public class Main {
    public static void main(String[] args){
        /*var Persona1 = new Person();
        Persona1.year = 30;
        System.out.println(Persona1.year);*/

        var Persona2 = new Person("Sandra",50,"sandra@gmail.com");
        System.out.println(Persona2.year);

        Persona2.Present();

        // saludar();  No sirve
        saludarstatic();

        // Modificadores de acceso
        /*
        public
        private
        protected
        default
        */
    }
}
