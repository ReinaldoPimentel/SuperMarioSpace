package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class EnemyPlane extends Plane {

    private EnemyType enemyType;
    private EnemyFlyPath enemyFlyPath;
    private Position position;
    private SimpleGfxAirArena grid;

    public EnemyPlane(SimpleGfxAirArena grid, Position position){
        super(position);
        this.enemyType = enemyType;
        this.enemyFlyPath = enemyFlyPath;
        this.position = position;
        this.grid = grid;

    }

    @Override
    public void shoot(){
        if (Math.random() < 0.2){
        super.shoot();
        }

    }

    public SimpleGfxAirArena getGrid() {
        return grid;
    }

}
