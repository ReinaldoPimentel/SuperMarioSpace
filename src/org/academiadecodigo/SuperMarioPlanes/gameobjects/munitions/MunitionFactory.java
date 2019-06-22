package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.Plane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class MunitionFactory {


    public MunitionFactory() {

    }

    public static Munition getNewMunition(SimpleGfxAirArena arena, Position planePosition, Object obj) {

        int rng = (int) (Math.random() * MunitionType.values().length);

        MunitionType munitionType = MunitionType.values()[rng];

        //MunitionPath munitionPath = MunitionPath.STRAIGHTDOWN;

        //Munition ammo = new Munition(arena, planePosition, obj);

        return null;

    }

    private static MunitionPath choosePath(Object plane) {
        if (plane instanceof EnemyPlane) {
            return MunitionPath.STRAIGHTDOWN;
        }
        return MunitionPath.STRAIGHTUP;
    }

}

