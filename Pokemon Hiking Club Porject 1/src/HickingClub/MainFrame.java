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
 * MainFrame class, responsible for the main view of the program. 
 * Place user can take decisions about what to do.
 */
public class MainFrame implements ActionListener
{
    public static JFrame mainFrame;
    private JButton add;
    private JButton remove;
    private JButton check;
    private JButton display;
    private JButton pokemonDisplay;
    private JButton shop;
    private JButton inventory;
    private JButton archivements;
    private JLabel mainPic;
    private ImageIcon mainIcon;
    private ImageIcon PokeBall;
    
    /*
     * Creates the MainFrame object that starts the program and can redirect the user to other frames.
     * Calls on different methods depending on user input.
     */
    public MainFrame() {
        (this.add = new JButton()).setBounds(0, 500, 300, 100);
        this.add.addActionListener(this);
        this.add.setText("Add Hicker");
        this.add.setFocusable(false);
        this.add.setHorizontalTextPosition(0);
        this.add.setFont(new Font("Calibri", 1, 25));
        this.add.setForeground(Color.BLACK);
        this.add.setBackground(Color.LIGHT_GRAY);
        (this.remove = new JButton()).setBounds(0, 700, 300, 100);
        this.remove.addActionListener(this);
        this.remove.setText("Remove Hicker");
        this.remove.setFocusable(false);
        this.remove.setHorizontalTextPosition(0);
        this.remove.setFont(new Font("Calibri", 1, 25));
        this.remove.setForeground(Color.BLACK);
        this.remove.setBackground(Color.LIGHT_GRAY);
        (this.check = new JButton()).setBounds(300, 500, 300, 100);
        this.check.addActionListener(this);
        this.check.setText("Check Time");
        this.check.setFocusable(false);
        this.check.setHorizontalTextPosition(0);
        this.check.setFont(new Font("Calibri", 1, 25));
        this.check.setForeground(Color.BLACK);
        this.check.setBackground(Color.LIGHT_GRAY);
        (this.display = new JButton()).setBounds(300, 700, 300, 100);
        this.display.addActionListener(this);
        this.display.setText("Display Hickers");
        this.display.setFocusable(false);
        this.display.setHorizontalTextPosition(0);
        this.display.setFont(new Font("Calibri", 1, 25));
        this.display.setForeground(Color.BLACK);
        this.display.setBackground(Color.LIGHT_GRAY);
        (this.pokemonDisplay = new JButton()).setBounds(600, 500, 300, 100);
        this.pokemonDisplay.addActionListener(this);
        this.pokemonDisplay.setText("Display Pokemons");
        this.pokemonDisplay.setFocusable(false);
        this.pokemonDisplay.setHorizontalTextPosition(0);
        this.pokemonDisplay.setFont(new Font("Calibri", 1, 25));
        this.pokemonDisplay.setForeground(Color.BLACK);
        this.pokemonDisplay.setBackground(Color.LIGHT_GRAY);
        (this.archivements = new JButton()).setBounds(600, 700, 300, 100);
        this.archivements.addActionListener(this);
        this.archivements.setText("Archivements");
        this.archivements.setFocusable(false);
        this.archivements.setHorizontalTextPosition(0);
        this.archivements.setFont(new Font("Calibri", 1, 25));
        this.archivements.setForeground(Color.BLACK);
        this.archivements.setBackground(Color.LIGHT_GRAY);
        (this.shop = new JButton()).setBounds(900, 500, 300, 100);
        this.shop.addActionListener(this);
        this.shop.setText("Shop");
        this.shop.setFocusable(false);
        this.shop.setHorizontalTextPosition(0);
        this.shop.setFont(new Font("Calibri", 1, 25));
        this.shop.setForeground(Color.BLACK);
        this.shop.setBackground(Color.LIGHT_GRAY);
        (this.inventory = new JButton()).setBounds(900, 700, 300, 100);
        this.inventory.addActionListener(this);
        this.inventory.setText("Inventory");
        this.inventory.setFocusable(false);
        this.inventory.setHorizontalTextPosition(0);
        this.inventory.setFont(new Font("Calibri", 1, 25));
        this.inventory.setForeground(Color.BLACK);
        this.inventory.setBackground(Color.LIGHT_GRAY);
        this.mainIcon = new ImageIcon(this.getClass().getResource("MP.png"));
        final Image imageSizeMainIcon = this.mainIcon.getImage();
        final Image modifiedMainIcon = imageSizeMainIcon.getScaledInstance(1200, 500, 4);
        this.mainIcon = new ImageIcon(modifiedMainIcon);
        (this.mainPic = new JLabel()).setText("WELCOME TO POKEMON SAFARY CLUB");
        this.mainPic.setBounds(0, 0, 1200, 500);
        this.mainPic.setIcon(this.mainIcon);
        this.mainPic.setHorizontalTextPosition(0);
        this.mainPic.setVerticalTextPosition(0);
        this.mainPic.setFont(new Font("Calibri", 1, 50));
        this.mainPic.setForeground(Color.WHITE);
        (MainFrame.mainFrame = new JFrame()).setTitle("Welcome to Pokemon Safary Club!");
        MainFrame.mainFrame.setDefaultCloseOperation(3);
        MainFrame.mainFrame.setResizable(false);
        MainFrame.mainFrame.setLayout(null);
        MainFrame.mainFrame.setSize(1200, 900);
        this.PokeBall = new ImageIcon(this.getClass().getResource("PBI.png"));
        MainFrame.mainFrame.setIconImage(this.PokeBall.getImage());
        MainFrame.mainFrame.getContentPane().setBackground(Color.BLACK);
        MainFrame.mainFrame.setBackground(Color.BLACK);
        MainFrame.mainFrame.add(this.mainPic);
        MainFrame.mainFrame.setBackground(Color.BLACK);
        MainFrame.mainFrame.add(this.add);
        MainFrame.mainFrame.add(this.remove);
        MainFrame.mainFrame.add(this.inventory);
        MainFrame.mainFrame.add(this.archivements);
        MainFrame.mainFrame.add(this.shop);
        MainFrame.mainFrame.add(this.pokemonDisplay);
        MainFrame.mainFrame.add(this.check);
        MainFrame.mainFrame.add(this.display);
        MainFrame.mainFrame.setLocationRelativeTo(null);
        MainFrame.mainFrame.setVisible(true);
    }
    
    @Override
    /*
     * Listens to which button the user clicks and calls on the corresponding method.
     */
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.add) {
            try {
                VariableMain.addHicker();
            }
            catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        else if (e.getSource() == this.remove) {
            VariableMain.removeHicker();
        }
        else if (e.getSource() == this.check) {
            VariableMain.findHicker();
        }
        else if (e.getSource() == this.display) {
            VariableMain.displayHickers();
        }
        else if (e.getSource() == this.pokemonDisplay) {
            MainFrame.mainFrame.setVisible(false);
            new PokemonFrame();
        }
        else if (e.getSource() == this.archivements) {
            MainFrame.mainFrame.setVisible(false);
            new ArchivementFrame();
        }
        else if (e.getSource() == this.shop) {
            MainFrame.mainFrame.setVisible(false);
            new ShopFrame();
        }
        else if (e.getSource() == this.inventory) {
            MainFrame.mainFrame.setVisible(false);
            new InventoryFrame();
        }
    }
}
