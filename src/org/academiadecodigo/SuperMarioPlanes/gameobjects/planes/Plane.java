package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.Killable;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.*;

public class Plane extends GameObject implements Killable {
    private int health;
    private boolean dead;
    private AirArena airArena;


    public Plane(int health, Position position){
        super(position);
        this.health = health;
    }

    @Override
    public void hit(int impact){
       health -= impact;
    }

    @Override
    public boolean isDead() {
        return dead;
    }

    public void shoot(){

    }

    public void setAirArena(AirArena arena){
        airArena = arena;
    }

    public int getHealth() {
        return health;
    }
}
