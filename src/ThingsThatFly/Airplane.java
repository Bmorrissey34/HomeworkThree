package ThingsThatFly;

// Exercise 2: ThingsThatFly

// Class representing an airplane
public class Airplane implements Flight {
    // Attributes
    private String model; // Variable names should be descriptive.
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
    // ...

    @Override
    public String toString() {
        return "Airplane [model=" + model + ", yearBuilt=" + yearBuilt + "]";
    }

    @Override
    public void fly() {
        System.out.println("I'm an airplane that relies on an engine to fly.");
    }
}
