/**
 * When you create a child class object (e.g., new Car()), the JVM allocates memory for the entire object (parent + child parts).
 * Before the child constructor runs, Java mandatorily calls the parent constructor using super(...) (explicitly or implicitly).
 * This ensures the parent part of the object is fully initialized first, and only then the child-specific initialization executes.
 *
 * Construction order (always):
 * Object → Parent → Child
 */

package Day03.inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 200, 5);
        c1.displayInfo();

        Bike b1 = new Bike("Hayabusa", 160, true);
        b1.displayInfo();
    }
}
