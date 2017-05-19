import greenfoot.*; 

public class mainMenu extends World
{
    public mainMenu()
    {    
        super(900, 550, 1); 
        addObject (new scoreCounter(), 40,20);
    }   
    public void startMenu() {
        getBackground().drawImage(new GreenfootImage("Main Menu.png"), 0, 0);
        Greenfoot.start();
    }
}
