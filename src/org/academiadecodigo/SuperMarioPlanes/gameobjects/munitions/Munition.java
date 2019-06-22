package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class Munition extends GameObject {
    private MunitionType munitionType;
    //private SimpleGfxAirArena grid;
    //private MunitionPath munitionPath;
    private Directions direction;

    public Munition(SimpleGfxAirArena grid, Position position, MunitionType munitionType, Directions direction){
        super(grid, position);
        this.munitionType = munitionType;
        //this.munitionPath = munitionPath;
        this.direction = direction;
    }

    public int getImpact(){
        return munitionType.getImpact();
    }

    public void move(){
        super.getPosition().moveInDirection(direction, 10);

    }


}
