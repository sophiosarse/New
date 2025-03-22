public class WordAbbreviation {
    public boolean isHugeWord(String word) {
        return word.length() > 10;
    }
    public String getAbbreviation(String word) {
        if (word.length() > 10) {
            return word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
        } else {
            return word;
        }
    }
}
