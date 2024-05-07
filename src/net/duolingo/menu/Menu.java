package net.duolingo.menu;

import javax.swing.JOptionPane;

public class Menu {
    public static int printMenu() {
        try {
            int integer = Integer.parseInt(JOptionPane.showInputDialog("""
                    1. Añadir palabra.
                    2. Eliminar palabra.
                    3. Existe palabra.
                    4. Mostrar iniciales disponibles.
                    5. Ver palabras por inicial.
                    6. Cerrar programa.
                        """));

            return integer;

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un numero");
        }

        return -100;
    }
}
