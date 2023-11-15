package Animals;

public class Bird extends Animals {

    static Integer birdCounter = 0;

    public Bird(String name, String color, String mood, Integer age, Double weight) {
        super(name, color, mood, age, weight);
        birdCounter++;
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

    public static Integer getBirdCounter() {
        return birdCounter;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BIRD" + birdCounter + "[name=" + name + "]";
    }
    @Override
    public void Sound() {
        System.out.println("PIU PIU");
    }
    @Override
    public void reaction() {
    System.out.println("Fly to a tree");
    }
}
