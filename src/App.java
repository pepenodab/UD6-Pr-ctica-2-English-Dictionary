import net.duolingo.dictionary.Dictionary;
import net.duolingo.word.Word;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(Word.wordCleaner("hol12 3123# $#@ %@a"));
        // System.out.println(Word.initialChecker("pepepollachica"));
        System.out.println(Dictionary.getDictionary().containsKey(Word.getInitial("word")));

        Word.addWord("peponcio");
        System.out.println(Dictionary.getDictionary().containsKey("p"));
        Word.addWord("peponcio2");
        System.out.println(Dictionary.getDictionary().containsKey("p"));
        System.out.println(Dictionary.getDictionary());
        System.out.println(Word.addWordByCamilo());
    }
}
