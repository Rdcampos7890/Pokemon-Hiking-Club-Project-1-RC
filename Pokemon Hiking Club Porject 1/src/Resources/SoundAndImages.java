package Resources;

/*
 * SoundAndImages class, responsible for putting together images and sounds in a JOP message.
 */
public class SoundAndImages
{
    public static SoundEffects sound2;
    public static Images image;
    
    /*
     * Initialize static variables.
     */
    static {
        SoundAndImages.sound2 = new SoundEffects();
        SoundAndImages.image = new Images();
    }
    
    /*
     * Adds images and sounds to a JOP message.
     */
    public static void SoundPlusImage(final String s, final String x, final String y, final String z) throws Exception {
        SoundEffects.clip1.stop();
        SoundAndImages.sound2.Run2(s);
        SoundAndImages.image.display(x, y, z);
        SoundEffects.clip2.stop();
        SoundEffects.clip1.start();
    }
}
