package overriding;

public class Kia implements Car{
    @Override
    public String display() {
        return "DRIVING KIA CAR";
    }

    @Override
    public String toString() {
        return "Kia{}";
    }
}
