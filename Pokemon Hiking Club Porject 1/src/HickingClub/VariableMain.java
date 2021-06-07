package HickingClub;

import java.util.List;
import java.util.Collections;
import Resources.SoundAndImages;
import java.util.ArrayList;
import Resources.JOP;

/*
 * Variables class, store variables and methods that are used through the program.
 */
public class VariableMain
{
    public static JOP JOP;
    public static ArrayList<Hicker> HickerList;
    public static int coins;
    public static int numChar;
    public static int numBlas;
    public static int numVen;
    public static int numPik;
    public static int numPikCap;
    public static int numPikShoes;
    public static int numPikShirt;
    public static int numCharCap;
    public static int numCharShoes;
    public static int numCharShirt;
    public static int numBlasCap;
    public static int numBlasShoes;
    public static int numBlasShirt;
    public static int numVenCap;
    public static int numVenShoes;
    public static int numVenShirt;
    public static int pricePikCap;
    public static int pricePikShoes;
    public static int pricePikShirt;
    public static int priceCharCap;
    public static int priceCharShoes;
    public static int priceCharShirt;
    public static int priceBlasCap;
    public static int priceBlasShoes;
    public static int priceBlasShirt;
    public static int priceVenCap;
    public static int priceVenShoes;
    public static int priceVenShirt;
    public static boolean newBie;
    public static boolean advanced;
    public static boolean master;
    public static boolean legend;
    public static boolean rich;
    public static boolean collect;
    public static boolean hickerProfessional;
    public static boolean CharDiscount;
    public static boolean PikDiscount;
    public static boolean BlasDiscount;
    public static boolean VenDiscount;
    
    /*
     * Initialize the static variables.
     */
    static {
        VariableMain.JOP = new JOP();
        VariableMain.HickerList = new ArrayList<Hicker>();
        VariableMain.coins = 0;
        VariableMain.numChar = 0;
        VariableMain.numBlas = 0;
        VariableMain.numVen = 0;
        VariableMain.numPik = 0;
        VariableMain.numPikCap = 0;
        VariableMain.numPikShoes = 0;
        VariableMain.numPikShirt = 0;
        VariableMain.numCharCap = 0;
        VariableMain.numCharShoes = 0;
        VariableMain.numCharShirt = 0;
        VariableMain.numBlasCap = 0;
        VariableMain.numBlasShoes = 0;
        VariableMain.numBlasShirt = 0;
        VariableMain.numVenCap = 0;
        VariableMain.numVenShoes = 0;
        VariableMain.numVenShirt = 0;
        VariableMain.pricePikCap = 50;
        VariableMain.pricePikShoes = 80;
        VariableMain.pricePikShirt = 100;
        VariableMain.priceCharCap = 50;
        VariableMain.priceCharShoes = 80;
        VariableMain.priceCharShirt = 100;
        VariableMain.priceBlasCap = 50;
        VariableMain.priceBlasShoes = 80;
        VariableMain.priceBlasShirt = 100;
        VariableMain.priceVenCap = 50;
        VariableMain.priceVenShoes = 80;
        VariableMain.priceVenShirt = 100;
        VariableMain.newBie = false;
        VariableMain.advanced = false;
        VariableMain.master = false;
        VariableMain.legend = false;
        VariableMain.rich = false;
        VariableMain.collect = false;
        VariableMain.hickerProfessional = false;
        VariableMain.CharDiscount = (VariableMain.numChar >= 5);
        VariableMain.PikDiscount = (VariableMain.numPik >= 5);
        VariableMain.BlasDiscount = (VariableMain.numBlas >= 5);
        VariableMain.VenDiscount = (VariableMain.numVen >= 5);
    }
    
