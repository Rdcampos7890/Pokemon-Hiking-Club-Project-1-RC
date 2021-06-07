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
 * InventoryFrame class, responsible forthe visuals the user sees when they want to see their inventory.
 */
public class InventoryFrame implements ActionListener
{
    public static JFrame InventoryFrame;
    private JButton back;
    private JLabel newBieLabel;
    private JLabel masterLabel;
    private JLabel advancedLabel;
    private JLabel legendLabel;
    private JLabel collectorLabel;
    private JLabel richLabel;
    private JLabel hickerLabel;
    private ImageIcon newBiePicture;
    private ImageIcon masterPicture;
    private ImageIcon advancedPicture;
    private ImageIcon legendPicture;
    private ImageIcon collectorPicture;
    private ImageIcon richPicture;
    private ImageIcon hickerPicture;
    private ImageIcon PokeBall;
    
    /*
     * Creates InvetoryFrame object by initializing the variables and setting the frame up to the ideal settings. 
     */
    public InventoryFrame() {
        (this.back = new JButton()).setBounds(900, 750, 300, 50);
        this.back.addActionListener(this);
        this.back.setText("Back To Main Scream");
        this.back.setFocusable(false);
        this.back.setHorizontalTextPosition(0);
        this.back.setFont(new Font("Calibri", 1, 25));
        this.back.setForeground(Color.BLACK);
        this.back.setBackground(Color.LIGHT_GRAY);
        this.newBiePicture = new ImageIcon(this.getClass().getResource("PCC.png"));
        final Image imageSizenewBiePicture = this.newBiePicture.getImage();
        final Image modifiednewBiePicture = imageSizenewBiePicture.getScaledInstance(100, 100, 4);
        this.newBiePicture = new ImageIcon(modifiednewBiePicture);
        this.advancedPicture = new ImageIcon(this.getClass().getResource("CharizarCloth.png"));
        final Image imageSizeadvancedPicture = this.advancedPicture.getImage();
        final Image modifiedadvancedPicture = imageSizeadvancedPicture.getScaledInstance(100, 100, 4);
        this.advancedPicture = new ImageIcon(modifiedadvancedPicture);
        this.masterPicture = new ImageIcon(this.getClass().getResource("BlastoidCloth.png"));
        final Image imageSizemasterPicture = this.masterPicture.getImage();
        final Image modifiedmasterPicture = imageSizemasterPicture.getScaledInstance(100, 100, 4);
        this.masterPicture = new ImageIcon(modifiedmasterPicture);
        this.legendPicture = new ImageIcon(this.getClass().getResource("VenusaurCloth.png"));
        final Image imageSizelegendPicture = this.legendPicture.getImage();
        final Image modifiedlegendPicture = imageSizelegendPicture.getScaledInstance(100, 100, 4);
        this.legendPicture = new ImageIcon(modifiedlegendPicture);
        this.collectorPicture = new ImageIcon(this.getClass().getResource("PikachuCloth.png"));
        final Image imageSizecollectorPicture = this.collectorPicture.getImage();
        final Image modifiedcollectorPicture = imageSizecollectorPicture.getScaledInstance(100, 100, 4);
        this.collectorPicture = new ImageIcon(modifiedcollectorPicture);
        this.richPicture = new ImageIcon(this.getClass().getResource("PPPP.png"));
        final Image imageSizerichPicture = this.richPicture.getImage();
        final Image modifiedrichPicture = imageSizerichPicture.getScaledInstance(100, 100, 4);
        this.richPicture = new ImageIcon(modifiedrichPicture);
        this.hickerPicture = new ImageIcon(this.getClass().getResource("HikerPP.png"));
        final Image imageSizehickerPicture = this.hickerPicture.getImage();
        final Image modifiedhickerPicture = imageSizehickerPicture.getScaledInstance(100, 100, 4);
        this.hickerPicture = new ImageIcon(modifiedhickerPicture);
        (this.newBieLabel = new JLabel()).setText("Poke Coins: " + VariableMain.coins);
        this.newBieLabel.setBounds(0, 0, 1200, 100);
        this.newBieLabel.setIcon(this.newBiePicture);
        this.newBieLabel.setHorizontalTextPosition(4);
        this.newBieLabel.setVerticalTextPosition(0);
        this.newBieLabel.setIconTextGap(100);
        this.newBieLabel.setFont(new Font("Calibri", 1, 30));
        this.newBieLabel.setForeground(Color.WHITE);
        (this.advancedLabel = new JLabel()).setText("Charizard Clothing: Charizard Cap - " + VariableMain.numCharCap + " Charizard Shoes - " + VariableMain.numCharShoes + " Charizard Shirts - " + VariableMain.numCharShirt);
        this.advancedLabel.setBounds(0, 100, 1200, 100);
        this.advancedLabel.setIcon(this.advancedPicture);
        this.advancedLabel.setHorizontalTextPosition(4);
        this.advancedLabel.setVerticalTextPosition(0);
        this.advancedLabel.setIconTextGap(100);
        this.advancedLabel.setFont(new Font("Calibri", 1, 30));
        this.advancedLabel.setForeground(Color.WHITE);
        (this.masterLabel = new JLabel()).setText("Blastoid Clothing: Blastoid Caps - " + VariableMain.numBlasCap + " Blastoid Shoes - " + VariableMain.numBlasShoes + " Blastoid Shirts - " + VariableMain.numBlasShirt);
        this.masterLabel.setBounds(0, 200, 1200, 100);
        this.masterLabel.setIcon(this.masterPicture);
        this.masterLabel.setHorizontalTextPosition(4);
        this.masterLabel.setVerticalTextPosition(0);
        this.masterLabel.setIconTextGap(100);
        this.masterLabel.setFont(new Font("Calibri", 1, 30));
        this.masterLabel.setForeground(Color.WHITE);
        (this.legendLabel = new JLabel()).setText("Venusaur Clothing: Venusaur Caps - " + VariableMain.numVenCap + " Venusaur Shoes - " + VariableMain.numVenShoes + " Venusaur Shirts - " + VariableMain.numVenShirt);
        this.legendLabel.setBounds(0, 300, 1200, 100);
        this.legendLabel.setIcon(this.legendPicture);
        this.legendLabel.setHorizontalTextPosition(4);
        this.legendLabel.setVerticalTextPosition(0);
        this.legendLabel.setIconTextGap(100);
        this.legendLabel.setFont(new Font("Calibri", 1, 30));
        this.legendLabel.setForeground(Color.WHITE);
        (this.collectorLabel = new JLabel()).setText("Pikachu Clothing: Pikachu Cap - " + VariableMain.numPikCap + " Pikachu Shoes - " + VariableMain.numPikShoes + " Pikachu Shirts - " + VariableMain.numPikShirt);
        this.collectorLabel.setBounds(0, 400, 1200, 100);
        this.collectorLabel.setIcon(this.collectorPicture);
        this.collectorLabel.setHorizontalTextPosition(4);
        this.collectorLabel.setVerticalTextPosition(0);
        this.collectorLabel.setIconTextGap(100);
        this.collectorLabel.setFont(new Font("Calibri", 1, 30));
        this.collectorLabel.setForeground(Color.WHITE);
        (this.richLabel = new JLabel()).setText("Pokemons Found Total: " + (VariableMain.numChar + VariableMain.numBlas + VariableMain.numPik + VariableMain.numVen));
        this.richLabel.setBounds(0, 500, 1200, 100);
        this.richLabel.setIcon(this.richPicture);
        this.richLabel.setHorizontalTextPosition(4);
        this.richLabel.setVerticalTextPosition(0);
        this.richLabel.setIconTextGap(100);
        this.richLabel.setFont(new Font("Calibri", 1, 30));
        this.richLabel.setForeground(Color.WHITE);
        (this.hickerLabel = new JLabel()).setText("Current Hikes Registered By Club: " + VariableMain.HickerList.size());
        this.hickerLabel.setBounds(0, 600, 1200, 100);
        this.hickerLabel.setIcon(this.hickerPicture);
        this.hickerLabel.setHorizontalTextPosition(4);
        this.hickerLabel.setVerticalTextPosition(0);
        this.hickerLabel.setIconTextGap(100);
        this.hickerLabel.setFont(new Font("Calibri", 1, 30));
        this.hickerLabel.setForeground(Color.WHITE);
        (HickingClub.InventoryFrame.InventoryFrame = new JFrame()).setTitle("Inventorys Gotten By The Club");
        HickingClub.InventoryFrame.InventoryFrame.setDefaultCloseOperation(3);
        HickingClub.InventoryFrame.InventoryFrame.setResizable(false);
        HickingClub.InventoryFrame.InventoryFrame.setLayout(null);
        HickingClub.InventoryFrame.InventoryFrame.setSize(1200, 900);
        this.PokeBall = new ImageIcon(this.getClass().getResource("PBI.png"));
        HickingClub.InventoryFrame.InventoryFrame.setIconImage(this.PokeBall.getImage());
        HickingClub.InventoryFrame.InventoryFrame.getContentPane().setBackground(Color.BLACK);
        HickingClub.InventoryFrame.InventoryFrame.setBackground(Color.BLACK);
        HickingClub.InventoryFrame.InventoryFrame.add(this.newBieLabel);
        HickingClub.InventoryFrame.InventoryFrame.add(this.advancedLabel);
        HickingClub.InventoryFrame.InventoryFrame.add(this.masterLabel);
        HickingClub.InventoryFrame.InventoryFrame.add(this.legendLabel);
        HickingClub.InventoryFrame.InventoryFrame.add(this.collectorLabel);
        HickingClub.InventoryFrame.InventoryFrame.add(this.richLabel);
        HickingClub.InventoryFrame.InventoryFrame.add(this.hickerLabel);
        HickingClub.InventoryFrame.InventoryFrame.add(this.back);
        HickingClub.InventoryFrame.InventoryFrame.setLocationRelativeTo(null);
        HickingClub.InventoryFrame.InventoryFrame.setVisible(true);
    }
    
    @Override
    /*
     * Returns the player to the main frame when it clicks the back button.
     */
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.back) {
            HickingClub.InventoryFrame.InventoryFrame.setVisible(false);
            new MainFrame();
        }
    }
}
