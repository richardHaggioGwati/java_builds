import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;


    public Main() {
        frame = new JFrame();

        JButton button = new JButton("New Student");
        button.addActionListener(this);
        label = new JLabel();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 300, 500, 300));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("School Management");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number: " + count);
    }
}
