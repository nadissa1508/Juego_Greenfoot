import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class confeti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class confeti extends Actor
{
    /**
     * Act - do whatever the confeti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int velocidad;
    
    public confeti() {
        // Asigna una imagen de confeti
        setImage("C:/Users/nadis/Documents/GitHub/Juego_Greenfoot/confeti.gif");
        
        // Asigna una velocidad aleatoria para el confeti
        velocidad = Greenfoot.getRandomNumber(5) + 1;
        
        // Rota el confeti en una dirección aleatoria
        setRotation(Greenfoot.getRandomNumber(360));
    }
    
    public void act() {
        // Mueve el confeti hacia abajo
        setLocation(getX(), getY() + velocidad);
        
        // Elimina el confeti cuando llegue al borde inferior del mundo
        if (getY() >= getWorld().getHeight() - 1) {
            getWorld().removeObject(this);
        }
    }
    
}


