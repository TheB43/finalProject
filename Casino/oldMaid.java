import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class oldMaid here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oldMaid extends World
{

    /**
     * Constructor for objects of class oldMaid.
     * 
     */
    public oldMaid()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        
        //Instantiate one full deck
        ArrayList<Card> deck = new ArrayList<Card>(52);
        deck.fill();
        
        //Select one random card from the deck and remove it.
        int randomIndex = (int)Math.random() * 52;
        deck.remove(ranomdIndex);
        
        //Sort the remaining deck into two hands, one for the player, one for the house.
        ArrayList<Card> playerHand = new ArrayList<Card>();
        ArrayList<Card> dealerHand = new ArrayList<Card>();
        
        //Fill Player's hand
        int index = deck.size();
        while(index > 0) {
            int randomCard = (int)Math.random() * 51;
            playerHand.add(deck.get(randomCard));
            deck.remove(randomCard);
            i--;
        }
        
        //Fill Dealer's hand
        int index2 = deck.size();
        while(index2 > 0) {
            int randomCard = (int)Math.random() * 51;
            playerHand.add(deck.get(randomCard));
            deck.remove(randomCard);
            i--;
        }        
    }
    public void startOM() {
        getBackground().drawImage(new GreenfootImage("Casino-playtable.png"), 0, 0);
        Greenfoot.start();
    }   
}
