package Animals;

public class Cat extends Animals{

    static Integer catCounter = 0;

    public Cat(String name, String color, String mood, Integer age, Double weight) {
        super(name, color, mood, age, weight);
        catCounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public static Integer getCatCounter() {
        return catCounter;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat"+ catCounter +"[name=" + name + "]";
    }
    @Override
    public void Sound() {
    System.out.println("MEOW MEOW");
    }
    @Override
    public void reaction() {
    System.out.println("Jump on your notebook");
    }

}
