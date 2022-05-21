import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {


        MyFrame test = new MyFrame();

        JButton b=new JButton("Click Here");
        b.setBounds(50,100,120,30);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(test,
                        "Eggs are not supposed to be green.");
            }
        });

        test.add(b);












    }
}
