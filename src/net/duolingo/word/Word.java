package net.duolingo.word;

import net.duolingo.dictionary.Dictionary;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;

public class Word {
    // private String palabra;

    public static String getInitial(String word) {

        return word.substring(0, 1);
    }

    public static String wordCleaner(String word) {

        return word.toLowerCase().replaceAll("[^A-Za-z]", "");
    }

    public static void addWord(String word) {
        if (!Dictionary.getDictionary().containsKey(getInitial(word))) {

            Set<String> words = new HashSet<>();
            words.add(wordCleaner(word));
            Dictionary.getDictionary().put(getInitial(word), words);

        } else if (Dictionary.getDictionary().containsKey(getInitial(word))) {
            Set<String> words = Dictionary.getDictionary().getOrDefault(getInitial(word), new HashSet<>());
            words.add(wordCleaner(word));
            Dictionary.getDictionary().put(getInitial(word), words);

        }

    }

    public static void addWordByCamilo(String word) {
        // Dictionary.setDictionary(getInitial(word), wor);
        Set<String> words = new HashSet<>(Dictionary.getDictionary().get(getInitial(word)));
        System.out.println(words);

        if (Dictionary.getDictionary().containsKey(getInitial(word))) {

        }
    }

}
