package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Munition extends GameObject {
    private MunitionType munitionType;
    private SimpleGfxAirArena grid;

    public Munition(SimpleGfxAirArena grid, Position position){
        super(position);
        //this.munitionType = munitionType;
        this.grid = grid;

    }

    public int getImpact(){
        return munitionType.getImpact();
    }

}
