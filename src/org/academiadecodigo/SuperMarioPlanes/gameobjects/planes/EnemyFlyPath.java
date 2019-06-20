package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

public enum EnemyFlyPath {
    STRAIGHT(new int[]{1},new int []{1});

    private int[] xRatio;
    private int[] yRatio;

    EnemyFlyPath(int[] xRatio, int[] yRatio){
        this.xRatio = xRatio;
        this.yRatio = yRatio;
    }

    public int[] getXRatio(){
        return xRatio;
    }

    public int[] getYRatio(){
        return yRatio;
    }

}
