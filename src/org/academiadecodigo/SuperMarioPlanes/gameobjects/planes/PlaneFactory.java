package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gfx.PositionAndMovementOnSimpleGfxAirArena;

public class PlaneFactory {

    public PlaneFactory(){

    }

    public static Plane getNewPlane(PositionAndMovementOnSimpleGfxAirArena initPlanePos){

        int rng = (int) (Math.random() * EnemyType.values().length);

        EnemyType enemyType = EnemyType.values()[rng];

        EnemyFlyPath enemyFlyPath = EnemyFlyPath.STRAIGHT;

        Plane enemyPlane = new EnemyPlane(enemyType, enemyFlyPath, initPlanePos);

        return enemyPlane;
    }
    
}
