package FarmAnimals;

// Exercise 1: Farm Animals

// Abstract superclass for farm animals
public abstract class FarmAnimal {
    // Attributes
    private String name; // 1. Variable names should be descriptive.
    private String gender;
    private double weight;
    private int age;

    // Constructor
    public FarmAnimal(String name, String gender, double weight, int age) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
        this.age = age;
    }

    // Getter and Setter methods


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[" + getClass().getSimpleName() + "] " + name + " [" +
                "name=" + name + ", gender=" + gender +
                ", weight=" + weight + ", age=" + age + "]";
    }

    // Abstract method for feed loading schedule
    public abstract String feedLoadingSchedule();
}
