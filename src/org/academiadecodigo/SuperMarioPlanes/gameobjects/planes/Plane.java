package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.Killable;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Plane extends GameObject implements Killable {

    private int health = 1;
    private boolean dead = false;
    private boolean fired;
    //private AirArena airArena;
    //private Picture image;

    protected Position currentDirection;


    public Plane(SimpleGfxAirArena grid, Position pos){
        super(grid, pos);
    }

    public void crash() {
        this.dead = true;
        hide();
        explosion();

    }

    public void explosion() {
        Picture bum = new Picture(0,0, "resources/bumbum.png");
        bum.draw();
    }

    public void hide() {
       // image.delete();
        super.getPosition().getImage().delete();
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
        fired();
    }


    public void fired(){
        fired = true;
    }

    public boolean hasFired() {
        return fired;
    }

    public void reset_fired() {
        fired = false;
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
