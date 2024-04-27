import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class App {
    public static void main(String[] args) throws Exception {

        JButton butt = new JButton();
        butt.setBounds(225,250,100,50);
        butt.setText("klikk!!!");
        butt.addActionListener(ActionEvent -> JOptionPane.showMessageDialog(null,"thanks for u interacted with me"));
        
        JPanel pani1 = new JPanel();
        JPanel pani2 = new JPanel();
        JPanel pani3 = new JPanel();
        JPanel pani4 = new JPanel();
        JPanel pani5 = new JPanel();
        pani5.setLayout(null);
        pani5.add(butt);

        pani1.setBackground(Color.BLUE);
        pani2.setBackground(Color.GRAY);
        pani3.setBackground(Color.GREEN);
        pani4.setBackground(Color.RED);
        pani5.setBackground(Color.CYAN); 
//a méreteknél ebben az esetben ha borderlayouthoz adod hozzá akkor csak a szélesség válzotatható
        pani1.setPreferredSize(new Dimension(100,100));
        pani2.setPreferredSize(new Dimension(100,100));
        pani3.setPreferredSize(new Dimension(100,100));
        pani4.setPreferredSize(new Dimension(100,100));
        pani5.setPreferredSize(new Dimension(100,100));

        JFrame fremi = new JFrame();
        fremi.setVisible(true);
        fremi.setSize(750,750);
        fremi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fremi.setLocationRelativeTo(null);
        fremi.setLayout(new BorderLayout());
        fremi.add(pani1,BorderLayout.NORTH);
        fremi.add(pani2,BorderLayout.SOUTH);
        fremi.add(pani3,BorderLayout.WEST);
        fremi.add(pani4,BorderLayout.EAST);
        fremi.add(pani5,BorderLayout.CENTER);
        fremi.setEnabled(true);
        fremi.setResizable(false);
//A Borderlayoutnak 5 pozija van észak, dél, kelet, nyugat, közép

    }
   

    
}
