package Animals;

public class Dog extends Animals{

    static Integer dogCounter = 0;

    public Dog(String name, String color, String mood, Integer age, Double weight) {
        super(name, color, mood, age, weight);
        dogCounter = dogCounter + 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public static Integer getDogCounter() {
        return dogCounter;
    }

        @Override
    public String toString() {
        return "Dog " + dogCounter + "[name=" + name + "]";
    }
    @Override
    public void Sound() {
    System.out.println("WOOF WOOF");
    }
    @Override
    public void reaction() {
    System.out.println("*wiggle his tail*");
    }
}
