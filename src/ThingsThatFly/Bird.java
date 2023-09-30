package ThingsThatFly;

// Exercise 2: ThingsThatFly

// Class representing a bird
public class Bird implements Flight {
    // Attribute
    private String type; // Variable names should be descriptive.

    // Constructor
    public Bird(String type) {
        this.type = type;
    }

    // Getter methods
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }

    @Override
    public void fly() {
        System.out.println("I'm a bird who flaps my wings to fly.");
    }
}
