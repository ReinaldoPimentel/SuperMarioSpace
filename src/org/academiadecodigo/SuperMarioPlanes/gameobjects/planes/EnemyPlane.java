package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.AbstractPosition;

public class EnemyPlane extends Plane {

    private EnemyType enemyType;
    private EnemyFlyPath enemyFlyPath;
    private AbstractPosition position;

    public EnemyPlane(EnemyType enemyType, EnemyFlyPath enemyFlyPath, AbstractPosition position){
        super(position);
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
