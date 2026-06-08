package Animales;

import Herencias.Animals;

public class Bird extends Animals {
    String size;

    public Bird(String name, String type, String size){
        super(name,type);
        this.size = size;
    }

    void fly(){
        System.out.println(name + " esta volando");
    }
}
