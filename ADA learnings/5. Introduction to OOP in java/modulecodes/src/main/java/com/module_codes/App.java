package com.module_codes;

import Animals.Dog;
import Shops.Petshop;
import Animals.Bird;
import Animals.Cat;

public class App {
    public static void main(String[] args) {

        Dog Dog1 = new Dog("robertinho", "black", "Emo", 12, 17.35);
        System.out.println(Dog1);
        Dog Dog2 = new Dog("jubere", "black", "dark", 15, 11.35);
        System.out.println(Dog2);

        Bird Bird0 = new Bird("robertinho", "black", "Emo", 12, 17.35);
        System.out.println(Bird0);
        Bird Bird1 = new Bird("jubere", "black", "dark", 15, 11.35);
        System.out.println(Bird1);

        Cat Cat0 = new Cat("robertinho", "black", "Emo", 12, 17.35);
        System.out.println(Cat0);
        Cat Cat1 = new Cat("jubere", "black", "dark", 15, 11.35);
        System.out.println(Cat1);

        System.out.println("Total Dog Count:");
        System.out.println(Dog.getDogCounter() + 1);
        System.out.println("Dog Actions:");
        Dog1.Sound();
        Dog1.reaction();

        System.out.println("Total Cat Count:");
        System.out.println(Cat.getCatCounter() + 1);
        System.out.println("Cat Actions:");
        Cat1.Sound();
        Cat1.reaction();

        System.out.println("Total Bird Count:");
        System.out.println(Bird.getBirdCounter() + 1);
        System.out.println("Bird Actions:");
        Bird1.Sound();
        Bird1.reaction();

        Petshop petshop = new Petshop();

        petshop.cutNails(Dog1);
        System.out.println(Dog1.getMood());

        petshop.shearAnimal(Cat1);
        System.out.println(Cat1.getMood());
    }
}
