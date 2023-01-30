package Tugas;

import java.awt.*;
import javax.swing.*;

public class KalkulatorLayout {
   private JFrame frame;
   private JTextField outputField;
   private JButton[] buttons;
   private String[] labels = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "+", "-", "*", "/", "=", "%", "Mod", "Exit" };

   public KalkulatorLayout() {
      frame = new JFrame("Kalkulator Bro");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setSize(600, 400);
      frame.setLayout(new BorderLayout());

      outputField = new JTextField(20);
      outputField.setEnabled(false);
      outputField.setHorizontalAlignment(JTextField.RIGHT);
      outputField.setPreferredSize(new Dimension(250, 50));
      outputField.setBorder(BorderFactory.createLineBorder(Color.GRAY));

      JPanel buttonPanel = new JPanel();
      buttonPanel.setLayout(new GridLayout(3, 5));
      buttons = new JButton[labels.length];

      for (int i = 0; i < labels.length; i++) {
         buttons[i] = new JButton(labels[i]);
         buttonPanel.add(buttons[i]);
      }

      frame.add(outputField, BorderLayout.NORTH);
      frame.add(buttonPanel, BorderLayout.CENTER);
      frame.setVisible(true);
   }

   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new KalkulatorLayout();
         }
      });
   }
}