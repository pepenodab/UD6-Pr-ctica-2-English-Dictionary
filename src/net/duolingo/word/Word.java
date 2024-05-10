package net.duolingo.word;

import net.duolingo.dictionary.Dictionary;
import java.util.Set;

import javax.swing.JOptionPane;

import java.util.HashSet;

public class Word {

    public static String getInitial(String word) {

        return wordCleaner(word).substring(0, 1);
    }

    public static String wordCleaner(String word) {

        return word.toLowerCase().replaceAll("[^A-Za-z]", "");
    }

    public static Set<String> setCopier(String word) {
        Set<String> words = new HashSet<>(Dictionary.getDictionary().get(getInitial(word)));
        return new HashSet<>(words);
    }

    public static void addWord(String word) {
        if (Dictionary.getDictionary().containsKey(getInitial(word))) {
            Set<String> words = setCopier(word);
            words.add(wordCleaner(word));
            Dictionary.addSet(getInitial(word), words);
        } else {
            Set<String> words = new HashSet<>();
            words.add(wordCleaner(word));
            Dictionary.addSet(getInitial(word), words);
        }
    }

    public static boolean isThereAWord(String word) {
        Set<String> words = setCopier(word);
        if (words.contains(word)) {
            JOptionPane.showMessageDialog(null, "la palabra  fue encontrada");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "la palabra no fue encontrada");
            return false;
        }

    }

    public static void deleteWord(String word) {
        Set<String> words = setCopier(word);
        if (words.contains(word)) {
            words.remove(word);
            Dictionary.addSet(getInitial(word), words);
            JOptionPane.showMessageDialog(null, "la palabra  fue eliminada");
        } else {
            JOptionPane.showMessageDialog(null, "la palabra no fue encontrada");
        }
    }

}
