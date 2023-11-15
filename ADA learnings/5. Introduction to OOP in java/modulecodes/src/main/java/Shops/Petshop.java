package Shops;

import Animals.Animals;
import Animals.Dog;

public class Petshop {
    
    public void washAnimal(Animals animal) {
        animal.setMood("Happy");
    }

    public void shearAnimal(Animals animal) {
        animal.setMood("Angry");
    }

    public void cutNails(Dog Dog) {
        Dog.setMood("Nervous");
    }
}
