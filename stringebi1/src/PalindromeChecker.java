public class PalindromeChecker {
    public boolean isPalindrome(String input) {
        input = input.replaceAll("[^a-zA-Zა-ჰ]", "").toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}