    /*
     * Updates the archivements that the player has obtain.
     */
    public static boolean archivements() {
        if (!VariableMain.newBie && VariableMain.numChar + VariableMain.numBlas + VariableMain.numVen >= 1) {
            VariableMain.JOP.msg("Archivement newBie Player Unlocked", "Archivement Unlocked", "PBI.png");
            VariableMain.newBie = true;
        }
        if (!VariableMain.advanced && VariableMain.numChar + VariableMain.numBlas + VariableMain.numVen >= 10) {
            VariableMain.JOP.msg("Archivement Adcanced Player Unlocked", "Archivement Unlocked", "PBI.png");
            VariableMain.advanced = true;
        }
        if (!VariableMain.master && VariableMain.numChar + VariableMain.numBlas + VariableMain.numVen >= 100) {
            VariableMain.JOP.msg("Archivement Master Player Unlocked", "Archivement Unlocked", "PBI.png");
            VariableMain.master = true;
        }
        if (!VariableMain.legend && VariableMain.numChar + VariableMain.numBlas + VariableMain.numVen >= 1000) {
            VariableMain.JOP.msg("Archivement Legend Player Unlocked", "Archivement Unlocked", "PBI.png");
            VariableMain.legend = true;
        }
        if (!VariableMain.collect && VariableMain.numPikCap >= 1 && VariableMain.numPikShoes >= 1 && VariableMain.numPikShirt >= 1 && VariableMain.numCharCap >= 1 && VariableMain.numCharShoes >= 1 && VariableMain.numCharShirt >= 1 && VariableMain.numBlasCap >= 1 && VariableMain.numBlasShoes >= 1 && VariableMain.numBlasShirt >= 1 && VariableMain.numVenCap >= 1 && VariableMain.numVenShoes >= 1 && VariableMain.numVenShirt >= 1) {
            VariableMain.JOP.msg("Archivement Collector Unlocked", "Archivement Unlocked", "PBI.png");
            VariableMain.collect = true;
        }
        if (!VariableMain.rich && VariableMain.coins >= 1000) {
            VariableMain.JOP.msg("Archivement Rich Unlocked", "Archivement Unlocked", "PBI.png");
            VariableMain.rich = true;
        }
        if (!VariableMain.hickerProfessional && VariableMain.HickerList.size() >= 10) {
            VariableMain.JOP.msg("Archivement Professional Hicker Unlocked", "Archivement Unlocked", "PBI.png");
            VariableMain.hickerProfessional = true;
        }
        return false;
    }
    
