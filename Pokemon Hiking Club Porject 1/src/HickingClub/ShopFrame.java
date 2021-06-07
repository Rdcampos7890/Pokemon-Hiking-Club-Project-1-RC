package HickingClub;

import java.awt.event.ActionEvent;
import java.awt.Image;
import java.awt.Component;
import java.awt.LayoutManager;
import javax.swing.Icon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;

/*
 * ShopFrame class,responsible for the visuals when the player wants to enter the shop.
 */
public class ShopFrame implements ActionListener
{
    public static JFrame ShopFrame;
    private JButton back;
    private JButton charc;
    private JButton chars;
    private JButton charsh;
    private JButton blasc;
    private JButton blass;
    private JButton blassh;
    private JButton venc;
    private JButton vens;
    private JButton vensh;
    private JButton pikc;
    private JButton piks;
    private JButton piksh;
    private JLabel charizardLabel;
    private JLabel venusaurLabel;
    private JLabel blastoidLabel;
    private JLabel pikachuLabel;
    private ImageIcon CharizardPicture;
    private ImageIcon VenusaurPicture;
    private ImageIcon BlastoidPicture;
    private ImageIcon PikachuPicture;
    private ImageIcon PokeBall;
    
    /*
     * Creates a ShopFrame object by initializing all variables and setting up the frame.
     */
    public ShopFrame() {
        VariableMain.getsDiscount();
        (this.back = new JButton()).setBounds(1000, 700, 200, 100);
        this.back.addActionListener(this);
        this.back.setText("Back To Main Scream");
        this.back.setFocusable(false);
        this.back.setHorizontalTextPosition(0);
        this.back.setFont(new Font("Calibri", 1, 15));
        this.back.setForeground(Color.BLACK);
        this.back.setBackground(Color.LIGHT_GRAY);
        (this.charc = new JButton()).setBounds(600, 0, 200, 100);
        this.charc.addActionListener(this);
        this.charc.setText("Cap PokeCoins: " + VariableMain.priceCharCap);
        this.charc.setFocusable(false);
        this.charc.setHorizontalTextPosition(0);
        this.charc.setFont(new Font("Calibri", 1, 15));
        this.charc.setForeground(Color.BLACK);
        this.charc.setBackground(Color.LIGHT_GRAY);
        (this.chars = new JButton()).setBounds(500, 100, 200, 100);
        this.chars.addActionListener(this);
        this.chars.setText("Shoes PokeCoins: " + VariableMain.priceCharShoes);
        this.chars.setFocusable(false);
        this.chars.setHorizontalTextPosition(0);
        this.chars.setFont(new Font("Calibri", 1, 15));
        this.chars.setForeground(Color.BLACK);
        this.chars.setBackground(Color.LIGHT_GRAY);
        (this.charsh = new JButton()).setBounds(700, 100, 200, 100);
        this.charsh.addActionListener(this);
        this.charsh.setText("Shirt PokeCoins: " + VariableMain.priceCharShirt);
        this.charsh.setFocusable(false);
        this.charsh.setHorizontalTextPosition(0);
        this.charsh.setFont(new Font("Calibri", 1, 15));
        this.charsh.setForeground(Color.BLACK);
        this.charsh.setBackground(Color.LIGHT_GRAY);
        (this.blasc = new JButton()).setBounds(600, 200, 200, 100);
        this.blasc.addActionListener(this);
        this.blasc.setText("Cap PokeCoins: " + VariableMain.priceBlasCap);
        this.blasc.setFocusable(false);
        this.blasc.setHorizontalTextPosition(0);
        this.blasc.setFont(new Font("Calibri", 1, 15));
        this.blasc.setForeground(Color.BLACK);
        this.blasc.setBackground(Color.LIGHT_GRAY);
        (this.blass = new JButton()).setBounds(500, 300, 200, 100);
        this.blass.addActionListener(this);
        this.blass.setText("Shoes PokeCoins: " + VariableMain.priceBlasShoes);
        this.blass.setFocusable(false);
        this.blass.setHorizontalTextPosition(0);
        this.blass.setFont(new Font("Calibri", 1, 15));
        this.blass.setForeground(Color.BLACK);
        this.blass.setBackground(Color.LIGHT_GRAY);
        (this.blassh = new JButton()).setBounds(700, 300, 200, 100);
        this.blassh.addActionListener(this);
        this.blassh.setText("Shirt PokeCoins: " + VariableMain.priceBlasShirt);
        this.blassh.setFocusable(false);
        this.blassh.setHorizontalTextPosition(0);
        this.blassh.setFont(new Font("Calibri", 1, 15));
        this.blassh.setForeground(Color.BLACK);
        this.blassh.setBackground(Color.LIGHT_GRAY);
        (this.venc = new JButton()).setBounds(600, 400, 200, 100);
        this.venc.addActionListener(this);
        this.venc.setText("Cap PokeCoins: " + VariableMain.priceVenCap);
        this.venc.setFocusable(false);
        this.venc.setHorizontalTextPosition(0);
        this.venc.setFont(new Font("Calibri", 1, 15));
        this.venc.setForeground(Color.BLACK);
        this.venc.setBackground(Color.LIGHT_GRAY);
        (this.vens = new JButton()).setBounds(500, 500, 200, 100);
        this.vens.addActionListener(this);
        this.vens.setText("Shoes PokeCoins: " + VariableMain.priceVenShoes);
        this.vens.setFocusable(false);
        this.vens.setHorizontalTextPosition(0);
        this.vens.setFont(new Font("Calibri", 1, 15));
        this.vens.setForeground(Color.BLACK);
        this.vens.setBackground(Color.LIGHT_GRAY);
        (this.vensh = new JButton()).setBounds(700, 500, 200, 100);
        this.vensh.addActionListener(this);
        this.vensh.setText("Shirt PokeCoins: " + VariableMain.priceVenShirt);
        this.vensh.setFocusable(false);
        this.vensh.setHorizontalTextPosition(0);
        this.vensh.setFont(new Font("Calibri", 1, 15));
        this.vensh.setForeground(Color.BLACK);
        this.vensh.setBackground(Color.LIGHT_GRAY);
        (this.pikc = new JButton()).setBounds(600, 600, 200, 100);
        this.pikc.addActionListener(this);
        this.pikc.setText("Cap PokeCoins: " + VariableMain.pricePikCap);
        this.pikc.setFocusable(false);
        this.pikc.setHorizontalTextPosition(0);
        this.pikc.setFont(new Font("Calibri", 1, 15));
        this.pikc.setForeground(Color.BLACK);
        this.pikc.setBackground(Color.LIGHT_GRAY);
        (this.piks = new JButton()).setBounds(500, 700, 200, 100);
        this.piks.addActionListener(this);
        this.piks.setText("Shoes PokeCoins: " + VariableMain.pricePikShoes);
        this.piks.setFocusable(false);
        this.piks.setHorizontalTextPosition(0);
        this.piks.setFont(new Font("Calibri", 1, 15));
        this.piks.setForeground(Color.BLACK);
        this.piks.setBackground(Color.LIGHT_GRAY);
        (this.piksh = new JButton()).setBounds(700, 700, 200, 100);
        this.piksh.addActionListener(this);
        this.piksh.setText("Cap PokeCoins: " + VariableMain.pricePikCap);
        this.piksh.setFocusable(false);
        this.piksh.setHorizontalTextPosition(0);
        this.piksh.setFont(new Font("Calibri", 1, 15));
        this.piksh.setForeground(Color.BLACK);
        this.piksh.setBackground(Color.LIGHT_GRAY);
        this.CharizardPicture = new ImageIcon(this.getClass().getResource("CharizarCloth.png"));
        final Image imageSizeCharizardPicture = this.CharizardPicture.getImage();
        final Image modifiedCharizardPicture = imageSizeCharizardPicture.getScaledInstance(200, 200, 4);
        this.CharizardPicture = new ImageIcon(modifiedCharizardPicture);
        this.VenusaurPicture = new ImageIcon(this.getClass().getResource("VenusaurCloth.png"));
        final Image imageSizeVenusaurPicture = this.VenusaurPicture.getImage();
        final Image modifiedVenusaurPicture = imageSizeVenusaurPicture.getScaledInstance(200, 200, 4);
        this.VenusaurPicture = new ImageIcon(modifiedVenusaurPicture);
        this.BlastoidPicture = new ImageIcon(this.getClass().getResource("BlastoidCloth.png"));
        final Image imageSizeBlastoidPicture = this.BlastoidPicture.getImage();
        final Image modifiedBlastoidPicture = imageSizeBlastoidPicture.getScaledInstance(200, 200, 4);
        this.BlastoidPicture = new ImageIcon(modifiedBlastoidPicture);
        this.PikachuPicture = new ImageIcon(this.getClass().getResource("PikachuCloth.png"));
        final Image imageSizePikachuPicture = this.PikachuPicture.getImage();
        final Image modifiedPikachuPicture = imageSizePikachuPicture.getScaledInstance(200, 200, 4);
        this.PikachuPicture = new ImageIcon(modifiedPikachuPicture);
        (this.charizardLabel = new JLabel()).setText("Charizard Product Theme: ");
        this.charizardLabel.setBounds(0, -50, 500, 300);
        this.charizardLabel.setIcon(this.CharizardPicture);
        this.charizardLabel.setHorizontalTextPosition(4);
        this.charizardLabel.setVerticalTextPosition(0);
        this.charizardLabel.setIconTextGap(50);
        this.charizardLabel.setFont(new Font("Calibri", 1, 20));
        this.charizardLabel.setForeground(Color.WHITE);
        (this.pikachuLabel = new JLabel()).setText("Pikachu Product Theme: ");
        this.pikachuLabel.setBounds(0, 550, 500, 300);
        this.pikachuLabel.setIcon(this.PikachuPicture);
        this.pikachuLabel.setHorizontalTextPosition(4);
        this.pikachuLabel.setVerticalTextPosition(0);
        this.pikachuLabel.setIconTextGap(50);
        this.pikachuLabel.setFont(new Font("Calibri", 1, 20));
        this.pikachuLabel.setForeground(Color.WHITE);
        (this.venusaurLabel = new JLabel()).setText("Venusaur Product Theme: ");
        this.venusaurLabel.setBounds(0, 350, 500, 300);
        this.venusaurLabel.setIcon(this.VenusaurPicture);
        this.venusaurLabel.setHorizontalTextPosition(4);
        this.venusaurLabel.setVerticalTextPosition(0);
        this.venusaurLabel.setIconTextGap(50);
        this.venusaurLabel.setFont(new Font("Calibri", 1, 20));
        this.venusaurLabel.setForeground(Color.WHITE);
        (this.blastoidLabel = new JLabel()).setText("Blastoid Product Theme: ");
        this.blastoidLabel.setBounds(0, 150, 500, 300);
        this.blastoidLabel.setIcon(this.BlastoidPicture);
        this.blastoidLabel.setHorizontalTextPosition(4);
        this.blastoidLabel.setVerticalTextPosition(0);
        this.blastoidLabel.setIconTextGap(50);
        this.blastoidLabel.setFont(new Font("Calibri", 1, 20));
        this.blastoidLabel.setForeground(Color.WHITE);
        (HickingClub.ShopFrame.ShopFrame = new JFrame()).setTitle("Shops Found By The Club");
        HickingClub.ShopFrame.ShopFrame.setDefaultCloseOperation(3);
        HickingClub.ShopFrame.ShopFrame.setResizable(false);
        HickingClub.ShopFrame.ShopFrame.setLayout(null);
        HickingClub.ShopFrame.ShopFrame.setSize(1200, 900);
        this.PokeBall = new ImageIcon(this.getClass().getResource("PBI.png"));
        HickingClub.ShopFrame.ShopFrame.setIconImage(this.PokeBall.getImage());
        HickingClub.ShopFrame.ShopFrame.getContentPane().setBackground(Color.BLACK);
        HickingClub.ShopFrame.ShopFrame.setBackground(Color.BLACK);
        HickingClub.ShopFrame.ShopFrame.add(this.blastoidLabel);
        HickingClub.ShopFrame.ShopFrame.add(this.venusaurLabel);
        HickingClub.ShopFrame.ShopFrame.add(this.charizardLabel);
        HickingClub.ShopFrame.ShopFrame.add(this.pikachuLabel);
        HickingClub.ShopFrame.ShopFrame.add(this.back);
        HickingClub.ShopFrame.ShopFrame.add(this.charc);
        HickingClub.ShopFrame.ShopFrame.add(this.blasc);
        HickingClub.ShopFrame.ShopFrame.add(this.venc);
        HickingClub.ShopFrame.ShopFrame.add(this.pikc);
        HickingClub.ShopFrame.ShopFrame.add(this.chars);
        HickingClub.ShopFrame.ShopFrame.add(this.blass);
        HickingClub.ShopFrame.ShopFrame.add(this.vens);
        HickingClub.ShopFrame.ShopFrame.add(this.piks);
        HickingClub.ShopFrame.ShopFrame.add(this.charsh);
        HickingClub.ShopFrame.ShopFrame.add(this.blassh);
        HickingClub.ShopFrame.ShopFrame.add(this.vensh);
        HickingClub.ShopFrame.ShopFrame.add(this.piksh);
        HickingClub.ShopFrame.ShopFrame.setLocationRelativeTo(null);
        HickingClub.ShopFrame.ShopFrame.setVisible(true);
    }
    
