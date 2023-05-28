import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dona extends Actor
{
    /**
     * Act - do whatever the dona wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = -4;
    
    public void act()
    {
        // Add your action code here.
        
        move(speed);

        if (getX() <= 0) {
            setLocation(getWorld().getWidth() + getImage().getWidth() / 2, Greenfoot.getRandomNumber(getWorld().getHeight()));
        }

    }
}
