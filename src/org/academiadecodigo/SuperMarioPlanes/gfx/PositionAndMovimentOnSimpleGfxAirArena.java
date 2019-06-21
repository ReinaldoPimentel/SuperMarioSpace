package org.academiadecodigo.SuperMarioPlanes.gfx;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.MunitionPath;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyFlyPath;
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

        //TODO: keyboard input to move

    }

    @Override
    public void move(EnemyFlyPath path){

        //TODO: programmed movement to follow relative positions directly to translate method.

    }

    public void move(MunitionPath path){

        //TODO: programmed movement to follow relative positions directly to translate method.

    }
}
