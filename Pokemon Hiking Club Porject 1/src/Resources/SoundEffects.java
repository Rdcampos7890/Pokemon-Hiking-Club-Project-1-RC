package Resources;

import javax.sound.sampled.AudioInputStream;
import java.net.URL;
import javax.sound.sampled.AudioSystem;
import javax.swing.JFrame;
import javax.sound.sampled.Clip;

/*
 * SoundEffects class, responsible for running main music on clip1 and effects on clip2.
 */
public class SoundEffects
{
    public static Clip clip2;
    public static Clip clip1;
    
    /*
     * Runs parameter file on clip1.
     */
    public void Run(final String filePath) throws InterruptedException {
        final JFrame f = new JFrame();
        f.setDefaultCloseOperation(3);
        f.setTitle("Test Sound");
        f.setSize(300, 200);
        f.setVisible(false);
        try {
            final URL resource = this.getClass().getResource(filePath);
            final AudioInputStream audioIn = AudioSystem.getAudioInputStream(resource);
            SoundEffects.clip1 = AudioSystem.getClip();
            (SoundEffects.clip1 = AudioSystem.getClip()).open(audioIn);
            SoundEffects.clip1.start();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    /*
     * Runs parameter file on clip2.
     */
    public void Run2(final String filePath) throws InterruptedException {
        final JFrame f = new JFrame();
        f.setDefaultCloseOperation(3);
        f.setTitle("Test Sound");
        f.setSize(300, 200);
        f.setVisible(false);
        try {
            final URL resource = this.getClass().getResource(filePath);
            final AudioInputStream audioIn = AudioSystem.getAudioInputStream(resource);
            SoundEffects.clip2 = AudioSystem.getClip();
            (SoundEffects.clip2 = AudioSystem.getClip()).open(audioIn);
            SoundEffects.clip2.start();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
} 