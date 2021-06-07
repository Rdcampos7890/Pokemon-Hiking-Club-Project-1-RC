package Resources;

import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/*
 * JOP class, responsible for communication with the user.
 */
public class JOP
{
	/*
	 * Displays a message using JOption messages.
	 */
    public void msg(final String x, final String z, final String y) {
        final URL resource = this.getClass().getResource(y);
        ImageIcon icon = new ImageIcon(resource);
        final Image imageSize = icon.getImage();
        final Image modified = imageSize.getScaledInstance(25, 25, 4);
        icon = new ImageIcon(modified);
        JOptionPane.showMessageDialog(null, x, z, 1, icon);
    }
    
    /*
     * Takes input from the user through JOption input.
     */
    public String in(final String msg, final String x, final String y) {
        final URL resource = this.getClass().getResource(y);
        ImageIcon icon = new ImageIcon(resource);
        final Image imageSize = icon.getImage();
        final Image modified = imageSize.getScaledInstance(25, 25, 4);
        icon = new ImageIcon(modified);
        return (String)JOptionPane.showInputDialog(null, msg, x, 1, icon, null, "");
    }
}
