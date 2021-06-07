package HickingClub;

import Resources.SoundEffects;

/*
 * Main class, runs the main method and the music of the 
 */
public class Main
{
    public static SoundEffects sound;
    
    /*
     * Initialize the static variable
     */
    static {
        Main.sound = new SoundEffects();
    }
    
    /*
     * Main method, runs the program and starts the background music.
     */
    public static void main(final String[] args) throws InterruptedException {
        Main.sound.Run("Pokémon Season 1 Indigo League - Opening Theme.wav");
        SoundEffects.clip1.loop(-1);
        new MainFrame();
    }
}
