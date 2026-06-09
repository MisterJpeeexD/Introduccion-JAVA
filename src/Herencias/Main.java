package Herencias;

import Animales.Bird;

public class Main {
    public static void main(String[] args){
        var Dog = new Dog("Cachupin","Dog","White");
        var Cat = new Cat("Morena","Cat","Orange");
        var Bird = new Bird("Mordecai","Bird","20 cm");

        System.out.println();
        System.out.println(Cat.color);
        //Cat.eat();
        Cat.sound();
        Cat.meow_eat();

        System.out.println();
        System.out.println(Dog.name);
        //Dog.eat();
        Dog.sound();
        Dog.bark_eat();

        Bird.fly();
    }
}
