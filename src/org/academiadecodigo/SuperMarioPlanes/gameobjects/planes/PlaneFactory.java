package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class PlaneFactory {

    private static int row  = -10;

    public PlaneFactory(){

    }

    public static EnemyPlane getNewPlane(SimpleGfxAirArena initPlanePos){

        Position pos = new Position(getInXPos(), row, initPlanePos, "resources/Enemy.png");

         return new EnemyPlane(initPlanePos, pos, Directions.DOWN_ENEMY);
    }

    public  static int getInXPos(){
        int inXPos = (int) (Math.floor(Math.random()*(50 - 10) + 1) + 10);
        return inXPos;
    }
    
}
