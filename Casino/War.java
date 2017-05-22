import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Scanner;
import java.io.*;  

/**
 * Write a description of class War here.
 * minimum bet = $100, dealer cash = $200
 * @Sabrina
 * @22May2017
 */
public class War extends World
{
public static void main (String args[]) 
{
    ArrayList <User> deck = new ArrayList<User>();
    obj.add(Deck); //need to figure out how to call these
    ArrayList <Dealer> deck = new ArrayList<Dealer>();
    obj.add(Deck);

Scanner scanner = new Scanner (System.in);
System.out.println("Enter card by clicking card you choose in the deck: ");

//get card from user
String user = scanner.nextLine(); 

    /**
     * Constructor for objects of class War.
     * 
     */
    public War()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 550, 1); 
    }
    public void startWar() {
        getBackground().drawImage(new GreenfootImage("Casino-playtable.png"), 0, 0);
        Greenfoot.start();
    }
}
