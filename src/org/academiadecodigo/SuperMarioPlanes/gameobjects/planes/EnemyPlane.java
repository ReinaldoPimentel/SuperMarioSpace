package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public class EnemyPlane extends Plane {

    private EnemyType enemyType;
    private EnemyFlyPath enemyFlyPath;
    private Position position;

    public EnemyPlane(){
        super();
        this.enemyType = enemyType;
        this.enemyFlyPath = enemyFlyPath;
        this.position = position;

    }

    @Override
    public void shoot(){
        if (Math.random() < 0.2){
        super.shoot();
        }

    }

}
