package net.duolingo.dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Dictionary {
  static private Map<String, Set<String>> dictionary = new HashMap<>();

  public static Map<String, Set<String>> getDictionary() {
    return dictionary;
  }

  public static void setDictionary(Map<String, Set<String>> dictionary) {
    Dictionary.dictionary = dictionary;
  }

  public static void addSet(String initial, Set<String> setWords) {
    dictionary.put(initial, setWords);

  }

  public static String getKeySets() {
    String keysSets = "";
    Set<String> keys = dictionary.keySet();

    for (String key : keys) {
      keysSets += key + "\n";
    }
    return keysSets;
  }

  @Override
  public String toString() {
    return "Dictionary []";
  }

}
