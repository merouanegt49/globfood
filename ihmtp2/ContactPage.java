import javax.swing.*;
import java.awt.*;




public class ContactPage extends JPanel {

    private Image G;
    public ContactPage() {

        G = new ImageIcon("img/BG.png").getImage();
        setLayout(null);
        JLabel t1 = new JLabel("Username:");
        t1.setBounds(100, 80, 100, 30);
        t1.setForeground(Color.WHITE);
        add(t1);
        JTextField f1 = new JTextField();
        f1.setBounds(200, 80, 200, 30);
        //
            
        add(f1);

        JLabel t2 = new JLabel("Email:");
        t2.setBounds(100, 130, 100, 30);
        t2.setForeground(Color.WHITE);
        add(t2);
        JTextField f2 = new JTextField();
        f2.setBounds(200, 130, 200, 30);
        
        add(f2);

        JLabel t3 = new JLabel("Message:");
        t3.setBounds(100, 180, 100, 30);
        t3.setForeground(Color.WHITE);
        add(t3);
        JTextArea messageArea = new JTextArea();
        messageArea.setBounds(200, 180, 200, 100);
        messageArea.setLineWrap(true);
         
        add(messageArea);

        JButton sendBtn = new JButton("Envoyer");
        sendBtn.setBounds(200, 300, 120, 35);

        add(sendBtn);

        sendBtn.addActionListener(ev -> {
            if (f1.getText().isEmpty() || f2.getText().isEmpty() || messageArea.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "⚠️ Veuillez remplir tous les champs !");
            } else {
                JOptionPane.showMessageDialog(this, "✅ Message envoyé avec succès !");
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // رسم خلفية الصورة كاملة
        g.drawImage(G, 0, 0, getWidth(), getHeight(), this);

        // طبقة شفافة فوق الخلفية (تزيد الجمالية)
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(new Color(0, 0, 0, 90)); // شفافية 90/255
        g2.fillRect(0, 0, getWidth(), getHeight());
    }
}

