
// import javax.swing.JFrame;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.colorchooser.DefaultColorSelectionModel;

public class Swingjava extends JFrame {

    Swingjava() {

        JButton jbtn = new JButton("Click here");
        jbtn.setBounds(50, 10, 100, 20);
        jbtn.setForeground(Color.green);

        JLabel jLabel = new JLabel("here is the lable");
        jLabel.setBounds(50, 50, 100, 50);
        jLabel.setForeground(Color.red);

        JTextField jTextField = new JTextField();
        jTextField.setBounds(50, 100, 200, 50);

        TextArea textArea = new TextArea("Address");
        textArea.setBounds(50, 200, 200, 100);
        textArea.setBackground(Color.lightGray);
        textArea.setForeground(Color.red);

        jbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText("ing on randash");
                jTextField.setText("its not working yaar");
                jbtn.setBackground(Color.yellow);
            }
        });
        add(textArea);
        add(jTextField);
        setDefaultCloseOperation(EXIT_ON_CLOSE); // for work close btn
        add(jLabel);
        add(jbtn);
        setLayout(null);
        setSize(400, 500);
        setVisible(true);
        setTitle("this is my first Swing experience");

    }

    public static void main(String[] args) {
        new Swingjava();
    }

}
