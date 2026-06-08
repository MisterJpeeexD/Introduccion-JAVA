package Herencias;

public class Cat extends Animals {

    String color;

    public Cat(String name, String type, String color){
        super(name,type);
        this.color = color;
    }

    @Override
    void sound(){
        System.out.println(" esta maullando");
    }

    void meow_eat(){
        sound();
        System.out.print(" y ");
        super.eat();
    }
}
