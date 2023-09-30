package FarmAnimals;

// Exercise 1: Farm Animals

import java.util.ArrayList;

public class MyFarm {
    public static void main(String[] args) {
        ArrayList<FarmAnimal> farmAnimals = new ArrayList<>();

        farmAnimals.add(new Duck("Donald", "male", 3.2, 5, "Quack"));
        farmAnimals.add(new Duck("Cheese", "female", 3.6, 5, "Quack"));
        farmAnimals.add(new Cow("Molly", "female", 1600.0, 3, "Moo"));
        farmAnimals.add(new Chicken("Albert", "male", 1.6, 2, "Cock-a-Doodle-doo"));
        farmAnimals.add(new Chicken("Amelia", "female", 1.8, 4, "Cluck"));
        farmAnimals.add(new Chicken("Dixie", "female", 1.7, 4, "Cluck"));

        // Print animal information
        for (FarmAnimal animal : farmAnimals) {
            System.out.println(animal); // Comments should include descriptive text.
            System.out.println(animal.feedLoadingSchedule());
            System.out.println();
        }
    }
}
