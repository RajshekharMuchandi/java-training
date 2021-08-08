package rajshekhar.generics;


public class GenericsDemo {

    public static void main(String[] args) {
       Display<String, Integer> stringDisplay = new Display<>();
       stringDisplay.display("abc", 2);

        Display<Integer, String> intDisplay = new Display<>();
        intDisplay.display(123, "724");

        Display<Double, String> doubleDisplay = new Display<>();
        doubleDisplay.display(14.5, "efews");

        Display<Float,Integer> floatDisplay = new Display<>();
        floatDisplay.display(45.2f, 6);

        Student rohit = new Student();
        rohit.setStudentId(120000L);
        rohit.setMarks(69);
        rohit.setDivision("A");
        rohit.setStudentName("Rohit");
        rohit.setFavouriteSubject("JAVA");
        Display<Student, Integer> studentDisplay = new Display<>(rohit);
        studentDisplay.display(rohit, 89);
 }
}
