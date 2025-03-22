import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        //1
//        String[] words = {"apple", "banana", "orange", "apple", "banana", "apple"};
//
//        HashMap<String, Integer> wordCount = new HashMap<>();
//
//        for (String word : words) {
//            if (wordCount.containsKey(word)) {
//                wordCount.put(word, wordCount.get(word) + 1);
//            } else {
//                wordCount.put(word, 1);
//            }
//        }
//
//        for (String word : wordCount.keySet()) {
//            System.out.println(word + ": " + wordCount.get(word));
//        }

//        //2
//        Student student = new Student("123", "Name", "LastName");
//
//        student.addGrade("ქართული", 1);
//        student.addGrade("ქართული", 4);
//        student.addGrade("ქართული", 7);
//        student.addGrade("ქართული", 8);
//        student.addGrade("ქართული", 9);
//        student.addGrade("ქართული", 10);
//        student.addGrade("ქართული", 10);
//        student.addGrade("ქართული", 10);
//        student.addGrade("ქართული", 2);
//
//        student.addGrade("მათემატიკა", 9);
//        student.addGrade("მათემატიკა", 8);
//        student.addGrade("მათემატიკა", 9);
//        student.addGrade("მათემატიკა", 8);
//        student.addGrade("მათემატიკა", 7);
//        student.addGrade("მათემატიკა", 7);
//        student.addGrade("მათემატიკა", 8);
//        student.addGrade("მათემატიკა", 9);
//        student.addGrade("მათემატიკა", 8);
//        student.addGrade("მათემატიკა", 10);
//
//        System.out.println(student.getStudentInfo() + " - Average Grade: " + student.getAverageGrade());


//        //3
//
//        Student3 student1 = new Student3("123", "Name1", "LastName1");
//        Student3 student2 = new Student3("456", "Name2", "LastName2");
//
//        student1.addGrade("ქართული", 1);
//        student1.addGrade("ქართული", 4);
//        student1.addGrade("ქართული", 7);
//        student1.addGrade("ქართული", 8);
//        student1.addGrade("ქართული", 9);
//        student1.addGrade("ქართული", 10);
//        student1.addGrade("ქართული", 10);
//        student1.addGrade("ქართული", 10);
//        student1.addGrade("ქართული", 2);
//
//        student1.addGrade("მათემატიკა", 9);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 9);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 7);
//        student1.addGrade("მათემატიკა", 7);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 9);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 10);
//
//        student2.addGrade("ქართული", 3);
//        student2.addGrade("ქართული", 6);
//        student2.addGrade("ქართული", 5);
//        student2.addGrade("ქართული", 7);
//        student2.addGrade("ქართული", 9);
//        student2.addGrade("ქართული", 8);
//        student2.addGrade("ქართული", 10);
//
//        student2.addGrade("მათემატიკა", 9);
//        student2.addGrade("მათემატიკა", 7);
//        student2.addGrade("მათემატიკა", 8);
//        student2.addGrade("მათემატიკა", 6);
//        student2.addGrade("მათემატიკა", 7);
//
//        System.out.println(student1.getStudentInfo() + " - Average Grade: " + student1.getAverageGrade());
//        System.out.println(student2.getStudentInfo() + " - Average Grade: " + student2.getAverageGrade());
//
//        int comparisonResult = student1.compareTo(student2);
//
//        if (comparisonResult > 0) {
//            System.out.println(student1.getStudentInfo() + " has a higher average grade.");
//        } else if (comparisonResult < 0) {
//            System.out.println(student2.getStudentInfo() + " has a higher average grade.");
//        } else {
//            System.out.println("Both students have the same average grade.");
//        }


//        //4
//
//        Student4 student1 = new Student4("123", "Name1", "LastName1");
//        Student4 student2 = new Student4("456", "Name2", "LastName2");
//        Student4 student3 = new Student4("789", "Name3", "LastName3");
//
//        student1.addGrade("ქართული", 1);
//        student1.addGrade("ქართული", 4);
//        student1.addGrade("ქართული", 7);
//        student1.addGrade("ქართული", 8);
//        student1.addGrade("ქართული", 9);
//        student1.addGrade("ქართული", 10);
//        student1.addGrade("ქართული", 10);
//        student1.addGrade("ქართული", 10);
//        student1.addGrade("ქართული", 2);
//
//        student1.addGrade("მათემატიკა", 9);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 9);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 7);
//        student1.addGrade("მათემატიკა", 7);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 9);
//        student1.addGrade("მათემატიკა", 8);
//        student1.addGrade("მათემატიკა", 10);
//
//        student2.addGrade("ქართული", 3);
//        student2.addGrade("ქართული", 6);
//        student2.addGrade("ქართული", 5);
//        student2.addGrade("ქართული", 7);
//        student2.addGrade("ქართული", 9);
//        student2.addGrade("ქართული", 8);
//        student2.addGrade("ქართული", 10);
//
//        student2.addGrade("მათემატიკა", 9);
//        student2.addGrade("მათემატიკა", 7);
//        student2.addGrade("მათემატიკა", 8);
//        student2.addGrade("მათემატიკა", 6);
//        student2.addGrade("მათემატიკა", 7);
//
//        student3.addGrade("ქართული", 4);
//        student3.addGrade("ქართული", 5);
//        student3.addGrade("ქართული", 6);
//        student3.addGrade("ქართული", 8);
//        student3.addGrade("ქართული", 7);
//        student3.addGrade("ქართული", 9);
//
//        student3.addGrade("მათემატიკა", 8);
//        student3.addGrade("მათემატიკა", 7);
//        student3.addGrade("მათემატიკა", 9);
//        student3.addGrade("მათემატიკა", 8);
//        student3.addGrade("მათემატიკა", 10);
//
//        ArrayList<Student4> students = new ArrayList<>();
//        students.add(student1);
//        students.add(student2);
//        students.add(student3);
//
//        System.out.println("Sorting by average grade:");
//        Collections.sort(students);
//        for (Student4 student : students) {
//            System.out.println(student.getStudentInfo() + " - Average Grade: " + student.getAverageGrade());
//        }
//
//        System.out.println("\nSorting by last name:");
//        Collections.sort(students, new StudentLastNameComparator());
//        for (Student4 student : students) {
//            System.out.println(student.getStudentInfo() + " - Average Grade: " + student.getAverageGrade());
//        }
    }
}
