import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String firstName;
    private String lastName;
    private int year;
    private double grade;
    private List<String> subjects;

    public Student(int id, String firstName, String lastName, int year, double grade, List<String> subjects) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.year = year;
        this.grade = grade;
        this.subjects = subjects;
    }
//    //v2
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, firstName, grade);
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return id == student.id &&
//                subjects.containsAll(student.subjects) &&
//                student.subjects.containsAll(subjects);
//    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', year=" + year +
                ", grade=" + grade + ", subjects=" + subjects + '}';
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getYear() {
        return year;
    }

    public double getGrade() {
        return grade;
    }

    public List<String> getSubjects() {
        return subjects;
    }
}