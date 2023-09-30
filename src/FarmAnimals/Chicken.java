package FarmAnimals;

// Exercise 1: Farm Animals

// Subclass for Chicken
public class Chicken extends FarmAnimal {
    // Attribute
    private String sound;

    // Constructor
    public Chicken(String name, String gender, double weight, int age, String sound) {
        super(name, gender, weight, age);
        this.sound = sound;
    }

    // Getter and Setter methods
    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + sound + " " + sound + "]";
    }

    @Override
    public String feedLoadingSchedule() {
        return "8am-4pm";
    }
}
