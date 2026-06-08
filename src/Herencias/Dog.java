package Herencias;

public class Dog extends Animals {
    // Atributos
    protected String breed;

    public Dog(String name, String type, String breed) {
        super(name, type);
        this.breed = breed;
    }

    @Override
    void sound(){
        System.out.println(super.name + " esta ladrando");
    }

    void bark_eat(){
        sound();
        System.out.print(" y ");
        super.eat();
    }
}
