package rajshekhar.sort.comparator;

import rajshekhar.sort.model.Student;

import java.util.Comparator;

public class MarksComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getMarks() - o2.getMarks();
    }
}
