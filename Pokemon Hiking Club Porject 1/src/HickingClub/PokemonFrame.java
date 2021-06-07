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
 * PokemonFrame class, responsible for the visuals when the user wants to see how many pokemons have been caught.
 */
public class PokemonFrame implements ActionListener
{
    public static JFrame PokemonFrame;
    private JButton back;
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
     * Creates a PokemonFrame object by initializing all variables and setting up the frameto the right settings.
     */
    public PokemonFrame() {
        (this.back = new JButton()).setBounds(900, 750, 300, 50);
        this.back.addActionListener(this);
        this.back.setText("Back To Main Scream");
        this.back.setFocusable(false);
        this.back.setHorizontalTextPosition(0);
        this.back.setFont(new Font("Calibri", 1, 25));
        this.back.setForeground(Color.BLACK);
        this.back.setBackground(Color.LIGHT_GRAY);
        this.CharizardPicture = new ImageIcon(this.getClass().getResource("CF.png"));
        final Image imageSizeCharizardPicture = this.CharizardPicture.getImage();
        final Image modifiedCharizardPicture = imageSizeCharizardPicture.getScaledInstance(300, 250, 4);
        this.CharizardPicture = new ImageIcon(modifiedCharizardPicture);
        this.VenusaurPicture = new ImageIcon(this.getClass().getResource("VF.png"));
        final Image imageSizeVenusaurPicture = this.VenusaurPicture.getImage();
        final Image modifiedVenusaurPicture = imageSizeVenusaurPicture.getScaledInstance(300, 250, 4);
        this.VenusaurPicture = new ImageIcon(modifiedVenusaurPicture);
        this.BlastoidPicture = new ImageIcon(this.getClass().getResource("BF.png"));
        final Image imageSizeBlastoidPicture = this.BlastoidPicture.getImage();
        final Image modifiedBlastoidPicture = imageSizeBlastoidPicture.getScaledInstance(300, 250, 4);
        this.BlastoidPicture = new ImageIcon(modifiedBlastoidPicture);
        this.PikachuPicture = new ImageIcon(this.getClass().getResource("PF.png"));
        final Image imageSizePikachuPicture = this.PikachuPicture.getImage();
        final Image modifiedPikachuPicture = imageSizePikachuPicture.getScaledInstance(300, 250, 4);
        this.PikachuPicture = new ImageIcon(modifiedPikachuPicture);
        (this.charizardLabel = new JLabel()).setText("Number of Charizards Found: " + VariableMain.numChar);
        this.charizardLabel.setBounds(0, 0, 1200, 200);
        this.charizardLabel.setIcon(this.CharizardPicture);
        this.charizardLabel.setHorizontalTextPosition(4);
        this.charizardLabel.setVerticalTextPosition(0);
        this.charizardLabel.setIconTextGap(100);
        this.charizardLabel.setFont(new Font("Calibri", 1, 50));
        this.charizardLabel.setForeground(Color.WHITE);
        (this.pikachuLabel = new JLabel()).setText("Number of Pikachus Found: " + VariableMain.numPik);
        this.pikachuLabel.setBounds(0, 600, 1200, 200);
        this.pikachuLabel.setIcon(this.PikachuPicture);
        this.pikachuLabel.setHorizontalTextPosition(4);
        this.pikachuLabel.setVerticalTextPosition(0);
        this.pikachuLabel.setIconTextGap(100);
        this.pikachuLabel.setFont(new Font("Calibri", 1, 50));
        this.pikachuLabel.setForeground(Color.WHITE);
        (this.venusaurLabel = new JLabel()).setText("Number of Venusaurs Found: " + VariableMain.numVen);
        this.venusaurLabel.setBounds(0, 400, 1200, 200);
        this.venusaurLabel.setIcon(this.VenusaurPicture);
        this.venusaurLabel.setHorizontalTextPosition(4);
        this.venusaurLabel.setVerticalTextPosition(0);
        this.venusaurLabel.setIconTextGap(100);
        this.venusaurLabel.setFont(new Font("Calibri", 1, 50));
        this.venusaurLabel.setForeground(Color.WHITE);
        (this.blastoidLabel = new JLabel()).setText("Number of Blastoids Found: " + VariableMain.numBlas);
        this.blastoidLabel.setBounds(0, 200, 1200, 200);
        this.blastoidLabel.setIcon(this.BlastoidPicture);
        this.blastoidLabel.setHorizontalTextPosition(4);
        this.blastoidLabel.setVerticalTextPosition(0);
        this.blastoidLabel.setIconTextGap(100);
        this.blastoidLabel.setFont(new Font("Calibri", 1, 50));
        this.blastoidLabel.setForeground(Color.WHITE);
        (HickingClub.PokemonFrame.PokemonFrame = new JFrame()).setTitle("Pokemons Found By The Club");
        HickingClub.PokemonFrame.PokemonFrame.setDefaultCloseOperation(3);
        HickingClub.PokemonFrame.PokemonFrame.setResizable(false);
        HickingClub.PokemonFrame.PokemonFrame.setLayout(null);
        HickingClub.PokemonFrame.PokemonFrame.setSize(1200, 900);
        this.PokeBall = new ImageIcon(this.getClass().getResource("PBI.png"));
        HickingClub.PokemonFrame.PokemonFrame.setIconImage(this.PokeBall.getImage());
        HickingClub.PokemonFrame.PokemonFrame.getContentPane().setBackground(Color.BLACK);
        HickingClub.PokemonFrame.PokemonFrame.setBackground(Color.BLACK);
        HickingClub.PokemonFrame.PokemonFrame.add(this.blastoidLabel);
        HickingClub.PokemonFrame.PokemonFrame.add(this.venusaurLabel);
        HickingClub.PokemonFrame.PokemonFrame.add(this.charizardLabel);
        HickingClub.PokemonFrame.PokemonFrame.add(this.pikachuLabel);
        HickingClub.PokemonFrame.PokemonFrame.add(this.back);
        HickingClub.PokemonFrame.PokemonFrame.setLocationRelativeTo(null);
        HickingClub.PokemonFrame.PokemonFrame.setVisible(true);
    }
    
    @Override
    /*
     * Listens to see if the user wants to go back to the main frame and takes him there if it is asked to.
     */
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.back) {
            HickingClub.PokemonFrame.PokemonFrame.setVisible(false);
            new MainFrame();
        }
    }
}