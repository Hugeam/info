package Lesson8;

public class StringUtils {

    public static int findSymbolOccurrence(String str, char symbol) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == symbol) {
                count++;
            }
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        String normalizedStr = str.toLowerCase();
        return normalizedStr.equals(new StringBuilder(normalizedStr).reverse().toString());
    }
}
