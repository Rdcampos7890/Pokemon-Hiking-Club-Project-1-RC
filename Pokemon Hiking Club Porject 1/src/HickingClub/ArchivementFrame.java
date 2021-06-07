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
 *  ArchivementFrame class, responsible for the visuals displayed when the player
 *  wants to check all the archivements they have accomplished. 
 */
public class ArchivementFrame implements ActionListener
{
    public static JFrame ArchivementFrame;
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
     * Creates the archivement frame that will be displayed when the player check the archivements.
     */
    public ArchivementFrame() {
        (this.back = new JButton()).setBounds(900, 750, 300, 50);
        this.back.addActionListener(this);
        this.back.setText("Back To Main Scream");
        this.back.setFocusable(false);
        this.back.setHorizontalTextPosition(0);
        this.back.setFont(new Font("Calibri", 1, 25));
        this.back.setForeground(Color.BLACK);
        this.back.setBackground(Color.LIGHT_GRAY);
        this.newBiePicture = new ImageIcon(this.getClass().getResource("PNB.png"));
        final Image imageSizenewBiePicture = this.newBiePicture.getImage();
        final Image modifiednewBiePicture = imageSizenewBiePicture.getScaledInstance(100, 100, 4);
        this.newBiePicture = new ImageIcon(modifiednewBiePicture);
        this.advancedPicture = new ImageIcon(this.getClass().getResource("PAB.png"));
        final Image imageSizeadvancedPicture = this.advancedPicture.getImage();
        final Image modifiedadvancedPicture = imageSizeadvancedPicture.getScaledInstance(100, 100, 4);
        this.advancedPicture = new ImageIcon(modifiedadvancedPicture);
        this.masterPicture = new ImageIcon(this.getClass().getResource("PMB.png"));
        final Image imageSizemasterPicture = this.masterPicture.getImage();
        final Image modifiedmasterPicture = imageSizemasterPicture.getScaledInstance(100, 100, 4);
        this.masterPicture = new ImageIcon(modifiedmasterPicture);
        this.legendPicture = new ImageIcon(this.getClass().getResource("PLB.png"));
        final Image imageSizelegendPicture = this.legendPicture.getImage();
        final Image modifiedlegendPicture = imageSizelegendPicture.getScaledInstance(100, 100, 4);
        this.legendPicture = new ImageIcon(modifiedlegendPicture);
        this.collectorPicture = new ImageIcon(this.getClass().getResource("CPB.png"));
        final Image imageSizecollectorPicture = this.collectorPicture.getImage();
        final Image modifiedcollectorPicture = imageSizecollectorPicture.getScaledInstance(100, 100, 4);
        this.collectorPicture = new ImageIcon(modifiedcollectorPicture);
        this.richPicture = new ImageIcon(this.getClass().getResource("RPB.png"));
        final Image imageSizerichPicture = this.richPicture.getImage();
        final Image modifiedrichPicture = imageSizerichPicture.getScaledInstance(100, 100, 4);
        this.richPicture = new ImageIcon(modifiedrichPicture);
        this.hickerPicture = new ImageIcon(this.getClass().getResource("HikerPP.png"));
        final Image imageSizehickerPicture = this.hickerPicture.getImage();
        final Image modifiedhickerPicture = imageSizehickerPicture.getScaledInstance(100, 100, 4);
        this.hickerPicture = new ImageIcon(modifiedhickerPicture);
        (this.newBieLabel = new JLabel()).setText("newBie Player Archived: " + VariableMain.newBie);
        this.newBieLabel.setBounds(0, 0, 1200, 100);
        this.newBieLabel.setIcon(this.newBiePicture);
        this.newBieLabel.setHorizontalTextPosition(4);
        this.newBieLabel.setVerticalTextPosition(0);
        this.newBieLabel.setIconTextGap(100);
        this.newBieLabel.setFont(new Font("Calibri", 1, 50));
        this.newBieLabel.setForeground(Color.WHITE);
        (this.advancedLabel = new JLabel()).setText("Adanced PLayer Archived: " + VariableMain.advanced);
        this.advancedLabel.setBounds(0, 100, 1200, 100);
        this.advancedLabel.setIcon(this.advancedPicture);
        this.advancedLabel.setHorizontalTextPosition(4);
        this.advancedLabel.setVerticalTextPosition(0);
        this.advancedLabel.setIconTextGap(100);
        this.advancedLabel.setFont(new Font("Calibri", 1, 50));
        this.advancedLabel.setForeground(Color.WHITE);
        (this.masterLabel = new JLabel()).setText("Master Player Archived: " + VariableMain.master);
        this.masterLabel.setBounds(0, 200, 1200, 100);
        this.masterLabel.setIcon(this.masterPicture);
        this.masterLabel.setHorizontalTextPosition(4);
        this.masterLabel.setVerticalTextPosition(0);
        this.masterLabel.setIconTextGap(100);
        this.masterLabel.setFont(new Font("Calibri", 1, 50));
        this.masterLabel.setForeground(Color.WHITE);
        (this.legendLabel = new JLabel()).setText("Legend Player Archived: " + VariableMain.legend);
        this.legendLabel.setBounds(0, 300, 1200, 100);
        this.legendLabel.setIcon(this.legendPicture);
        this.legendLabel.setHorizontalTextPosition(4);
        this.legendLabel.setVerticalTextPosition(0);
        this.legendLabel.setIconTextGap(100);
        this.legendLabel.setFont(new Font("Calibri", 1, 50));
        this.legendLabel.setForeground(Color.WHITE);
        (this.collectorLabel = new JLabel()).setText("Collector Archived: " + VariableMain.collect);
        this.collectorLabel.setBounds(0, 400, 1200, 100);
        this.collectorLabel.setIcon(this.collectorPicture);
        this.collectorLabel.setHorizontalTextPosition(4);
        this.collectorLabel.setVerticalTextPosition(0);
        this.collectorLabel.setIconTextGap(100);
        this.collectorLabel.setFont(new Font("Calibri", 1, 50));
        this.collectorLabel.setForeground(Color.WHITE);
        (this.richLabel = new JLabel()).setText("Rich Archived: " + VariableMain.rich);
        this.richLabel.setBounds(0, 500, 1200, 100);
        this.richLabel.setIcon(this.richPicture);
        this.richLabel.setHorizontalTextPosition(4);
        this.richLabel.setVerticalTextPosition(0);
        this.richLabel.setIconTextGap(100);
        this.richLabel.setFont(new Font("Calibri", 1, 50));
        this.richLabel.setForeground(Color.WHITE);
        (this.hickerLabel = new JLabel()).setText("Professional Hicker Archived: " + VariableMain.hickerProfessional);
        this.hickerLabel.setBounds(0, 600, 1200, 100);
        this.hickerLabel.setIcon(this.hickerPicture);
        this.hickerLabel.setHorizontalTextPosition(4);
        this.hickerLabel.setVerticalTextPosition(0);
        this.hickerLabel.setIconTextGap(100);
        this.hickerLabel.setFont(new Font("Calibri", 1, 50));
        this.hickerLabel.setForeground(Color.WHITE);
        (HickingClub.ArchivementFrame.ArchivementFrame = new JFrame()).setTitle("Archivements Gotten By The Club");
        HickingClub.ArchivementFrame.ArchivementFrame.setDefaultCloseOperation(3);
        HickingClub.ArchivementFrame.ArchivementFrame.setResizable(false);
        HickingClub.ArchivementFrame.ArchivementFrame.setLayout(null);
        HickingClub.ArchivementFrame.ArchivementFrame.setSize(1200, 900);
        this.PokeBall = new ImageIcon(this.getClass().getResource("PBI.png"));
        HickingClub.ArchivementFrame.ArchivementFrame.setIconImage(this.PokeBall.getImage());
        HickingClub.ArchivementFrame.ArchivementFrame.getContentPane().setBackground(Color.BLACK);
        HickingClub.ArchivementFrame.ArchivementFrame.setBackground(Color.BLACK);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.newBieLabel);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.advancedLabel);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.masterLabel);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.legendLabel);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.collectorLabel);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.richLabel);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.hickerLabel);
        HickingClub.ArchivementFrame.ArchivementFrame.add(this.back);
        HickingClub.ArchivementFrame.ArchivementFrame.setLocationRelativeTo(null);
        HickingClub.ArchivementFrame.ArchivementFrame.setVisible(true);
    }
    
    @Override
    /*
     * Returns the user to the main frame when they click the go back button.
     */
    public void actionPerformed(final ActionEvent e) {
        if (e.getSource() == this.back) {
            HickingClub.ArchivementFrame.ArchivementFrame.setVisible(false);
            new MainFrame();
        }
    }
}