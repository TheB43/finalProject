import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Point;
import java.util.List;

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private String rank;
    private String suit;
    
    private int pointRank;
    private int player;
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        pointRank = getPointValue(rank);
        cardImage = new GreenfootImage(rank + suit + ".png");
    }
    public void act() 
    {
        
    }    
    public int getPointValue(int pointRank) {
        return pointRank;
    }
}
