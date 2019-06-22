package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.Plane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class Munition extends GameObject {
    private MunitionType munitionType;
    //private SimpleGfxAirArena grid;
    //private MunitionPath munitionPath;
    private Directions direction;
    private Plane planeOrigin;

    public Munition(SimpleGfxAirArena grid, Position position, MunitionType munitionType, Directions direction, Plane planeOrigin){
        super(grid, position);
        this.munitionType = munitionType;
        //this.munitionPath = munitionPath;
        this.direction = direction;
        this.planeOrigin = planeOrigin;
    }

    public int getImpact(){
        return munitionType.getImpact();
    }

    public void move(){
        if (super.getPosition().getRow() == super.getGrid().getHeight() || super.getPosition().getRow() == 0){
            super.hide();
        }
        super.getPosition().moveInDirection(direction, 2);

    }

    public Plane getPlaneOrigin(){
        return planeOrigin;
    }


}
