import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1
//        String input = "He110";
//        int digitCount = 0;
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (Character.isDigit(c)) {
//                digitCount++;
//            }
//        }
//        System.out.println("ციფრების რაოდენობა: " + digitCount);

//        //2
//        String input = "Hello! How are you?";
//        int sentenceCount = 0;
//        for (int i = 0; i < input.length(); i++) {
//            char c = input.charAt(i);
//            if (c == '.' || c == '?' || c == '!' || c == ';') {
//                sentenceCount++;
//            }
//        }
//        System.out.println("წინადადებების რაოდენობა: " + sentenceCount);


//        //3
//        String input = "aba";
//        PalindromeChecker checker = new PalindromeChecker();
//        if (checker.isPalindrome(input)) {
//            System.out.println("This string is palindrome!");
//        } else {
//            System.out.println("This string isn't palindrome!");
//        }


//        //4
//
//        String s1 = "trip";
//        String s2 = "I'm going on a trip";
//
//        SubstringChecker checker = new SubstringChecker();
//        if (checker.isSubstring(s1, s2)) {
//            System.out.println("s1 არის ქვესტრიქონი s2-ში.");
//        } else {
//            System.out.println("s1 არ არის ქვესტრიქონი s2-ში.");
//        }


//        //5
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ სტრიქონი: ");
//        String input = scanner.nextLine().trim();
//        VowelChecker checker = new VowelChecker();
//
//        if (input.length() > 0) {
//            char lastChar = input.charAt(input.length() - 1);
//            if (checker.isVowel(lastChar)) {
//                System.out.println("სტრინგი ხმოვნით მთავრდება.");
//            } else if (checker.isConsonant(lastChar)) {
//                System.out.println("სტრინგი თანხმოვნით მთავრდება.");
//            } else {
//                System.out.println("სტრინგი არ შეიცავს შესაბამის სიმბოლოს.");
//            }
//        } else {
//            System.out.println("error");
//        }
//
//        scanner.close();

//        //6
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("შეიყვანეთ ნიტას მიერ მიღებული სიტყვა: ");
//        String input = scanner.nextLine();  // სტრიქონის მიღება
//
//        // შეიქმნება ობიექტი StringRestorer კლასიდან
//        StringRestorer restorer = new StringRestorer();
//
//        // ეძებს თავდაპირველ სიტყვას
//        String originalWord = restorer.restoreOriginalWord(input);
//
//        // დაბეჭდავს თავდაპირველ სიტყვას
//        System.out.println("თავდაპირველი სიტყვა: " + originalWord);
//
//        scanner.close();


//        //7
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("შეიყვანეთ სიტყვა: ");
//        String word = scanner.nextLine().trim();
//        WordAbbreviation abbreviation = new WordAbbreviation();
//
//        if (abbreviation.isHugeWord(word)) {
//            String abbreviatedWord = abbreviation.getAbbreviation(word);
//            System.out.println("სიტყვა არის უზარმაზარი. მისი აბრევიატურა: " + abbreviatedWord);
//        } else {
//            System.out.println("სიტყვა არ არის უზარმაზარი.");
//        }
//
//        scanner.close();
    }
}