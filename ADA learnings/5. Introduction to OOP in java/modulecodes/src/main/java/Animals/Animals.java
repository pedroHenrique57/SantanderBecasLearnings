package Animals;

public abstract class Animals {
    protected String name;

    protected String color;

    protected String mood;

    protected Integer age;

    protected Double weight;

    public Animals(String name, String color, String mood, Integer age, Double weight) {
        this.name = name;
        this.color = color;
        this.mood = mood;
        this.age = age;
        this.weight = weight;
    }

    public abstract void Sound();

    public abstract void reaction();

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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
