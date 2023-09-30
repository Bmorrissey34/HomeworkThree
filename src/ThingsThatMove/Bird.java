package ThingsThatMove;
// Exercise 3: ThingsThatMove

// Class representing a bird that can move
public class Bird implements Movement {
    // Attribute
    private String type;

    // Constructor
    public Bird(String type) {
        this.type = type;
    }

    // Getter method
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Bird [type=" + type + "]";
    }

    @Override
    public void fly() {
        System.out.println("I flap my wings to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I walk on my feet.");
    }

    @Override
    public void jump() {
        System.out.println("I jump by leaping from my feet.");
    }
}
