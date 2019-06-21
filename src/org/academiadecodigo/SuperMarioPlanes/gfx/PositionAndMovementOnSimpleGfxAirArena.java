package org.academiadecodigo.SuperMarioPlanes.gfx;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.MunitionPath;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyFlyPath;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.AbstractPosition;


public class PositionAndMovementOnSimpleGfxAirArena extends AbstractPosition {

    private SimpleGfxAirArena simpleGfxAirArena;

    public PositionAndMovementOnSimpleGfxAirArena(int x, int y, SimpleGfxAirArena simpleGfxAirArena) {
        super(x, y, simpleGfxAirArena);
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

    public void move(EnemyFlyPath path) {

        //TODO: programmed movement to follow relative positions directly to translate method.

        switch (path) {
            case STRAIGHTDOWN:
                setPos(getX(), getY() + path.getTranslation());
                break;

            default:
                setPos(getX(), getY());
        }

    }

    public void move(MunitionPath path) {

        //TODO: programmed movement to follow relative positions directly to translate method.

        switch (path) {
            case STRAIGHTDOWN:
                setPos(getX(),getY()+path.getTranslation());
                break;

            case STRAIGHTUP:
                setPos(getX(), getY()-path.getTranslation());
        }

    }
}
