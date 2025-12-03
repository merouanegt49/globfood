import java.awt.*;
import javax.swing.*;






public class ProductsPage extends JPanel {

    private Image backg;
    private JPanel ProductPanel;
    
    

    public ProductsPage() {

        backg = new ImageIcon("img/BG.png").getImage();
        setLayout(null);
        JLabel l1 = new JLabel("🛒 Voici la page des produits.");
        
        l1.setBounds(400, 20, 500, 40);
        l1.setFont(new Font("SansSerif", Font.BOLD, 22));
        l1.setForeground(Color.WHITE);
        add(l1);

        String[] repas = {"Italy", "France", "Algérie", "Irlande", "Tunisie"};
        JComboBox<String> comboBox = new JComboBox<>(repas);
        comboBox.setBounds(500, 100, 200, 30);
        add(comboBox);

        JButton bb = new JButton("Rechercher");
        bb.setBounds(680, 100, 120, 30);
        add(bb);

        JButton btnTous = new JButton("Afficher tous");
        btnTous.setBounds(810, 100, 120, 30);
        add(btnTous);

        //panel pour afficher les produits
        ProductPanel=new JPanel();
        ProductPanel.setLayout(new GridLayout(0,3,10,10));
        ProductPanel.setBounds(200,150,1000,400);
        ProductPanel.setOpaque(false); 
        add(ProductPanel);

        JScrollPane scrollPane = new JScrollPane(ProductPanel);
scrollPane.setBounds(200, 150, 1000, 400); 
scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);  
scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
scrollPane.setOpaque(false);
scrollPane.getViewport().setOpaque(false); 

add(scrollPane);


        

// panel des produits
JPanel product1 = new JPanel();
product1.setLayout(new BorderLayout());
product1.setBackground(new Color(50, 50, 50)); 
product1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2)); 
product1.setOpaque(false);

// imge
ImageIcon imgIcon1 = new ImageIcon(new ImageIcon("img/italy1.jpg")
        .getImage()
        .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
JLabel imgLabel1 = new JLabel(imgIcon1);
imgLabel1.setHorizontalAlignment(JLabel.CENTER);
product1.add(imgLabel1, BorderLayout.CENTER);

// prix
JLabel price1 = new JLabel(" Plats Italiens:/100€");
price1.setFont(new Font("SansSerif", Font.BOLD, 14));
price1.setForeground(Color.WHITE);
price1.setHorizontalAlignment(JLabel.CENTER);
product1.add(price1, BorderLayout.NORTH);

// buttons
JPanel buttons1 = new JPanel();
buttons1.setOpaque(false);
JButton btnDetails1 = new JButton("Détails");
JButton btnAjouter1 = new JButton("Ajouter au panier");
buttons1.add(btnDetails1);
buttons1.add(btnAjouter1);
product1.add(buttons1, BorderLayout.SOUTH);

// ajouter le produit au ProductPanel
        ProductPanel.add(product1);

//2Product
JPanel product2 = new JPanel();
product2.setLayout(new BorderLayout());
product2.setBackground(new Color(50, 50, 50)); 
product2.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2)); 
product2.setOpaque(false);

