package rajshekhar.overloading;

public class Overloading {

    public static void main(String[] args) {
         Calculator calculator = new Calculator();
         System.out.println(calculator.add(2,2));
        System.out.println(calculator.add(2,2, 3));
        System.out.println(calculator.add(3.5f,2.0f));
        System.out.println(calculator.add(4.5,2.0));
    }
}
