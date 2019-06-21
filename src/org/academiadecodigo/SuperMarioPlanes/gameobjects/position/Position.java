package org.academiadecodigo.SuperMarioPlanes.gameobjects.position;

public interface Position {

    public int getX();
    public int getY();
    public void setPos(int x, int y);
    public void setHitArea(int xLeft, int yLeft, int xRight, int yRigth);
    public void move();

}
