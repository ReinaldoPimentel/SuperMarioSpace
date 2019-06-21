package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.Plane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.PositionAndMovementOnSimpleGfxAirArena;

public class MunitionFactory {


    public MunitionFactory() {

    }

    public static Munition getNewMunition(Position planePosition, Plane plane) {

        int rng = (int) (Math.random() * MunitionType.values().length);

        MunitionType munitionType = MunitionType.values()[rng];

        MunitionPath munitionPath = MunitionPath.STRAIGHTDOWN;

        Munition ammo = new Munition(planePosition, munitionType, munitionPath);
        return ammo;

    }

    private MunitionPath choosePath(Plane plane) {
        if (plane instanceof EnemyPlane) {
            return MunitionPath.STRAIGHTDOWN;
        }
        return MunitionPath.STRAIGHTUP;
    }

}
