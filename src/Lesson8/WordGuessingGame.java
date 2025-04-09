package Lesson8;

import java.util.Random;
import java.util.Scanner;

    public class WordGuessingGame {
        private final String[] words = {
                "apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
                "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"
        };

        public void startGame() {
            Random random = new Random();
            String secretWord = words[random.nextInt(words.length)];
            Scanner scanner = new Scanner(System.in);
            String userGuess;

            System.out.println("Guess the hidden word!");

            while (true) {
                System.out.print("Enter your word: ");
                userGuess = scanner.nextLine();

                if (userGuess.equals(secretWord)) {
                    System.out.println("Congratulations! You guessed the right word: " + secretWord);
                    break;
                } else {
                    StringBuilder hint = new StringBuilder();
                    for (int i = 0; i < secretWord.length(); i++) {
                        if (i < userGuess.length() && secretWord.charAt(i) == userGuess.charAt(i)) {
                            hint.append(secretWord.charAt(i));
                        } else {
                            hint.append('#');
                        }
                    }
                    while (hint.length() < 15) {
                        hint.append('#');
                    }
                    System.out.println("Hint: " + hint.toString());
                }
            }
            scanner.close();
        }
    }
