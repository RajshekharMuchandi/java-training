package overriding;

public class Honda implements Car{
    @Override
    public String display() {
        return "DRIVING HONDA CAR";
    }

    @Override
    public String toString() {
        return "Honda{}";
    }
}
