package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public enum MunitionPath {
    DOWN(10),
    UP(20);

    private int translation;


    MunitionPath(int translation){


        this.translation = translation;
    }

    public int getTranslation() {
        return translation;
    }
}
