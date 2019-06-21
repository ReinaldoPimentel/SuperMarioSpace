package org.academiadecodigo.SuperMarioPlanes.gameobjects.position;

public abstract class AbstractPosition{

    private int x;
    private int y;


    public AbstractPosition(int xStartPosition, int yStartPosition) {
        this.x = xStartPosition;
        this.y = yStartPosition;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
