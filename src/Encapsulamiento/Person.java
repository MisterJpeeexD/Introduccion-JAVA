package Encapsulamiento;

public class Person {
   // Email
    String name;
    int year;
    String email;

    //Constructor
/*    public Person(){

    }*/

    public Person(String email, int year, String name) {
        this.email = email;
        this.year = year;
        this.name = name;
    }

    // Metodo
    void Present(){
        System.out.println("Hola, soy " + this.name);
    }

    void InfoPerson(){
        System.out.printf("""
                nombre: %s
                edad: %d
                correo: %s
                """,this.name,this.year,this.email);
    }

    void saludar(){
        System.out.println("Hola!");
    }

    static void saludarstatic(){
        System.out.println("Hola!");
    }


}