    /*
     * Adds a hiker to the club's list.
     */
    public static boolean addHicker() throws Exception {
        final String name = VariableMain.JOP.in("What is the name of the hicker?", "Hicker Name", "PBI.png");
        if (name == null) {
            return false;
        }
        if (name.equalsIgnoreCase("") || name.equalsIgnoreCase(" ")) {
            VariableMain.JOP.msg("Please input correct information.", "Failed Add", "PBI.png");
            addHicker();
            return true;
        }
        final String location = VariableMain.JOP.in("To what location is he/she going?", "Hicker Location", "PBI.png");
        if (location == null) {
            return false;
        }
        if (location.equalsIgnoreCase("") || location.equalsIgnoreCase(" ")) {
            VariableMain.JOP.msg("Please input correct information.", "Failed Add", "PBI.png");
            addHicker();
            return true;
        }
        final String hours2 = VariableMain.JOP.in("For how many hours is the hike?", "Hicker Time", "PBI.png");
        if (hours2 == null) {
            return false;
        }
        try {
            Integer.parseInt(hours2);
        }
        catch (NumberFormatException e) {
            VariableMain.JOP.msg("Please input correct information.", "Failed Add", "PBI.png");
            addHicker();
            return true;
        }
        final int hours3 = Integer.parseInt(hours2);
        for (int i = 0; i < VariableMain.HickerList.size(); ++i) {
            if (VariableMain.HickerList.get(i).getName().equalsIgnoreCase(name)) {
                VariableMain.JOP.msg("Sorry, this hiker already has a hike scheduled.", "Name Repeated", "PBI.png");
                return false;
            }
        }
        for (int i = 0; i < VariableMain.HickerList.size(); ++i) {
            if (VariableMain.HickerList.get(i).getLocation().equalsIgnoreCase(location)) {
                VariableMain.JOP.msg("Sorry, this hicking location is already taken occupied.", "Location Repeated", "PBI.png");
                return false;
            }
        }
        VariableMain.JOP.msg("The hicker has been successfully added to the list. There is a chance the club may find a pokemon from this hike!!!", "Hicker Added", "PBI.png");
        final int p = (int)(Math.random() * 10.0);
        if (p > 1) {
            if (p == 2 || p == 3) {
                SoundAndImages.SoundPlusImage("PSE.wav", "CF.png", "The club has found a Charizard!!!", "Charizard Found");
                ++VariableMain.numChar;
                VariableMain.coins += 10;
                VariableMain.JOP.msg("Congrats, the club got 10 coins for finding a pokemon.", "Earning Cash", "PBI.png");
            }
            else if (p == 4 || p == 5) {
                SoundAndImages.SoundPlusImage("PSE.wav", "BF.png", "The club has found a Blastoid!!!", "Blastoid Found");
                ++VariableMain.numBlas;
                VariableMain.coins += 10;
                VariableMain.JOP.msg("Congrats, the club got 10 coins for finding a pokemon.", "Earning Cash", "PBI.png");
            }
            else if (p == 6 || p == 7) {
                SoundAndImages.SoundPlusImage("PSE.wav", "VF.png", "The club has found a Venusaur!!!", "Venusaur Found");
                ++VariableMain.numVen;
                VariableMain.coins += 10;
                VariableMain.JOP.msg("Congrats, the club got 10 coins for finding a pokemon.", "Earning Cash", "PBI.png");
            }
            else if (p == 8 || p == 9) {
                SoundAndImages.SoundPlusImage("PSE.wav", "PF.png", "The club has found a Pikachu!!!", "Pikachu Found");
                ++VariableMain.numPik;
                VariableMain.coins += 10;
                VariableMain.JOP.msg("Congrats, the club got 10 coins for finding a pokemon.", "Earning Cash", "PBI.png");
            }
        }
        ++VariableMain.coins;
        VariableMain.JOP.msg("Congrats, the club got 1 coins for the expedition.", "Earning Cash", "PBI.png");
        getsDiscount();
        VariableMain.HickerList.add(new Hicker(name, location, hours3));
        return true;
    }
    
    /*
     * Removes a hiker from the club's list.
     */
    public static boolean removeHicker() {
        final String name = VariableMain.JOP.in("What is the name of the hicker you wich to remove.", "Remove Name", "PBI.png");
        if (name == null) {
            return false;
        }
        if (name.equalsIgnoreCase("") || name.equalsIgnoreCase(" ")) {
            VariableMain.JOP.msg("Please input correct information.", "Failed Add", "PBI.png");
            removeHicker();
            return true;
        }
        if (name.equalsIgnoreCase("exit")) {
            System.exit(0);
        }
        for (int i = 0; i < VariableMain.HickerList.size(); ++i) {
            if (VariableMain.HickerList.get(i).getName().equalsIgnoreCase(name)) {
                VariableMain.JOP.msg("The hicker " + VariableMain.HickerList.get(i).getName() + " has been successfully removed from the list.", "Hicker Removed", "PBI.png");
                VariableMain.HickerList.remove(i);
                return true;
            }
        }
        VariableMain.JOP.msg("Sorry, the hicker with the name " + name + " wasn't foudn in the list.", "Hicker Not Listed", "PBI.png");
        return false;
    }
    
