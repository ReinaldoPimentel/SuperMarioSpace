package org.academiadecodigo.SuperMarioPlanes.gfx;


import org.academiadecodigo.simplegraphics.pictures.*;

public class SimpleGfxAirArena {

    private int heigth;
    private Picture airField;

    //@Override
    public void init() {

        airField = new Picture(0,0, "resources/map1.png");
        airField.draw();
        airField.translate(0, -3000);
    }

    public void move() {
        airField.translate(0, 1);
    }

    //@Override
    public int getWidth() {
        return airField.getWidth();
    }

    //@Override
    public int getHeight() {
        return airField.getHeight();
    }

    public int getX() {
        return this.airField.getX();
    }

    public int getY() {
        return this.airField.getY();
    }

    //@Override
    public void setPos(int x, int y) {

    }

    //@Override
    public void setHitArea(int xLeft, int yLeft, int xRight, int yRigth) {

    }

}
