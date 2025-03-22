import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //1
//        int[] numbers = {1, 2, 5, 10, 15, 20, 25};
//        System.out.println("რიცხვები: " + Arrays.toString(numbers));
//
//        int sumOfSquares = Arrays.stream(numbers)
//                .filter(num -> num >= 10)
//                .map(num -> num * num)
//                .sum();
//
//        System.out.println("რიცხვების კვადრატების ჯამი: " + sumOfSquares);

//        //2
//        List<String> words = Arrays.asList("Java", "python", "JavaScript", "ruby", "c++");
//
//        List<String> result = words.stream()
//                .filter(word -> word.startsWith("J"))
//                .map(String::toUpperCase)
//                .collect(Collectors.toList());
//
//        System.out.println(result);

//        //3
//        List<String> words = Arrays.asList("banana", "apple", "cherry", "apple", "cherry");
//        Set<String> sortedSet = words.stream()
//                .sorted()
//                .collect(Collectors.toSet());
//        System.out.println(sortedSet);

        //4

//        List<Human> humans = Arrays.asList(
//                new Human("Levan", 20),
//                new Human("Nino", 14),
//                new Human("Levani", 18),
//                new Human("Giorgi", 12),
//                new Human("Mariam", 17)
//        );
//        List<Human> filteredHumans = humans.stream()
//                .filter(human -> human.getAge() >= 15)
//                .collect(Collectors.toList());
//
//        System.out.println("განახლებული სია: " + filteredHumans);
//
//        boolean exists = filteredHumans.stream()
//                .anyMatch(human -> human.getName().equals("Levani"));
//
//        System.out.println("არსებობს Levani? " + exists);

//        //5
//        List<Integer> numbers = Arrays.asList(5, 3, 9, 1, 9, 4, 7, 3, 10);
//
//        Integer secondSmallest = numbers.stream()
//                .distinct()
//                .sorted()
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//        //დამატებითი
//        Integer secondLargest = numbers.stream()
//                .distinct()
//                .sorted((a, b) -> b - a)
//                .skip(1)
//                .findFirst()
//                .orElse(null);
//
//        System.out.println("მეორე ყველაზე მცირე ელემენტი: " + secondSmallest);
//        System.out.println("მეორე ყველაზე დიდი ელემენტი: " + secondLargest);

    }
}
