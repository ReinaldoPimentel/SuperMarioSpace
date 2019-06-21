package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.AbstractPosition;

public class Munition extends GameObject {
    private MunitionType munitionType;

    public Munition(AbstractPosition position, MunitionType munitionType, MunitionPath munitionPath){
        super(position);
        this.munitionType = munitionType;
    }

    public int getImpact(){
        return munitionType.getImpact();
    }

}