//image
ImageIcon imgIcon2 = new ImageIcon(new ImageIcon("img/alger1.jpg")
        .getImage()
        .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
JLabel imgLabel2 = new JLabel(imgIcon2);
imgLabel2.setHorizontalAlignment(JLabel.CENTER);
product2.add(imgLabel2, BorderLayout.CENTER);

// prix
JLabel price2 = new JLabel(" Plats Algerien:/150€");
price2.setFont(new Font("SansSerif", Font.BOLD, 14));
price2.setForeground(Color.WHITE);
price2.setHorizontalAlignment(JLabel.CENTER);
product2.add(price2, BorderLayout.NORTH);

// buttons
JPanel buttons2 = new JPanel();
buttons2.setOpaque(false);
JButton btnDetails2 = new JButton("Détails");
JButton btnAjouter2 = new JButton("Ajouter au panier");
buttons2.add(btnDetails2);
buttons2.add(btnAjouter2);
product2.add(buttons2, BorderLayout.SOUTH);

// ajouter le produit au ProductPanel
        ProductPanel.add(product2);


        //3Product
JPanel product3 = new JPanel();
product3.setLayout(new BorderLayout());
product3.setBackground(new Color(50, 50, 50)); 
product3.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
product3.setOpaque(false);
// image
ImageIcon imgIcon3 = new ImageIcon(new ImageIcon("img/france1.jpg")
        .getImage()
        .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
JLabel imgLabel3 = new JLabel(imgIcon3);
imgLabel3.setHorizontalAlignment(JLabel.CENTER);
product3.add(imgLabel3, BorderLayout.CENTER);
// prix
JLabel price3 = new JLabel(" Plats Francais:/150€");
price3.setFont(new Font("SansSerif", Font.BOLD, 14));
price3.setForeground(Color.WHITE);
price3.setHorizontalAlignment(JLabel.CENTER);
product3.add(price3, BorderLayout.NORTH);
// buttons
JPanel buttons3 = new JPanel();
buttons3.setOpaque(false);
JButton btnDetails3 = new JButton("Détails");
JButton btnAjouter3 = new JButton("Ajouter au panier");
buttons3.add(btnDetails3);
buttons3.add(btnAjouter3);
product3.add(buttons3, BorderLayout.SOUTH);
//ajouter le produit au ProductPanel
        ProductPanel.add(product3);

        //4Product
JPanel product4 = new JPanel();
product4.setLayout(new BorderLayout());
product4.setBackground(new Color(50, 50, 50)); 
product4.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
product4.setOpaque(false);
// image
ImageIcon imgIcon4 = new ImageIcon(new ImageIcon("img/irlande1.jpg")
        .getImage()
        .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
JLabel imgLabel4 = new JLabel(imgIcon4);
imgLabel4.setHorizontalAlignment(JLabel.CENTER);
product4.add(imgLabel4, BorderLayout.CENTER);
// prix
JLabel price4 = new JLabel(" Plats Irlandais:/150€");
price4.setFont(new Font("SansSerif", Font.BOLD, 14));
price4.setForeground(Color.WHITE);
price4.setHorizontalAlignment(JLabel.CENTER);
product4.add(price4, BorderLayout.NORTH);
// buttons
JPanel buttons4 = new JPanel();
buttons4.setOpaque(false);
JButton btnDetails4 = new JButton("Détails");
JButton btnAjouter4 = new JButton("Ajouter au panier");
buttons4.add(btnDetails4);
buttons4.add(btnAjouter4);
product4.add(buttons4, BorderLayout.SOUTH);
// ajouter le produit au ProductPanel
        ProductPanel.add(product4);
        //5Product
JPanel product5 = new JPanel();
product5.setLayout(new BorderLayout());
product5.setBackground(new Color(50, 50, 50)); 
product5.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
product5.setOpaque(false);
// image
ImageIcon imgIcon5 = new ImageIcon(new ImageIcon("img/tunisie1.jpg")
        .getImage()
        .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
JLabel imgLabel5 = new JLabel(imgIcon5);
imgLabel5.setHorizontalAlignment(JLabel.CENTER);
product5.add(imgLabel5, BorderLayout.CENTER);
// price
JLabel price5 = new JLabel(" Plats Tunisiens:/100€");
price5.setFont(new Font("SansSerif", Font.BOLD, 14));
price5.setForeground(Color.WHITE);
price5.setHorizontalAlignment(JLabel.CENTER);
product5.add(price5, BorderLayout.NORTH);
// buttons
JPanel buttons5 = new JPanel();
buttons5.setOpaque(false);
JButton btnDetails5 = new JButton("Détails");
JButton btnAjouter5 = new JButton("Ajouter au panier");
buttons5.add(btnDetails5);
buttons5.add(btnAjouter5);
product5.add(buttons5, BorderLayout.SOUTH);
// ajouter le produit au ProductPanel
        ProductPanel.add(product5);

        //6Product
JPanel product6 = new JPanel();
product6.setLayout(new BorderLayout());
product6.setBackground(new Color(50, 50, 50)); 
product6.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
product6.setOpaque(false);
// image
ImageIcon imgIcon6 = new ImageIcon(new ImageIcon("img/italy2.jpg")
        .getImage()
        .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
JLabel imgLabel6 = new JLabel(imgIcon6);
imgLabel6.setHorizontalAlignment(JLabel.CENTER);
product6.add(imgLabel6, BorderLayout.CENTER);
// prix
JLabel price6 = new JLabel(" Plats Italiens:/200€");
price6.setFont(new Font("SansSerif", Font.BOLD, 14));
price6.setForeground(Color.WHITE);
price6.setHorizontalAlignment(JLabel.CENTER);
product6.add(price6, BorderLayout.NORTH);
// buttons
JPanel buttons6 = new JPanel();
buttons6.setOpaque(false);
JButton btnDetails6 = new JButton("Détails");
JButton btnAjouter6 = new JButton("Ajouter au panier");
buttons6.add(btnDetails6);
buttons6.add(btnAjouter6);
product6.add(buttons6, BorderLayout.SOUTH);
//ajouter le produit au ProductPanel
        ProductPanel.add(product6);



        //7produit
        JPanel product7 = new JPanel();
        product7.setLayout(new BorderLayout());
        product7.setBackground(new Color(50, 50, 50));
        product7.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product7.setOpaque(false);
        // image
        ImageIcon imgIcon7 = new ImageIcon(new ImageIcon("img/italy3.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel7 = new JLabel(imgIcon7);
        imgLabel7.setHorizontalAlignment(JLabel.CENTER);
        product7.add(imgLabel7, BorderLayout.CENTER);
        // prix
        JLabel price7 = new JLabel(" Plats Italiens:/250€");
        price7.setFont(new Font("SansSerif", Font.BOLD, 14));
        price7.setForeground(Color.WHITE);
        price7.setHorizontalAlignment(JLabel.CENTER);
        product7.add(price7, BorderLayout.NORTH);
        // buttons
        JPanel buttons7 = new JPanel();
        buttons7.setOpaque(false);
        JButton btnDetails7 = new JButton("Détails");
        JButton btnAjouter7 = new JButton("Ajouter au panier");
        buttons7.add(btnDetails7);
        buttons7.add(btnAjouter7);
        product7.add(buttons7, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product7);

        //8produit
        JPanel product8 = new JPanel();
        product8.setLayout(new BorderLayout());
        product8.setBackground(new Color(50, 50, 50));
        product8.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product8.setOpaque(false);
        // image
        ImageIcon imgIcon8 = new ImageIcon(new ImageIcon("img/france2.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel8 = new JLabel(imgIcon8);
        imgLabel8.setHorizontalAlignment(JLabel.CENTER);
        product8.add(imgLabel8, BorderLayout.CENTER);
        // prix
        JLabel price8 = new JLabel(" Plats Francais:/200€");
        price8.setFont(new Font("SansSerif", Font.BOLD, 14));
        price8.setForeground(Color.WHITE);
        price8.setHorizontalAlignment(JLabel.CENTER);
        product8.add(price8, BorderLayout.NORTH);
        // buttons
        JPanel buttons8 = new JPanel();

        buttons8.setOpaque(false);

        JButton btnDetails8 = new JButton("Détails");
        JButton btnAjouter8 = new JButton("Ajouter au panier");
        buttons8.add(btnDetails8);
        buttons8.add(btnAjouter8);
        product8.add(buttons8, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product8);

        //9produit
        JPanel product9 = new JPanel();
        product9.setLayout(new BorderLayout());
        product9.setBackground(new Color(50, 50, 50));
        product9.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product9.setOpaque(false);
        // image
        ImageIcon imgIcon9 = new ImageIcon(new ImageIcon("img/tunisie2.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel9 = new JLabel(imgIcon9);
        imgLabel9.setHorizontalAlignment(JLabel.CENTER);
        product9.add(imgLabel9, BorderLayout.CENTER);
        // prix
        JLabel price9 = new JLabel(" Plats Tunisiens:/200€");
        price9.setFont(new Font("SansSerif", Font.BOLD, 14));
        price9.setForeground(Color.WHITE);
        price9.setHorizontalAlignment(JLabel.CENTER);
        product9.add(price9, BorderLayout.NORTH);
        // buttons
        JPanel buttons9 = new JPanel();
        buttons9.setOpaque(false);
        JButton btnDetails9 = new JButton("Détails");
        JButton btnAjouter9 = new JButton("Ajouter au panier");
        buttons9.add(btnDetails9);
        buttons9.add(btnAjouter9);
        product9.add(buttons9, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product9);

        //10produit
        JPanel product10 = new JPanel();
        product10.setLayout(new BorderLayout());
        product10.setBackground(new Color(50, 50, 50));
        product10.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product10.setOpaque(false);
        // image
        ImageIcon imgIcon10 = new ImageIcon(new ImageIcon("img/irlande2.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel10 = new JLabel(imgIcon10);
        imgLabel10.setHorizontalAlignment(JLabel.CENTER);
        product10.add(imgLabel10, BorderLayout.CENTER);
        // prix
        JLabel price10 = new JLabel(" Plats Irlandais:/200€");
        price10.setFont(new Font("SansSerif", Font.BOLD, 14));
        price10.setForeground(Color.WHITE);
        price10.setHorizontalAlignment(JLabel.CENTER);
        product10.add(price10, BorderLayout.NORTH);
        // buttons
        JPanel buttons10 = new JPanel();
        buttons10.setOpaque(false);
        JButton btnDetails10 = new JButton("Détails");
        JButton btnAjouter10 = new JButton("Ajouter au panier");
        buttons10.add(btnDetails10);
        buttons10.add(btnAjouter10);
        product10.add(buttons10, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product10);

        //11produit
        JPanel product11 = new JPanel();
        product11.setLayout(new BorderLayout());
        product11.setBackground(new Color(50, 50, 50));
        product11.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product11.setOpaque(false);
        // image
        ImageIcon imgIcon11 = new ImageIcon(new ImageIcon("img/alger2.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel11 = new JLabel(imgIcon11);
        imgLabel11.setHorizontalAlignment(JLabel.CENTER);
        product11.add(imgLabel11, BorderLayout.CENTER);
        // prix
        JLabel price11 = new JLabel(" Plats Algerien:/200€");
        price11.setFont(new Font("SansSerif", Font.BOLD, 14));
        price11.setForeground(Color.WHITE);
        price11.setHorizontalAlignment(JLabel.CENTER);
        product11.add(price11, BorderLayout.NORTH);
        // buttons
        JPanel buttons11 = new JPanel();
        buttons11.setOpaque(false);
        JButton btnDetails11 = new JButton("Détails");
        JButton btnAjouter11 = new JButton("Ajouter au panier");
        buttons11.add(btnDetails11);
        buttons11.add(btnAjouter11);
        product11.add(buttons11, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product11);

        //12produit
        JPanel product12 = new JPanel();
        product12.setLayout(new BorderLayout());
        product12.setBackground(new Color(50, 50, 50));
        product12.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product12.setOpaque(false);
        // image
        ImageIcon imgIcon12 = new ImageIcon(new ImageIcon("img/tunisie3.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel12 = new JLabel(imgIcon12);
        imgLabel12.setHorizontalAlignment(JLabel.CENTER);
        product12.add(imgLabel12, BorderLayout.CENTER);
        // prix
        JLabel price12 = new JLabel(" Plats Tunisiens:/250€");
        price12.setFont(new Font("SansSerif", Font.BOLD, 14));
        price12.setForeground(Color.WHITE);
        price12.setHorizontalAlignment(JLabel.CENTER);
        product12.add(price12, BorderLayout.NORTH);
        // buttons
        JPanel buttons12 = new JPanel();
        buttons12.setOpaque(false);
        JButton btnDetails12 = new JButton("Détails");
        JButton btnAjouter12 = new JButton("Ajouter au panier");
        buttons12.add(btnDetails12);
        buttons12.add(btnAjouter12);
        product12.add(buttons12, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product12);

        //13produit
        JPanel product13 = new JPanel();
        product13.setLayout(new BorderLayout());
        product13.setBackground(new Color(50, 50, 50));
        product13.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product13.setOpaque(false);
        // image
        ImageIcon imgIcon13 = new ImageIcon(new ImageIcon("img/irlande3.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel13 = new JLabel(imgIcon13);
        imgLabel13.setHorizontalAlignment(JLabel.CENTER);
        product13.add(imgLabel13, BorderLayout.CENTER);
        // prix
        JLabel price13 = new JLabel(" Plats Irlandais:/250€");
        price13.setFont(new Font("SansSerif", Font.BOLD, 14));
        price13.setForeground(Color.WHITE);
        price13.setHorizontalAlignment(JLabel.CENTER);
        product13.add(price13, BorderLayout.NORTH);
        // buttons
        JPanel buttons13 = new JPanel();
        buttons13.setOpaque(false);
        JButton btnDetails13 = new JButton("Détails");
        JButton btnAjouter13 = new JButton("Ajouter au panier");
        buttons13.add(btnDetails13);
        buttons13.add(btnAjouter13);
        product13.add(buttons13, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product13);

        //14produit
        JPanel product14 = new JPanel();
        product14.setLayout(new BorderLayout());
        product14.setBackground(new Color(50, 50, 50));
        product14.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        product14.setOpaque(false);
        // image
        ImageIcon imgIcon14 = new ImageIcon(new ImageIcon("img/italy5.jpg")
                .getImage()
                .getScaledInstance(150, 100, Image.SCALE_SMOOTH));
        JLabel imgLabel14 = new JLabel(imgIcon14);
        imgLabel14.setHorizontalAlignment(JLabel.CENTER);
        product14.add(imgLabel14, BorderLayout.CENTER);
        // prix
        JLabel price14 = new JLabel(" Plats Italiens:/300€");
        price14.setFont(new Font("SansSerif", Font.BOLD, 14));
        price14.setForeground(Color.WHITE);
        price14.setHorizontalAlignment(JLabel.CENTER);
        product14.add(price14, BorderLayout.NORTH);
        // buttons
        JPanel buttons14 = new JPanel();
        buttons14.setOpaque(false);
        JButton btnDetails14 = new JButton("Détails");
        JButton btnAjouter14 = new JButton("Ajouter au panier");
        buttons14.add(btnDetails14);
        buttons14.add(btnAjouter14);
        product14.add(buttons14, BorderLayout.SOUTH);
        // ajouter le produit au ProductPanel
        ProductPanel.add(product14);





        //mettre a jour l'affichage
        revalidate();
        repaint();

           
        bb.addActionListener(e->{
                //efasee tout le contenu de productsPanel
                ProductPanel.removeAll();

                String sellect=(String) comboBox.getSelectedItem();

                //ajouti les Product dans chaqe pey
                if (sellect.equals("Italy")) {
                    ProductPanel.add(product1);

                    ProductPanel.add(product6);
                        ProductPanel.add(product7);
                        ProductPanel.add(product14);

                } else if (sellect.equals("Algérie")) {

                    ProductPanel.add(product2);
                    ProductPanel.add(product11);

                } else if (sellect.equals("France")) {
                    ProductPanel.add(product3);
                    ProductPanel.add(product8);
                    
                    
                } else if (sellect.equals("Irlande")) {
                    ProductPanel.add(product4);
                        ProductPanel.add(product10);
                        ProductPanel.add(product13);

                } else if (sellect.equals("Tunisie")) {
                    ProductPanel.add(product5);
                        ProductPanel.add(product9);
                        ProductPanel.add(product12);

                        
                }

                ProductPanel.revalidate();
    ProductPanel.repaint();
        });
                //String[] repas = {"Italy", "France", "Algérie", "Irlande", "Tunisie"};


        btnTous.addActionListener(e->{
                
                
                //efasee tout le contenu de productsPanel
                ProductPanel.removeAll();
                //ajouti les Product dans chaqe pey
                ProductPanel.add(product1);
                ProductPanel.add(product2);
                ProductPanel.add(product3);
                ProductPanel.add(product4);
                ProductPanel.add(product5);
                ProductPanel.add(product6);
                ProductPanel.add(product7);
                ProductPanel.add(product8);
                ProductPanel.add(product9);
                ProductPanel.add(product10);
                ProductPanel.add(product11);
                ProductPanel.add(product12);
                        ProductPanel.add(product13);
                        ProductPanel.add(product14);

                ProductPanel.revalidate();
        ProductPanel.repaint();
        });

       
        btnDetails1.addActionListener(e -> {
        JOptionPane.showMessageDialog(this, "Détails du produit: Plats Italiens\nPrix: 150€\nDescription: Délicieux plats italiens traditionnels.");
    });
        btnDetails2.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Algerien\nPrix: 150€\nDescription: Savoureux plats algériens authentiques.");
        });
        btnDetails3.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Francais\nPrix: 150€\nDescription: Exquis plats français classiques.");
        });
        btnDetails4.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Irlandais\nPrix: 150€\nDescription: Délicieux plats irlandais traditionnels.");
        });
        btnDetails5.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Tunisiens\nPrix: 150€\nDescription: Savoureux plats tunisiens authentiques.");
        });
        btnDetails6.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Italiens\nPrix: 200€\nDescription: Délicieux plats italiens traditionnels.");
        });
        btnDetails7.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Italiens\nPrix: 250€\nDescription: Délicieux plats italiens traditionnels.");
        });
        btnDetails8.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Francais\nPrix: 200€\nDescription: Exquis plats français classiques.");
        });
        btnDetails9.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Tunisiens\nPrix: 200€\nDescription: Savoureux plats tunisiens authentiques.");
        });
        btnDetails10.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Irlandais\nPrix: 200€\nDescription: Délicieux plats irlandais traditionnels.");
        });
        btnDetails11.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Algerien\nPrix: 200€\nDescription: Savoureux plats algériens authentiques.");
        });
        btnDetails12.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Tunisiens\nPrix: 250€\nDescription: Savoureux plats tunisiens authentiques.");
        });
        btnDetails13.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Irlandais\nPrix: 250€\nDescription: Délicieux plats irlandais traditionnels.");
        });
        btnDetails14.addActionListener(e -> {
                JOptionPane.showMessageDialog(this, "Détails du produit: Plats Italiens\nPrix: 300€\nDescription: Délicieux plats italiens traditionnels.");
        });

        btnAjouter1.addActionListener(e -> {
                Cart.addProduct("Pizza italiano", 150);
                
                
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Italiens' a été ajouté au panier.");
        });
        btnAjouter2.addActionListener(e -> {
                Cart.addProduct("cuscous algerien",150);

        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Algerien' a été ajouté au panier.");
        });
        btnAjouter3.addActionListener(e -> {
                Cart.addProduct("crosene Francais",150);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Francais' a été ajouté au panier.");
        });
        btnAjouter4.addActionListener(e -> {
                Cart.addProduct("breakFeste Irlandais", 150);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Irlandais' a été ajouté au panier.");
        });
        btnAjouter5.addActionListener(e -> {
                Cart.addProduct("cuscouse Tunisiens",150);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Tunisiens' a été ajouté au panier.");
        });
        btnAjouter6.addActionListener(e -> {
                Cart.addProduct("pizza napoli Italiens",200);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Italiens' a été ajouté au panier.");
        });
        btnAjouter7.addActionListener(e -> {  
                  Cart.addProduct("lazzania Italiens",250);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Italiens' a été ajouté au panier.");
        });
        btnAjouter8.addActionListener(e -> {
                Cart.addProduct("macaro Francais",200);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Francais' a été ajouté au panier.");
        });
        btnAjouter9.addActionListener(e -> {
                Cart.addProduct("Tajiin Tunisiens",200);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Tunisiens' a été ajouté au panier.");
        });
        btnAjouter10.addActionListener(e -> {
                Cart.addProduct("breackFeast Irlandais",200);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Irlandais' a été ajouté au panier.");
        });
        btnAjouter11.addActionListener(e -> {
                Cart.addProduct("cuscous  Algerien",200);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Algerien' a été ajouté au panier.");
        });
        btnAjouter12.addActionListener(e -> {
               Cart.addProduct("LabLabi  Tunisiens",250);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Tunisiens' a été ajouté au panier.");
        });
        btnAjouter13.addActionListener(e -> {
               Cart.addProduct("breackfest ira",250);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Irlandais' a été ajouté au panier.");
        });
        btnAjouter14.addActionListener(e -> {
                Cart.addProduct("spagity",300);
        JOptionPane.showMessageDialog(this, "✅ Le produit 'Plats Italiens' a été ajouté au panier.");
        });

 }
 @Override
    protected void paintComponent(Graphics p) {
        super.paintComponent(p);

        // dessiner l'image de fond
        p.drawImage(backg,0,0, getWidth(), getHeight(), this);

        // dessiner une couche semi-transparente
        Graphics2D g3 = (Graphics2D) p;
        g3.setColor(new Color(0, 0, 0, 90)); 
        g3.fillRect(0, 0, getWidth(), getHeight());
    }

    

}

