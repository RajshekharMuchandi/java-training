package rajshekhar.sort.model;

public class Student implements Comparable<Student>{

    private Long studentId; // default sorting

    private String studentName; // NameComparator

    private int marks; // MarksComparator

    private String division; // DivisionComparator

    private String favouriteSubject; // SubjectComparator

    public Long getStudentId() {
        return studentId;
    }

    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", marks=" + marks +
                ", division='" + division + '\'' +
                ", favouriteSubject='" + favouriteSubject + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(Long anotherId) {
//        return (int) (studentId - anotherId);
//    }

    @Override
    public int compareTo(Student o) {
//        return (int) (studentId - o.getStudentId());
//        return studentName.compareTo(o.getStudentName());
        return o.getStudentName().compareTo(studentName);
    }

//    @Override
//    public int compareTo(Object o) {
//        return (int) (studentId - ()o);
//    }
}
