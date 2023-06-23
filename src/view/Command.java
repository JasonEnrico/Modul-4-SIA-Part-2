package view;

import javax.swing.JOptionPane;

public class Command {
    public static String input(String _text) {
        return JOptionPane.showInputDialog(null, _text, JOptionPane.QUESTION_MESSAGE);
    }

    public static void message(String _text) {
        JOptionPane.showMessageDialog(null, _text, "", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void error(String _text) {
        JOptionPane.showMessageDialog(null, _text, "", JOptionPane.ERROR_MESSAGE);
    }

    public static int confirm(String _text) {
        return JOptionPane.showConfirmDialog(null, _text, "", JOptionPane.YES_NO_OPTION);
    }

    public static int login(Object[] _text) {
        return JOptionPane.showConfirmDialog(null, _text, "", JOptionPane.OK_CANCEL_OPTION);
    }
}
