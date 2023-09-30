package ThingsThatMove;

// Exercise 3: ThingsThatMove

import java.util.ArrayList;

public class ThingsThatMove {
    public static void main(String[] args) {
        ArrayList<Movement> movingObjects = new ArrayList<>();

        movingObjects.add(new Airplane("Boeing 747", 2016));
        movingObjects.add(new Bird("Eagle"));
        movingObjects.add(new Bird("Hummingbird"));

        // Print moving object information
        for (Movement object : movingObjects) {
            System.out.println(object); // Comments should include descriptive text.
            object.fly();
            object.walk();
            object.jump();
            System.out.println();
        }
    }
}

