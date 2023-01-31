package tugas13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class tic_tac_toe extends JFrame implements ActionListener{
    boolean a = true;
    JButton[] btn = new JButton[9];
    GridLayout gl = new GridLayout(3,3);
    JFrame frame = new JFrame();

    tic_tac_toe(){
        super("Tic-Tac-Toe");
        setSize(300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(gl);
        
        for(int i = 0; i < 9; i++){
            btn[i] = new JButton();
            btn[i].setBackground(Color.gray);
            btn[i].addActionListener(this);
            add(btn[i]);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        tic_tac_toe t = new tic_tac_toe();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (int i = 0; i < 9; i++){
            if(e.getSource() == btn[i] && btn[i].getText().isEmpty()){
                if(a){
                    btn[i].setText("X");
                    a = !a;
                }
                else{
                    btn[i].setText("O");
                    a = !a;
                }
                btn[i].setBackground(Color.white);
            }
        }

        
    }

}