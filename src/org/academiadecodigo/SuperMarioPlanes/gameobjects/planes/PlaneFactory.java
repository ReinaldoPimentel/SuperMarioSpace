package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class PlaneFactory {

    private static int row  = -10;

    public PlaneFactory(){

    }

    public static EnemyPlane getNewPlane(SimpleGfxAirArena initPlanePos){




        Position posr = new Position(getInXPos(), row, initPlanePos, "resources/goomba.png");
        Position img1 = new Position(getInXPos(), row, initPlanePos, "resources/koopa.png");

        int number = (int) (Math.random() * 2);
        Position pos;
        if (number == 0) {
            pos = posr;
        } else {
            pos = img1;
        }




         return new EnemyPlane(initPlanePos, pos, Directions.DOWN_ENEMY);
    }

    public  static int getInXPos(){
        int inXPos = (int) (Math.floor(Math.random()*(50 + 1)));
        return inXPos;
    }
    
}
