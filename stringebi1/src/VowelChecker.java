public class VowelChecker {
    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'y';
    }

    public boolean isConsonant(char c) {
        c = Character.toLowerCase(c);
        return (c >= 'ა' && c <= 'ჰ') && !isVowel(c);
    }
}
