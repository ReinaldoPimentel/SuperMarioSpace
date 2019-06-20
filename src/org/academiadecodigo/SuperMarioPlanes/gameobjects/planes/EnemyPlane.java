package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.Killable;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public class EnemyPlane extends Plane implements Killable {

    private EnemyType enemyType;
    private EnemyFlyPath enemyFlyPath;
    private Position position;

    public EnemyPlane(EnemyType enemyType, EnemyFlyPath enemyFlyPath, Position position){
        super(enemyType.getHealth(),position);
        this.enemyType = enemyType;
        this.enemyFlyPath = enemyFlyPath;
        this.position = position;
    }

}