    /*
     * Searches for a hiker from the club's list.
     */
    public static boolean findHicker() {
        final String mark = VariableMain.JOP.in("What is the name or the location fo which you want to see the hours.", "Mark for Check", "PBI.png");
        if (mark == null) {
            return false;
        }
        if (mark.equalsIgnoreCase("") || mark.equalsIgnoreCase(" ")) {
            VariableMain.JOP.msg("Please input correct information.", "Failed Add", "PBI.png");
            findHicker();
            return true;
        }
        if (mark.equalsIgnoreCase("exit")) {
            System.exit(0);
        }
        for (int i = 0; i < VariableMain.HickerList.size(); ++i) {
            if (VariableMain.HickerList.get(i).getName().equalsIgnoreCase(mark)) {
                VariableMain.JOP.msg("Hicker Name: " + VariableMain.HickerList.get(i).getName() + " Hours: " + VariableMain.HickerList.get(i).getTime(), "Hours Based Name", "PBI.png");
                return true;
            }
        }
        for (int i = 0; i < VariableMain.HickerList.size(); ++i) {
            if (VariableMain.HickerList.get(i).getLocation().equalsIgnoreCase(mark)) {
                VariableMain.JOP.msg("Hicking Location: " + VariableMain.HickerList.get(i).getLocation() + " Hours: " + VariableMain.HickerList.get(i).getTime(), "Hours Based Location", "PBI.png");
                return true;
            }
        }
        VariableMain.JOP.msg("Sorry, no hicker with such location or name was found.", "Hicker or Location Not Listed", "PBI.png");
        return true;
    }
    
    /*
     * Adds a discount to specific items if certain conditions are meet.
     */
    public static boolean getsDiscount() {
        if (VariableMain.CharDiscount && VariableMain.numChar == 5) {
            VariableMain.JOP.msg("Congrats!!! The club has found 5 or more charizards. \nThere is a 50% on charizard items on the shop.", "Discount Archived", "PBI.png");
            VariableMain.priceCharCap = 25;
            VariableMain.priceCharShoes = 40;
            VariableMain.priceCharShirt = 50;
            return true;
        }
        if (VariableMain.BlasDiscount && VariableMain.numBlas == 5) {
            VariableMain.JOP.msg("Congrats!!! The club has found 5 or more blastoids. \nThere is a 50% on blastoids items on the shop.", "Discount Archived", "PBI.png");
            VariableMain.priceBlasCap = 25;
            VariableMain.priceBlasShoes = 40;
            VariableMain.priceBlasShirt = 50;
            return true;
        }
        if (VariableMain.VenDiscount && VariableMain.numVen == 5) {
            VariableMain.JOP.msg("Congrats!!! The club has found 5 or more venasaurs. \nThere is a 50% on venasaurs items on the shop.", "Discount Archived", "PBI.png");
            VariableMain.priceVenCap = 25;
            VariableMain.priceVenShoes = 40;
            VariableMain.priceVenShirt = 50;
            return true;
        }
        if (VariableMain.PikDiscount && VariableMain.numPik == 5) {
            VariableMain.JOP.msg("Congrats!!! The club has found 5 or more pickachus. \nThere is a 50% on pikachu items on the shop.", "Discount Archived", "PBI.png");
            VariableMain.pricePikCap = 25;
            VariableMain.pricePikShoes = 40;
            VariableMain.pricePikShirt = 50;
            return true;
        }
        return false;
    }
    
