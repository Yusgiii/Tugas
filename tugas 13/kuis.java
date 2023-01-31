package tugas13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class kuis extends JFrame implements ActionListener {
    
    int a,b;
    JTextField input = new JTextField();
    JLabel keterangan = new JLabel();
    JPanel dsp;

    kuis(){
        super("kuis Alakadar");
        setSize(450, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        dsp = new JPanel(fl);
        dsp.setBounds(0, 0, 450, 75);
        dsp.setOpaque(false);

        setRandom();
        
        JLabel icon = new JLabel("=");
        dsp.add(icon);

        dsp.add(input);
        input.setPreferredSize(new Dimension(125, 50));
        add(dsp);
        
        JPanel btnpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnpanel.setBounds(0, 75, 450, 75);
        btnpanel.setOpaque(false);;
        
        JButton check = new JButton("Check");
        check.setPreferredSize(new Dimension(250,30));
        btnpanel.add(check);

        add(btnpanel);

        keterangan.setBounds(20, 125, 450, 30);
        add(keterangan);

        check.addActionListener(this);

        setVisible(true);
    }

    public void setRandom(){

        Random rand = new Random();
        a = rand.nextInt(10);
        b = rand.nextInt(10);

        JTextField input1 = new JTextField();
        input1.setText(Integer.toString(a));
        dsp.add(input1);
        input1.setPreferredSize(new Dimension(122, 50));
        input1.setEditable(false);

        JTextField input2 = new JTextField();
        input2.setText(Integer.toString(b));
        dsp.add(input2);
        input2.setPreferredSize(new Dimension(122, 50));
        input2.setEditable(false);
    }

    public static void main(String[] args) {
        kuis dadakan = new kuis();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            int hasil = Integer.parseInt(input.getText());
            
            if(a + b == hasil){
                getContentPane().setBackground(Color.green);
                keterangan.setText("Selamat jawaban anda benar!!!");
            }
            else{
                getContentPane().setBackground(Color.red);
                keterangan.setText("Maaf jawaban anda salah!!!");

            }
            
        } catch (Exception p) {
            System.out.println(p.getMessage());
        }
        
    }
    
}