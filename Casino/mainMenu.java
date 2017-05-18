import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenu extends World
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 550, 1); 
    }   
    public void startMenu() {
        getBackground().drawImage(new GreenfootImage("Main Menu.png"), 0, 0);
        Greenfoot.start();
    }
}
