package rajshekhar.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();


        Student rohit = new Student();
        rohit.setStudentId(120000L);
        rohit.setMarks(69);
        rohit.setDivision("A");
        rohit.setStudentName("Rohit");
        rohit.setFavouriteSubject("JAVA");

        Student gautami = new Student();
        gautami.setStudentId(120001L);
        gautami.setMarks(70);
        gautami.setDivision("B");
        gautami.setStudentName("Gautami");
        gautami.setFavouriteSubject("JSP");

        Student pranali = new Student();
        pranali.setStudentId(120002L);
        pranali.setMarks(75);
        pranali.setDivision("B");
        pranali.setStudentName("Pranali");
        pranali.setFavouriteSubject("Spring");

        Student akshay = new Student();
        akshay.setStudentId(120003L);
        akshay.setMarks(80);
        akshay.setDivision("B");
        akshay.setStudentName("Akshay");
        akshay.setFavouriteSubject("Hibernate");


        // add to the list

        students.add(pranali);
        students.add(akshay);
        students.add(rohit);
        students.add(gautami);

        System.out.println("Before sort : " +students);

        Collections.sort(students);
        System.out.println("After sort : " +students);

    }


}
