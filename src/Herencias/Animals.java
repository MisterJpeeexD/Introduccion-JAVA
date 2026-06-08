package Herencias;

public class Animals {
    // Atributos
    protected String name;
    String type;

    public Animals(String name, String type){
        this.name = name;
        this.type = type;
    }

    void eat(){
        System.out.println("Esta comiendo");
    }

    void sound(){
        System.out.println("Haciendo sonidos");
    }
}
