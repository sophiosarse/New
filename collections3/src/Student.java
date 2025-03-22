import java.util.*;

public class Student {
    private String firstName;
    private String lastName;
    private Date birthDate;
    private ArrayList<Double> grades;

    public Student(String firstName, String lastName, Date birthDate, ArrayList<Double> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.grades = grades;
    }
    public double calculateAverageGrade() {
        if (grades.isEmpty()) return 0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " | Birth Date: " + birthDate + " | Average Grade: " + calculateAverageGrade();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public ArrayList<Double> getGrades() {
        return grades;
    }
}
