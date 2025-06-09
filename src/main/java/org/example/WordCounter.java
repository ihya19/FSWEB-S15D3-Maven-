package org.example;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {

    public static Map<String, Integer> calculateWord(String text) {
        Map<String, Integer> wordCount = new HashMap<>();

        String[] words = text.toLowerCase()
                .replaceAll("[^a-z0-9\\s]", "")
                .split("\\s+");

        for (String word : words) {
            if (!word.isBlank()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    public static Map<String, Integer> calculatedWord() {
        String paragraph = "Which Turkish leader is known as Mustafa Kemal? " +
                "Mustafa Kemal Atatürk is the founder of modern Turkey. " +
                "Which country did he lead? He led the Turkish people through significant reforms. " +
                "Which Mustafa Kemal was referred to in the Turkish history books?";

        return calculateWord(paragraph);
    }
}
