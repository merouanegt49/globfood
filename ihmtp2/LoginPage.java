import javax.swing.*;
import java.awt.*;
//import java.awt.event.*;


public class LoginPage extends JFrame {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;
    

    public LoginPage() {

         
        setTitle("Connexion");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel conex=new JLabel("Veuillez vous connecter");
        conex.setBounds(500, 0, 200, 30);
        conex.setFont(new Font("SansSerif", Font.BOLD, 16));
        add(conex);


        JLabel usernameLabel = new JLabel("Nom d'utilisateur:");
        usernameLabel.setBounds(400, 60, 120, 25);
        add(usernameLabel);
        usernameField = new JTextField();
        usernameField.setBounds(510, 60, 150, 25);
        add(usernameField);
        JLabel passwordLabel = new JLabel("Mot de passe:");
        passwordLabel.setBounds(400, 100, 120, 25);
        add(passwordLabel);
        passwordField = new JPasswordField();
        passwordField.setBounds(510, 100, 150, 25);
        add(passwordField);
        loginButton = new JButton("Se connecter");
        loginButton.setBounds(520, 150, 120, 30);
        add(loginButton);


        

        loginButton.addActionListener(e -> {
            String user = usernameField.getText();
            String pass = new String(passwordField.getPassword());
            if (user.equals("admin") && pass.equals("123")) {
                dispose(); // fermer login
                new Main(); // ouvrir l'interface principale
            } else {
                JOptionPane.showMessageDialog(null, "Nom ou mot de passe incorrect !");
            }
        });

        setVisible(true);
    }

    
    
}
