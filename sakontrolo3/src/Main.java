//1) a.შეამოწმოს ორი ცვლადი მიუთითებს თუ არა ერთსა და იმავე მისამართზე მეხსიერებაში
//2) a. თუ ორი ობიექტი ტოლია equals() მეთოდით, მაშინ hashCode() მეთოდმა ორივე ობიექტის შემთხვევაში იგივე უნდა დააბრუნოს
//3) a. d.
//4) c.
//5) a. b. c.
//6) b. მისი მნიშვნელობის შეცვლა შეუძლებელია შექმნის შემდგომ
//7) c. equals()
//8) b. true , false
//9) b. IndexOutOfBoundsException
//10) c. Caught ArrayIndexOutOfBoundsException
//       Finally block executed
//11) c.3
//12) b.
//13) a. b. c.
//14)  b. d.
//15) b. c.


import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        String inputFile = "students.txt";

        String filePath = "C:\\Users\\GeoComputers\\Desktop\\classwork\\students.txt";

        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String outputFile = "students.ser";
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFile))) {
            oos.writeObject(students);
            System.out.println("Data has been serialized successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFile))) {
            List<Student> deserializedStudents = (List<Student>) ois.readObject();
            System.out.println("\nDeserialized Students:");
            for (Student student : deserializedStudents) {
                System.out.println(student);
            }
//            //v2
//            deserializedStudents.sort(Comparator.comparingDouble(Student::getGrade));
//
//            System.out.println("\nSorted Students by avgScore (ascending):");
//            for (Student student : deserializedStudents) {
//                System.out.println(student);
//            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
