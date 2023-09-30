package ThingsThatFly;

// Exercise 2: ThingsThatFly

import java.util.ArrayList;

public class ThingsThatFly {
    public static void main(String[] args) {
        ArrayList<Flight> flyingObjects = new ArrayList<>();

        flyingObjects.add(new Airplane("Boeing 747", 2016));
        flyingObjects.add(new Bird("Eagle"));
        flyingObjects.add(new Bird("Hummingbird"));

        // Print flying object information
        for (Flight object : flyingObjects) {
            System.out.println(object); // Comments should include descriptive text.
            object.fly();
            System.out.println();
        }
    }
}
