package lab01.task04;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть текст:");
        String text = sc.nextLine();

        // Розділяємо текст на слова (за пробілами та розділовими знаками)
        String[] words = text.split("[\\s,.;:!?()\"']+");

        List<String> wordsWithDouble = new ArrayList<>();
        List<String> wordsWithoutDouble = new ArrayList<>();

        // Перевірка кожного слова
        for (String word : words) {
            if (hasDoubleLetter(word)) {
                wordsWithDouble.add(word);
            } else {
                wordsWithoutDouble.add(word);
            }
        }

        // Формуємо результати
        String removedWords = String.join(" ", wordsWithDouble);
        String remainingText = String.join(" ", wordsWithoutDouble);
System.out.println("Слова з подвоєнням літер:");
        System.out.println(removedWords.isEmpty() ? "немає" : removedWords);

        System.out.println("Текст після вилучення:");
        System.out.println(remainingText);
sc.close();
    }

    // Метод перевіряє, чи є у слові дві однакові літери підряд
    private static boolean hasDoubleLetter(String word) {
        for (int i = 0; i < word.length() - 1; i++) {
            char c1 = Character.toLowerCase(word.charAt(i));
            char c2 = Character.toLowerCase(word.charAt(i + 1));
            if (c1 == c2 && Character.isLetter(c1)) {
                return true;
            }
        }
        return false;
    }
}	