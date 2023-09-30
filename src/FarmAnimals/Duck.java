package FarmAnimals;
// Exercise 1: Farm Animals

// Subclass for Duck
public class Duck extends FarmAnimal {
    // Attribute
    private String sound;

    // Constructor
    public Duck(String name, String gender, double weight, int age, String sound) {
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
        return "8am-12pm-6pm";
    }
}
