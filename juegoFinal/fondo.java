import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class fondo extends World {
    private int donasComidas = 0;
    private GreenfootSound sonido;
    public fondo() {
        super(600, 400, 1);
        homero1 homero = new homero1();
        addObject(homero, 100, 300);
        crearDona(5);
        Score contadorPuntos = new Score("Puntos: ");
        addObject(contadorPuntos, 100, 50);
        
    }

    public void crearDona(int numero) {
        for (int i = 0; i < numero; i++) {
            dona d = new dona();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(d, x, y);
        }
    }

    public void sumarPuntos(int puntosGanados) {
        Score contadorPuntos = (Score) getObjects(Score.class).get(0);
        sonido = new GreenfootSound("C:/Users/nadis/Documents/GitHub/Juego_Greenfoot/woohoo.mp3");

        contadorPuntos.sumarPuntos(puntosGanados);
        donasComidas++;
        if(donasComidas == 5){
            crearDona(5);
        }else if(donasComidas == 10){
            crearDona(5);
        }else if(donasComidas == 15){
            crearDona(5);
        }else if(donasComidas == 20){
            sonido.play();
            for (int i = 0; i < 20; i++) {
                confeti c = new confeti();
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = Greenfoot.getRandomNumber(getHeight());
                addObject(c, x, y);
            }
        }
        
    }
}