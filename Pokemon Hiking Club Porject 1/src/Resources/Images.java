package Resources;

import java.awt.Image;
import java.net.URL;
import javax.swing.Icon;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/*
 * Images class, responsible for adding images to the JOP messages.
 */
public class Images
{
	/*
	 * Displays a message with a certain text and an image.
	 */
    public void display(final String y, final String x, final String z) {
        final URL resource = this.getClass().getResource(y);
        ImageIcon icon = new ImageIcon(resource);
        final Image imageSize = icon.getImage();
        final Image modified = imageSize.getScaledInstance(700, 700, 4);
        icon = new ImageIcon(modified);
        JOptionPane.showMessageDialog(null, x, z, 1, icon);
    }
}