    /*
     * Buy the item identified by the two digits from the parameter.
     */
    public static boolean buy(final int x, final int y) {
        if (x == 1) {
            if (y == 1) {
                if (VariableMain.priceCharCap <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceCharCap;
                    ++VariableMain.numCharCap;
                    VariableMain.JOP.msg("A charizard cap has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this charizard cap :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 2) {
                if (VariableMain.priceCharShoes <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceCharShoes;
                    ++VariableMain.numCharShoes;
                    VariableMain.JOP.msg("A charizard shoes has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this charizard shoes :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 3) {
                if (VariableMain.priceCharShirt <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceCharShirt;
                    ++VariableMain.numCharShirt;
                    VariableMain.JOP.msg("A charizard shirt has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this charizard shirt :)", "Too Broke", "PBI.png");
                }
            }
        }
        else if (x == 2) {
            if (y == 1) {
                if (VariableMain.priceBlasCap <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceBlasCap;
                    ++VariableMain.numBlasCap;
                    VariableMain.JOP.msg("A blastoid cap has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this blastoid cap :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 2) {
                if (VariableMain.priceBlasShoes <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceBlasShoes;
                    ++VariableMain.numBlasShoes;
                    VariableMain.JOP.msg("A blastoid shoes has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this blastoid shoes :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 3) {
                if (VariableMain.priceBlasShirt <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceBlasShirt;
                    ++VariableMain.numBlasShirt;
                    VariableMain.JOP.msg("A blastoid shirt has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this blastoid shirt :)", "Too Broke", "PBI.png");
                }
            }
        }
        else if (x == 3) {
            if (y == 1) {
                if (VariableMain.priceVenCap <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceVenCap;
                    ++VariableMain.numVenCap;
                    VariableMain.JOP.msg("A Venusaur cap has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this Venusaur cap :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 2) {
                if (VariableMain.priceVenShoes <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceVenShoes;
                    ++VariableMain.numVenShoes;
                    VariableMain.JOP.msg("A Venusaur shoes has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this Venusaur shoes :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 3) {
                if (VariableMain.priceVenShirt <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.priceVenShirt;
                    ++VariableMain.numVenShirt;
                    VariableMain.JOP.msg("A Venusaur shirt has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this Venusaur shirt :)", "Too Broke", "PBI.png");
                }
            }
        }
        else if (x == 4) {
            if (y == 1) {
                if (VariableMain.pricePikCap <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.pricePikCap;
                    ++VariableMain.numPikCap;
                    VariableMain.JOP.msg("A pikachu cap has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this pikachu cap :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 2) {
                if (VariableMain.pricePikShoes <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.pricePikShoes;
                    ++VariableMain.numPikShoes;
                    VariableMain.JOP.msg("A pikachu shoes has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this pikachu shoes :)", "Too Broke", "PBI.png");
                }
            }
            else if (y == 3) {
                if (VariableMain.pricePikShirt <= VariableMain.coins) {
                    VariableMain.coins -= VariableMain.pricePikShirt;
                    ++VariableMain.numPikShirt;
                    VariableMain.JOP.msg("A pikachu shirt has been added to your inventory!", "Item Bought", "PBI.png");
                }
                else {
                    VariableMain.JOP.msg("Sorry, you are too broke to buy this pikachu shirt :)", "Too Broke", "PBI.png");
                }
            }
        }
        return false;
    }
    
    /*
     * Displays all the hikers in the club's lsit.
     */
    public static boolean displayHickers() {
        final ArrayList<String> arr = new ArrayList<String>();
        final ArrayList<Hicker> arr2 = new ArrayList<Hicker>();
        if (VariableMain.HickerList.size() == 0) {
            VariableMain.JOP.msg("No Hickers Added Yet", "HickersList", "PBI.png");
            return false;
        }
        for (int i = 0; i < VariableMain.HickerList.size(); ++i) {
            arr.add(VariableMain.HickerList.get(i).getName());
        }
        Collections.sort(arr);
        for (int x = 0; x < arr.size(); ++x) {
            for (int y = 0; y < arr.size(); ++y) {
                if (VariableMain.HickerList.get(y).getName().equalsIgnoreCase(arr.get(x))) {
                    arr2.add(VariableMain.HickerList.get(y));
                }
            }
        }
        for (int i = 0; i < arr2.size(); ++i) {
            VariableMain.HickerList.set(i, arr2.get(i));
        }
        String x2 = "";
        for (int j = 0; j < VariableMain.HickerList.size(); ++j) {
            x2 = String.valueOf(x2) + "Name: " + VariableMain.HickerList.get(j).getName() + " Location: " + VariableMain.HickerList.get(j).getLocation() + " Hours: " + VariableMain.HickerList.get(j).getTime() + ".\n";
        }
        VariableMain.JOP.msg(x2, "HickersList", "PBI.png");
        return true;
    }
}
