package org.academiadecodigo.SuperMarioPlanes.gfx;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.AbstractPosition;

import java.awt.*;

public class PositionAndMovimentOnSimpleGfxAirArena extends AbstractPosition {

    private Rectangle rectangle;
    private SimpleGfxAirArena simpleGfxAirArena;

    public PositionAndMovimentOnSimpleGfxAirArena(int x, int y, SimpleGfxAirArena simpleGfxAirArena){
        super(x,y,simpleGfxAirArena);
    }




    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public void setPos(int x, int y) {

    }

    @Override
    public void move() {

    }
}
