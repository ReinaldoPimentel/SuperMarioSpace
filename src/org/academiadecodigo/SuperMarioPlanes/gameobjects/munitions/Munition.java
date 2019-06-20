package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public class Munition extends GameObject {
    private MunitionType munitionType;

    public Munition(Position position, MunitionType munitionType){
        super(position);
        this.munitionType = munitionType;
    }

    public int getImpact(){
        return munitionType.getImpact();
    }

}
