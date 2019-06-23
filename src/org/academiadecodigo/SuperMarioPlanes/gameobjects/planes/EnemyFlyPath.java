package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

public enum EnemyFlyPath {
    STRAIGHTDOWN(10);

    private int translation;


    EnemyFlyPath(int translation){
        this.translation = translation;

    }



    public int getTranslation() {
        return translation;
    }
}
