package Animales;
import Herencias.Animals;
import Herencias.Dog;

public class Animales {
    public static void main(String[] args){
        var OtherDog = new Dog("Lili","Dog","Beagle");
        // OtherDog.breed; // No se puede acceder, debido a que se necesita el public en metodo adicional
    }
}
