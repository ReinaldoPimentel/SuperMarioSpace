package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

public enum MunitionPath {
    STRAIGHTDOWN(10),
    STRAIGHTUP(20),
    TOTARGET(10);

    private int translation;

    MunitionPath(int translation){
        this.translation = translation;
    }

    public int getTranslation() {
        return translation;
    }
}
