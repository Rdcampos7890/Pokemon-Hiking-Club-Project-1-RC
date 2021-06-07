package HickingClub;

/*
 * Hicker class, responsible for storing a hiker's information.
 */
public class Hicker
{
    String name;
    String location;
    int hours;
    
    /*
     * Creates a hiker with a name, location for hiking, and hours in the location.
     */
    public Hicker(final String name, final String location, final int hours) {
        this.name = name;
        this.location = location;
        this.hours = hours;
    }
    
    /*
     * Returns the name of the hiker.
     */
    public String getName() {
        return this.name;
    }
    
    /*
     * Returns the location for the hiking.
     */
    public String getLocation() {
        return this.location;
    }
    
    /*
     * Returns the number of hours the hiker will be hiking.
     */
    public int getTime() {
        return this.hours;
    }
}
