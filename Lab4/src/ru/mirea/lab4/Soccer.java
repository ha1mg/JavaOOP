package ru.mirea.lab4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Soccer extends JFrame{
    JButton but1 = new JButton("AC Milan");
    JButton but2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel(" Result: 0 X 0 ");
    JLabel lbl2 = new JLabel(" Last Scorer: N/A ");
    JLabel lbl3 = new JLabel("Winner: DRAW");
    Font fnt = new Font("Times new roman",Font.BOLD,20);
    int a=0 ;
    int b=0;
    public Soccer()
    {
        super("Soccer: AC Milan x Real Madrid");
        setSize(480,230);
        setLayout(null);;
        lbl1.setBounds(45,80,100,20);
        lbl2.setBounds(125,80,250,20);
        lbl3.setBounds(290,80,200,20);
        but1.setBounds(80,130,100,20);
        but2.setBounds(200,130,120,20);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(but1);
        add(but2);
        but1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                a+=1;
                lbl1.setText("Result: "+a+" x "+b);
                lbl2.setText(" Last Scorer: AC Milan ");
                if(a>b)
                {
                    lbl3.setText((" Winner: AC Milan "));
                }
                else if(a<b)
                {
                    lbl3.setText((" Winner: Real Madrid "));
                }
                else
                {
                    lbl3.setText((" Winner: DRAW "));
                }
            }
        });
        setVisible(true);
        but2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                b+=1;
                lbl1.setText("Result: "+a+" x "+b);
                lbl2.setText("Last Scorer: Real Madrid");
                if(a>b)
                {
                    lbl3.setText(("Winner: AC Milan"));
                }
                else if(a<b)
                {
                    lbl3.setText(("Winner: Real Madrid"));
                }
                else
                {
                    lbl3.setText((" Winner: DRAW "));
                }
            }
        });
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new Soccer();
    }
}
