package Lesson8;

public class Lesson8 {
    public static void main(String[] args) {

        System.out.println("Quantity 'a' в 'banana': " + StringUtils.findSymbolOccurrence("banana", 'a'));
        System.out.println("Position 'le' в 'lemon': " + StringUtils.findWordPosition("lemon", "le"));
        System.out.println("Reverse 'Hello': " + StringUtils.stringReverse("Hello"));
        System.out.println("'ERE' palindrome? " + StringUtils.isPalindrome("ERE"));

        WordGuessingGame game = new WordGuessingGame();
        game.startGame();
    }
}
