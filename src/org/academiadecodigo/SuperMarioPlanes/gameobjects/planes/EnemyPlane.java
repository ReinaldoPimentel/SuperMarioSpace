package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.Killable;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public class EnemyPlane extends Plane {

    private EnemyType enemyType;
    private EnemyFlyPath enemyFlyPath;
    private Position position;

    public EnemyPlane(EnemyType enemyType, EnemyFlyPath enemyFlyPath, Position position){
        super(position);
        this.enemyType = enemyType;
        this.enemyFlyPath = enemyFlyPath;
        this.position = position;
    }

}