    @Override
    /*
     * Check for what the player wants to buy and buys it if the money is enough,
     * it also check for the player wanting to go back to the main frame.
     */
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.back) {
            HickingClub.ShopFrame.ShopFrame.setVisible(false);
            new MainFrame();
        }
        else if (e.getSource() == this.charc) {
            VariableMain.buy(1, 1);
        }
        else if (e.getSource() == this.chars) {
            VariableMain.buy(1, 2);
        }
        else if (e.getSource() == this.charsh) {
            VariableMain.buy(1, 3);
        }
        else if (e.getSource() == this.blasc) {
            VariableMain.buy(2, 1);
        }
        else if (e.getSource() == this.blass) {
            VariableMain.buy(2, 2);
        }
        else if (e.getSource() == this.blassh) {
            VariableMain.buy(2, 3);
        }
        else if (e.getSource() == this.venc) {
            VariableMain.buy(3, 1);
        }
        else if (e.getSource() == this.vens) {
            VariableMain.buy(3, 2);
        }
        else if (e.getSource() == this.vensh) {
            VariableMain.buy(3, 3);
        }
        else if (e.getSource() == this.pikc) {
            VariableMain.buy(4, 1);
        }
        else if (e.getSource() == this.piks) {
            VariableMain.buy(4, 2);
        }
        else if (e.getSource() == this.piksh) {
            VariableMain.buy(4, 3);
        }
    }
}