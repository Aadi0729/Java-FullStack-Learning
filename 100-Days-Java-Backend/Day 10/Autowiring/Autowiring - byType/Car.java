package car.example.autowire.type;

public class Car {
    private Specification specification1;

    public void setSpecification1(Specification specification) {
        this.specification1 = specification;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + specification1.toString());
    }
}
