package setter.injection;

import setter.injection.Specification;

public class Car {

    private Specification specification;

    public Specification getSpecification() {
        return specification;
    }

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Car{" +
                "specification=" + specification +
                '}';
    }
}
