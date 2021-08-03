package overriding;

public class Ford implements Car{
    @Override
    public String display() {
        return "DRIVING FORD CAR";
    }

    @Override
    public String toString() {
        return "Ford{}";
    }
}
