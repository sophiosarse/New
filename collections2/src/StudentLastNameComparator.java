import java.util.Comparator;

public class StudentLastNameComparator implements Comparator<Student4> {

    @Override
    public int compare(Student4 o1, Student4 o2) {
        return o1.getStudentInfo().split(" ")[2].compareTo(o2.getStudentInfo().split(" ")[2]);
    }
}
