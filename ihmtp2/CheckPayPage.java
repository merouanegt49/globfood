import javax.swing.*;
import java.awt.*;

public class CheckPayPage extends JPanel {
    public CheckPayPage() {
        setLayout(null);

        JLabel title2 = new JLabel("🧾 Vérification du Paiement");
        title2.setFont(new Font("Arial", Font.BOLD, 22));
        title2.setBounds(250, 50, 400, 30);
        add(title2);

        JTable orderTable = new JTable(
                new Object[][] {{"Lasagne", "1800", "1", "1800"}, {"Tiramisu", "1200", "2", "2400"}},
                new Object[] {"Article", "Prix (DA)", "Quantité", "Sous-total"});
        JScrollPane scrollPane = new JScrollPane(orderTable);
        scrollPane.setBounds(200, 100, 400, 120);
        add(scrollPane);

        JButton confirmBtn = new JButton("Confirmer la commande");
        confirmBtn.setBounds(300, 250, 200, 40);
        add(confirmBtn);
    }
}
