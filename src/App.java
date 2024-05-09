import java.util.Scanner;

import javax.swing.JOptionPane;

import net.duolingo.dictionary.Dictionary;
import net.duolingo.menu.Menu;
import net.duolingo.word.Word;

public class App {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Boolean keepAsking = true;
        // int option = 0;
        String word;

        while (keepAsking) {
            // while (keepAsking) {
            // System.out.println(Menu.printMenu());
            // try {
            // option = Integer.parseInt(kb.nextLine());
            // keepAsking = false;
            // } catch (NumberFormatException e) {
            // System.out.println("La cadena no representa un número válido.");
            // keepAsking = true;
            // System.out.println(Menu.printMenu());
            // }

            // }

            keepAsking = true;

            switch (Menu.printMenu()) {
                case 1:
                    word = JOptionPane.showInputDialog("Por favor, introduce una palabra:");
                    Word.addWord(word);
                    JOptionPane.showMessageDialog(null, "Añadiendo palabra");
                    JOptionPane.showMessageDialog(null, Dictionary.getDictionary());
                    break;
                case 2:
                    word = JOptionPane.showInputDialog("Por favor, introduce una palabra:");
                    Word.deleteWord(word);
                    break;

                case 3:
                    word = JOptionPane.showInputDialog("Por favor, introduce una palabra:");
                    Word.isThereAWord(word);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, Dictionary.getKeySets());
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, Dictionary.getDictionary().get("a"));
                    // keepAsking = false;

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