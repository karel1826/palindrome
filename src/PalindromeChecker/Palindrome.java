package PalindromeChecker;
import javax.swing.*;

public class Palindrome {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pengecek Palindrome Nhuravi");
        frame.setSize(450, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField inputField = new JTextField();
        inputField.setBounds(50, 30, 300, 30);

        JButton checkButton = new JButton("Cek Hasil");
        checkButton.setBounds(150, 80, 150, 30);

        checkButton.addActionListener(e -> {
            String input = inputField.getText();
            if (isPalindrome(input)) {
                JOptionPane.showMessageDialog(frame, inputField.getText() + " merupakan palindrome!");
            } else {
                JOptionPane.showMessageDialog(frame, inputField.getText() + " bukan palindrome.");
            }
        });

        frame.add(inputField);
        frame.add(checkButton);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
