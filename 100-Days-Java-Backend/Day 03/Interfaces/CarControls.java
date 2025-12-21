package Day03.interfaces;

// Team B
public interface CarControls {
    void turnRight();
    void turnLeft();
    void applyBrakes();

    /**
     * In previous versions method definition is not allowed in Interfaces,
     * but now we methods can be defined using default keyword
     */


    /* // Not allowed
    void accelerate() {

    }
    */

    /* // Allowed
    default void accelerate() {

    }
    */
}
