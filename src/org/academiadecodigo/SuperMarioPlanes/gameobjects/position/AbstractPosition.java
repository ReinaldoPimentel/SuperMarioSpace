package org.academiadecodigo.SuperMarioPlanes.gameobjects.position;

import org.academiadecodigo.SuperMarioPlanes.gfx.*;

public abstract class AbstractPosition implements Position{

    private int xStartPosition;
    private int yStartPosition;
    private AirArena airArena;

    public AbstractPosition(int xStartPosition, int yStartPosition, AirArena arena) {
        this.xStartPosition = xStartPosition;
        this.yStartPosition = yStartPosition;
        airArena = arena;
    }

    public AirArena getAirArena(){
        return airArena;
    }

    public void setPosition(int xStartPosition, int yStartPosition){
        this.xStartPosition = xStartPosition;
        this.yStartPosition = yStartPosition;
    }
}
