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

  @Override
  public String toString() {
    return "Dictionary []";
  }

  
}
