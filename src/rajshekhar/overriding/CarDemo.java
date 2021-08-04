package rajshekhar.overriding;

public class CarDemo {

    public static void main(String[] args) {
        drive(new Honda());
        drive(new Ford());
        drive(new Tata());
        drive(new MGHector());
        drive(new Kia());
    }

    public static void drive(Car car){
        System.out.println(car.display());
    }

}
