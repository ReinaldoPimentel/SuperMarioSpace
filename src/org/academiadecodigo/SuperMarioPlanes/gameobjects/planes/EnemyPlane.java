package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class EnemyPlane extends Plane {

    private EnemyType enemyType;
    private Directions direction;
  //  private EnemyFlyPath enemyFlyPath;
  //  private Position position;
  //  private SimpleGfxAirArena grid;

    public EnemyPlane(SimpleGfxAirArena grid, Position position, Directions directions){
        super(grid, position);
        this.direction = directions;
      //  this.enemyType = enemyType;
     //   this.enemyFlyPath = enemyFlyPath;

      //  this.position = position;
      //  this.grid = grid;

    }

    @Override
    public void shoot(){
        if (Math.random() < 0.05){
        super.shoot();
        }
    }

    @Override
    public boolean hasFired(){
        return super.hasFired();
    }

    public void move(){
       /* if (super.getPosition().getRow() == super.getGrid().getHeight() || super.getPosition().getRow() == 0){
            super.hide();
        }*/
        super.getPosition().moveInDirection(direction, 1);

    }


   /* public SimpleGfxAirArena getGrid() {
        return grid;
    }*/

}
