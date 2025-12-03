import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {

    JPanel mainPanel;
    CardLayout cardLayout;
    ProductsPage productsPage;
    Paiement paiement; // مهم باش نقدر نعاود نبدلها

    public Main() {
        setTitle("🍔 GLOBALFOOD");
        setSize(900, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Navbar
        JPanel navPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 40, 10));
        navPanel.setBackground(new Color(33, 45, 62));
        navPanel.setPreferredSize(new Dimension(0, 60));

        String[] menuItems = {"Accueil", "Produits", "Contact", "Paiment"};
        String[] keys = {"accueil", "produits", "contact", "paiment"};

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Pages
        HomePage homePage = new HomePage();
        productsPage = new ProductsPage();
        ContactPage contactPage = new ContactPage();
        paiement = new Paiement(); // لازم نخليها global

        mainPanel.add(homePage, "accueil");
        mainPanel.add(productsPage, "produits");
        mainPanel.add(contactPage, "contact");
        mainPanel.add(paiement, "paiment");

        // ajouter boutons navbar
        for (int i = 0; i < menuItems.length; i++) {
            String item = menuItems[i];
            String key = keys[i];

            JButton btn = new JButton(item);

            btn.addActionListener(e -> {

                if (key.equals("paiment")) {

                    // إزالة الصفحة القديمة
                    mainPanel.remove(paiement);

                    // إنشاء صفحة جديدة
                    paiement = new Paiement();

                    // إضافة الصفحة الجديدة
                    mainPanel.add(paiement, "paiment");
                }

                // عرض الصفحة
                cardLayout.show(mainPanel, key);
            });

            navPanel.add(btn);
        }

        add(navPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}

