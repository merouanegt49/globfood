import javax.swing.*;
import java.awt.*;

public class HomePage extends JPanel {

    private Image backgroundImg;

    public HomePage() {

        // تحميل خلفية الصفحة
        backgroundImg = new ImageIcon("img/BG.png").getImage();

        setLayout(null);

        // ========= LOGO =========
        JLabel logoLabel = new JLabel("🍔GLOBALFOOD");
        logoLabel.setFont(new Font("SansSerif", Font.BOLD, 28));
        logoLabel.setForeground(Color.WHITE);
        logoLabel.setBounds(20, 20, 300, 40);
        add(logoLabel);

        

        // ========= TITRE =========
        JLabel R1 = new JLabel("🏠 Bienvenue sur la page d'accueil !");
        R1.setBounds(400, 20, 500, 40);
        R1.setFont(new Font("SansSerif", Font.BOLD, 22));
        R1.setForeground(Color.WHITE);
        add(R1);

        // ========= DESCRIPTION =========
        JLabel desc = new JLabel("<html>GlobalFood est votre destination ultime pour une expérience culinaire exceptionnelle. "
                + "Découvrez une variété de plats délicieux, préparés avec des ingrédients frais et de qualité. "
                + "Que vous soyez amateur de cuisine locale ou internationale, notre menu diversifié saura satisfaire toutes vos envies gastronomiques. "
                + "Rejoignez-nous pour un voyage culinaire inoubliable !</html>");
        desc.setBounds(50, 120, 450, 200);
        desc.setFont(new Font("SansSerif", Font.PLAIN, 15));
        desc.setForeground(Color.WHITE);
        add(desc);

        // ========= NOS SERVICES =========
        JLabel services = new JLabel("Nos Services :");
        services.setBounds(50, 330, 200, 30);
        services.setFont(new Font("SansSerif", Font.BOLD, 18));
        services.setForeground(Color.WHITE);
        add(services);


        // --- Service 1 ---
        JLabel s1 = new JLabel("• Livraison rapide");
        ImageIcon icon1 = new ImageIcon(new ImageIcon("img/fast-delivery.png")
                .getImage()
                .getScaledInstance(24, 24, Image.SCALE_SMOOTH));
        s1.setIcon(icon1);
        s1.setForeground(Color.WHITE);
        s1.setBounds(70, 370, 300, 30);
        add(s1);


        // --- Service 2 ---
        JLabel s2 = new JLabel("• Options de repas variées");
        ImageIcon icon2 = new ImageIcon(new ImageIcon("img/dinner.png")
                .getImage()
                .getScaledInstance(24, 24, Image.SCALE_SMOOTH));
        s2.setIcon(icon2);
        s2.setForeground(Color.WHITE);
        s2.setBounds(70, 410, 300, 30);
        add(s2);


        // --- Service 3 ---
        JLabel s3 = new JLabel("• Service client 24/7");
        ImageIcon icon3 = new ImageIcon(new ImageIcon("img/countries.png")
                .getImage()
                .getScaledInstance(24, 24, Image.SCALE_SMOOTH));
        s3.setIcon(icon3);
        s3.setForeground(Color.WHITE);
        s3.setBounds(70, 450, 300, 30);
        add(s3);

        // ========= FOOTER =========
        JLabel footer = new JLabel("© 2025 GlobalFood - Tous droits réservés");
        footer.setForeground(Color.WHITE);
        footer.setFont(new Font("SansSerif", Font.PLAIN, 12));
        footer.setBounds(50, 550, 350, 30);
        add(footer);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // رسم خلفية الصورة كاملة
        g.drawImage(backgroundImg, 0, 0, getWidth(), getHeight(), this);

        // طبقة شفافة فوق الخلفية (تزيد الجمالية)
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(0, 0, 0, 90)); // شفافية 90/255
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
}

