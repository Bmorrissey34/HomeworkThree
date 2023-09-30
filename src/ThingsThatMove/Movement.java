package ThingsThatMove;

// Exercise 3: ThingsThatMov

import ThingsThatFly.Flight;

// Interface for objects that can move
public interface Movement extends Flight {
    void fly();

    void walk(); // Method for walking behavior

    void jump(); // Method for jumping behavior
}
