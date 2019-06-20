package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

public enum MunitionType {
    FIREBALL(50);

    private int impact;

    MunitionType(int impact){
        this.impact = impact;
    }

    public int getImpact() {
        return impact;
    }
}
