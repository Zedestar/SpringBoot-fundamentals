package constructor.injection;

public class Car {
    private final Specification specification;

    public Car(Specification specification){
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Car{" +
                "specification=" + specification +
                '}';
    }
}
