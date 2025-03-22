import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private HashMap<String, ArrayList<Integer>> grades;

    public Student(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = new HashMap<>();
    }

    public void addGrade(String subject, int grade) {
        grades.putIfAbsent(subject, new ArrayList<>());
        grades.get(subject).add(grade);
    }

    public double getAverageGrade() {
        int totalGrades = 0;
        int gradeCount = 0;

        for (Map.Entry<String, ArrayList<Integer>> entry : grades.entrySet()) {
            ArrayList<Integer> subjectGrades = entry.getValue();
            for (Integer grade : subjectGrades) {
                totalGrades += grade;
                gradeCount++;
            }
        }

        if (gradeCount == 0) {
            return 0.0;
        }

        return (double) totalGrades / gradeCount;
    }

    public String getStudentInfo() {
        return "ID: " + id + ", Name: " + firstName + " " + lastName;
    }
}
