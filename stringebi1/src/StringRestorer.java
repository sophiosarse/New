public class StringRestorer {
    public String restoreOriginalWord(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (i == 0 || input.charAt(i) != input.charAt(i - 1)) {
                result.append(input.charAt(i));
            }
        }
        return result.toString();
    }
}
