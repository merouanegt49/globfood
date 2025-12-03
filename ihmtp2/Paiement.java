import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

public class Paiement extends JPanel {

    public Paiement() {
        loadUI();
    }

    private void loadUI() {
        removeAll();
        setLayout(null);

        JLabel title = new JLabel("🛒 Votre Panier");
        title.setBounds(240, 20, 400, 40);
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        add(title);

        int y = 100;

        // ----- AFFICHAGE PRODUITS -----
        for (int i = 0; i < Cart.products.size(); i++) {
            CartItem item = Cart.products.get(i);

            JLabel prodLabel = new JLabel(item.name + " - " + item.price + "€");
            prodLabel.setBounds(40, y, 200, 30);
            add(prodLabel);

            // ----- BUTTON MINUS -----
            JButton minusBtn = new JButton("-");
            minusBtn.setBounds(260, y, 40, 30);
            add(minusBtn);

            // QUANTITY DISPLAY
            JLabel qtyLabel = new JLabel(String.valueOf(item.quantity));
            qtyLabel.setBounds(310, y, 40, 30);
            qtyLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
            add(qtyLabel);

            // ----- BUTTON PLUS -----
            JButton plusBtn = new JButton("+");
            plusBtn.setBounds(350, y, 40, 30);
            add(plusBtn);

            // ----- DELETE BUTTON -----
            JButton delBtn = new JButton("X");
            delBtn.setBounds(410, y, 50, 30);
            delBtn.setForeground(Color.RED);
            add(delBtn);

            int index = i;

            // ACTIONS
            plusBtn.addActionListener(e -> {
                item.quantity++;
                loadUI();
            });

            minusBtn.addActionListener(e -> {
                if (item.quantity > 1) item.quantity--;
                loadUI();
            });

            delBtn.addActionListener(e -> {
                Cart.products.remove(index);
                loadUI();
            });

            y += 50;
        }

        // ----- TOTAL -----
        JLabel totalLabel = new JLabel("💰 Total : " + Cart.getTotal() + " €");
        totalLabel.setBounds(40, y + 20, 300, 40);
        totalLabel.setFont(new Font("SansSerif", Font.BOLD, 20));
        add(totalLabel);

        // ----- PAY BUTTON -----
        JButton payBtn = new JButton("Payer");
        payBtn.setBounds(40, y + 70, 150, 45);
        payBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        payBtn.setBackground(Color.GREEN);
        payBtn.setForeground(Color.WHITE);
        add(payBtn);

        payBtn.addActionListener(e -> showPaymentDialog());
        revalidate();
        repaint();
    }

    // ---------------- PAYMENT SIMULATION ----------------
    private void showPaymentDialog() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("💳 Simulation Paiement (FAKE)"));
        panel.add(new JLabel("Montant total : " + Cart.getTotal() + " €"));

        JTextField fakeCard = new JTextField("1234 5678 9012 3456");
        panel.add(new JLabel("Numéro de carte (FAKE) :"));
        panel.add(fakeCard);

        int res = JOptionPane.showConfirmDialog(null, panel, "Paiement",
                JOptionPane.OK_CANCEL_OPTION);

        if (res == JOptionPane.OK_OPTION) {
            // ----- Afficher Facture -----
        StringBuilder facture = new StringBuilder();
        facture.append("🧾 Facture :\n\n");
        for (CartItem item : Cart.products) {
            facture.append(item.name)
                   .append(" x")
                   .append(item.quantity)
                   .append(" = ")
                   .append(item.price * item.quantity)
                   .append(" €\n");
        }
        facture.append("\nTotal : ").append(Cart.getTotal()).append(" €");

         JOptionPane.showMessageDialog(null, facture.toString(),
                "Facture", JOptionPane.INFORMATION_MESSAGE);



            try {
        FileWriter writer = new FileWriter("orders.txt", true);
        writer.write(facture.toString() + "\n-------------------\n");
        writer.close();
    } catch (IOException ex) {
        ex.printStackTrace();
    }


            Cart.clearCart(); // تفريغ السلة بعد الدفع
            loadUI();         // تحديث الواجهة
            showRatingDialog();
        }
    }

    // ---------------- RATING + COMMENT ----------------
    private void showRatingDialog() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("⭐ Laissez une évaluation :"));

        JRadioButton s1 = new JRadioButton("★");
        JRadioButton s2 = new JRadioButton("★★");
        JRadioButton s3 = new JRadioButton("★★★");
        JRadioButton s4 = new JRadioButton("★★★★");
        JRadioButton s5 = new JRadioButton("★★★★★");

        ButtonGroup grp = new ButtonGroup();
        grp.add(s1); grp.add(s2); grp.add(s3); grp.add(s4); grp.add(s5);

        JPanel stars = new JPanel();
        stars.add(s1); stars.add(s2); stars.add(s3); stars.add(s4); stars.add(s5);
        panel.add(stars);

        panel.add(new JLabel("Commentaire :"));
        JTextArea area = new JTextArea(5, 20);
        panel.add(new JScrollPane(area));

        int result = JOptionPane.showConfirmDialog(null, panel, "Avis",
                JOptionPane.OK_CANCEL_OPTION);

        if (result == JOptionPane.OK_OPTION) {
            JOptionPane.showMessageDialog(null,
                    "Merci pour votre avis ! ⭐\nCommentaire : " + area.getText());
        }
    }
}
