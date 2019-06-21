package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.Killable;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.MunitionFactory;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.AbstractPosition;
import org.academiadecodigo.SuperMarioPlanes.gfx.*;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Plane extends GameObject implements Killable {

    private int health = 1;
    private boolean dead = false;
    //private AirArena airArena;
    private Picture image;

    protected AbstractPosition currentDirection;


    public Plane(AbstractPosition position){
        super(position);
    }

    public void crash() {
        this.dead = true;
        hide();
        explosion();

    }

    public void explosion() {
        Picture bum = new Picture(0,0, "resources/fireball.png");
        bum.draw();
    }

    public void hide() {
        image.delete();
    }

    @Override
    public void hit(int impact){
       health -= impact;
       if (health <= 0) {
           dead = true;
           //hide();
       }
    }

    @Override
    public boolean isDead() {
        return dead;
    }

    public void shoot(){
    MunitionFactory.getNewMunition(super.getPosition(),this);
    }
/*
    public void setAirArena(AirArena arena){
        airArena = arena;
    }
*/
    public int getHealth() {
        return health;
    }
}
