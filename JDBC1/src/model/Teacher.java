package model;

public class Teacher {
    private int id;
    private String firstName;
    private String lastName;
    private int subjectId;
    private double salary;

    public Teacher(int id, String firstName, String lastName, int subjectId, double salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.subjectId = subjectId;
        this.salary = salary;
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

    public int getSubjectId() {
        return subjectId;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
