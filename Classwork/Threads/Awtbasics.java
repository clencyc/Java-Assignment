import java.awt.*;
import java.awt.event.*;

class First extends Frame {
    private int counter = 0;
    private Label label;

    First() {
        Button b = new Button("Click me");
        b.setBounds(30, 100, 80, 30); // setting button position
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText("Button clicked " + counter + " times");
            }
        });
        label = new Label("Button clicked 0 times");
        label.setBounds(30, 80, 200, 20);

        add(b);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        First f = new First();
        f.setTitle("First Frame");
    }
}