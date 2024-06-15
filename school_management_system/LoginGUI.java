import java.awt.*;
import java.awt.event.*;

public class LoginGUI extends Frame implements ActionListener {
    private final TextField textUsername;
    private final TextField textPassword;

    public LoginGUI() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        Panel panel = new Panel(new GridBagLayout());

        Label labelUsername = new Label("Username:");
        Label labelPassword = new Label("Password:");
        textUsername = new TextField(25);
        textPassword = new TextField(25);
        textPassword.setEchoChar('*');
        Button buttonLogin = new Button("Login");
        Button buttonCancel = new Button("Cancel");
        Button buttonSignup = new Button("Sign up");

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(5, 5, 5, 5); // Add padding between components
        panel.add(labelUsername, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(textUsername, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelPassword, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(textPassword, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(buttonLogin, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(buttonSignup, gbc);

        gbc.gridx = 2;
        gbc.gridy = 2;
        panel.add(buttonCancel, gbc);

        // Center the panel in the frame
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(panel, gbc);

        buttonLogin.addActionListener(this);
        buttonSignup.addActionListener(this);
        buttonCancel.addActionListener(this);

        setTitle("Login");
        setBackground(new Color(229, 229, 229));
        setSize(500, 150);
        setVisible(true);
        setResizable(false);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        switch (command) {
            case "Login" -> {
                // Implement login logic
                String username = textUsername.getText();
                String password = textPassword.getText();
                // For demonstration purposes
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                new HomeGUI();
                dispose();
            }
            case "Cancel" -> {
                textUsername.setText("");
                textPassword.setText("");
            }
            case "Signup" ->
                // Implement login logic
                    System.out.println("Todo: ");
        }
    }

    public static void main(String[] args) {
        new LoginGUI();
    }
}
