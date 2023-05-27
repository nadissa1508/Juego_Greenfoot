import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{

    /**
     * Constructor for objects of class fondo.
     * 
     */
    public fondo(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        homero1 homero = new homero1();
        addObject(homero, 100, 300);
        crearDona(5);
    }
    public void crearDona(int numero){
        for(int i=0; i<numero; i++){
            dona d = new dona();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(d, x, y);
        }
    }
}
