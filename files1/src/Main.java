import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1
//        String filePath = "output.txt";
//        String[] lines = {
//                "შიგან ასრე გავერივე, გნილის ჯოგსა ვითა ქორი,",
//                "კაცი კაცსა შემოვტყორცნე, ცხენ-კაცისა დავდგი გორი;",
//                "კაცი, ჩემგან გატყორცნილი ბრუნავს ვითა ტანაჯორი,",
//                "ერთობ სრულად ამოვწყვიდე წინა კერძო რაზმი ორი."
//        };
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//            for (String line : lines) {
//                writer.write(line);
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //2
//        int wordCount = 0;
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                String[] words = line.split("\\s+");
//                wordCount += words.length;
//            }
//            System.out.println("სიტყვების საერთო რაოდენობა ფაილში: " + wordCount);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        //3

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ სიტყვა: ");
//        String wordToSearch = scanner.nextLine();
//        boolean wordFound = false;
//        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
//            String line;
//            while ((line = reader.readLine()) != null) {
//                if (line.contains(wordToSearch)) {
//                    wordFound = true;
//                    break;
//                }
//            }
//            if (wordFound) {
//                System.out.println("ფაილში არის სიტყვა: \"" + wordToSearch + "\"");
//            } else {
//                System.out.println("ფაილში არ არის სიტყვა: \"" + wordToSearch + "\"");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        scanner.close();

        //4

//        String filePath = "new_output.txt";
//        String text = "Assure polite his real and other figures though. Day age advantages\n" +
//                        "and sufficient eating expression traveling. Of on am father by agreed\n" +
//                        "supply rather either. Own handsome delicate property mistresses her\n" +
//                        "end appetite. Mean are sons too sold nor said. Son share three men\n" +
//                        "power by you. Now merits wonder effect garret own.";
//
//        //b)
//        String upperCaseText = text.toUpperCase();
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
//            writer.write(upperCaseText);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


        //5

//        String file1Path = "file1.txt";
//        String file2Path = "file2.txt";
//        String outputFilePath = "merged_output.txt";
//
//        try (BufferedReader reader1 = new BufferedReader(new FileReader(file1Path));
//             BufferedReader reader2 = new BufferedReader(new FileReader(file2Path));
//             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
//
//            writer.write("first file\n");
//            String line;
//            while ((line = reader1.readLine()) != null) {
//                writer.write(line);
//                writer.newLine();
//            }
//            writer.newLine();
//            writer.write("second file\n");
//            while ((line = reader2.readLine()) != null) {
//                writer.write(line);
//                writer.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
