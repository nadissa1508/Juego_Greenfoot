import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class homero1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class homero1 extends Actor
{
    /**
     * Act - do whatever the homero1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int y=getY();
        if(Greenfoot.isKeyDown("right")){
            move(5);comer();
        }
        if(Greenfoot.isKeyDown("left")){
            move(-5);comer();
        }
        if(Greenfoot.isKeyDown("up")){
            y--;comer();
        }
        if(Greenfoot.isKeyDown("down")){
            y++;comer();
        }
        if(Greenfoot.isKeyDown("F1")){
            turn(-1);//gira a la izquierda
        }
        if(Greenfoot.isKeyDown("F2")){
            turn(1);//gira a la derecha
        }
        setLocation(getX(),y);
    }
    public void comer(){
        Actor dona;
        dona = getOneObjectAtOffset(0,0,dona.class);
        if(dona!=null){
            World fondo;
            fondo = getWorld();
            fondo.removeObject(dona);
        }
    }
}
