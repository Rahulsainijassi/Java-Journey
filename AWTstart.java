import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class AWTstart extends Frame {
    public AWTstart() {

        TextField txtfld = new TextField();
        txtfld.setBounds(10, 10, 200, 50);

        Label label = new Label("Enter text here");
        label.setBounds(10, 70, 200, 50);

        Button btn = new Button("Click here");
        btn.setBounds(20, 130, 200, 50);
        btn.setBackground(Color.yellow);

        // for cross button work
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setSize(400, 600);
        setLayout(null);
        setVisible(true);
        add(label);
        add(txtfld);
        add(btn);
    }

    // class AWTstart {
    // AWTstart() {

    // TextField txtfld = new TextField();
    // txtfld.setBounds(50, 50, 100, 30);

    // Label label = new Label("hello meri jaan");
    // label.setBounds(20, 180, 100, 50);

    // Button btn = new Button("click here");
    // btn.setBounds(20, 280, 100, 50);
    // btn.setBackground(Color.red);
    // btn.setForeground(Color.green);

    // Frame frame = new Frame("titel here");
    // frame.setSize(400, 600);
    // frame.setLayout(null);
    // frame.setVisible(true);
    // frame.add(label);
    // frame.add(txtfld);
    // frame.add(btn);

    // }

    public static void main(String args[]) {
        new AWTstart();
    }
}