package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

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
