package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.Plane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class MunitionFactory {


    public MunitionFactory() {

    }

    public static Munition getNewMunition(SimpleGfxAirArena arena, Position planePosition, Plane plane) {

        int bulletCol = planePosition.getCol() + 4;
        int bulletRow = planePosition.getRow() + 4;

        int rng = (int) (Math.random() * MunitionType.values().length);

        MunitionType munitionType = MunitionType.values()[rng];

       // MunitionPath munitionPath = MunitionPath.STRAIGHTDOWN;


        Munition ammo = new Munition(arena, arena.makeGridPosition(bulletCol, bulletRow, "resources/fireball.png"), munitionType, choosePath(plane), plane);
        ammo.move();
        return ammo;

    }

    private static Directions choosePath(Object plane) {
        if (plane instanceof EnemyPlane) {
            return Directions.DOWN_ENEMY;
        }
        return Directions.UP_BULLET;
    }

}

