package ThingsThatMove;
// Exercise 3: ThingsThatMove

// Class representing an airplane that can move
public class Airplane implements Movement {
    // Attributes
    private String model;
    private int yearBuilt;

    // Constructor
    public Airplane(String model, int yearBuilt) {
        this.model = model;
        this.yearBuilt = yearBuilt;
    }

    // Getter methods
    public String getModel() {
        return model;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", yearBuilt=" + yearBuilt + "]";
    }

    @Override
    public void fly() {
        System.out.println("I rely on my engine to fly.");
    }

    @Override
    public void walk() {
        System.out.println("I taxi on my wheels.");
    }

    @Override
    public void jump() {
        System.out.println("I cannot jump.");
    }
}

