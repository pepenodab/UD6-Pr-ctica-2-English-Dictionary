import java.util.Scanner;

import javax.swing.JOptionPane;

import net.duolingo.dictionary.Dictionary;
import net.duolingo.menu.Menu;
import net.duolingo.word.Word;

public class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Boolean keepAsking = true;
        String word;

        while (keepAsking) {

            switch (Menu.printMenu()) {
                case 1:
                    word = JOptionPane.showInputDialog("Por favor, introduce una palabra:");
                    Word.addWord(word);
                    JOptionPane.showMessageDialog(null, "Añadiendo palabra...");
                    break;

                case 2:
                    if(Dictionary.getDictionary().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El diccionario se encuentra vacio, primero ingrese palabras en el diccionario");
                        break;
                    } else {
                        word = JOptionPane.showInputDialog("Por favor, introduce una palabra:");
                        Word.deleteWord(Word.wordCleaner(word));
                        break;
                    }

                case 3:
                    if(Dictionary.getDictionary().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El diccionario se encuentra vacio, primero ingrese palabras en el diccionario");
                        break;
                    } else {
                        word = JOptionPane.showInputDialog("Por favor, introduce una palabra:");
                        Word.isThereAWord(Word.wordCleaner(word));
                        break;
                    }

                case 4:
                    JOptionPane.showMessageDialog(null, Dictionary.getKeySets());
                    break;
                case 5:
                    if(Dictionary.getDictionary().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "El diccionario se encuentra vacio, primero ingrese palabras en el diccionario");
                    } else {
                        String initial = JOptionPane.showInputDialog(null, "Ingrese la inicial para buscar en el diccionario").toLowerCase();
                        JOptionPane.showMessageDialog(null, Dictionary.getDictionary().get(initial));
                    };

                    break;
                case 6:
                    keepAsking = false;
                    break;
                default:
                    break;
            }
        }

        kb.close();
    }
}