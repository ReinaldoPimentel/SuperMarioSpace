package org.academiadecodigo.SuperMarioPlanes.gfx;


import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.*;

import java.awt.*;

public class SimpleGfxAirArena {

    private int heigth;
    private int cols;
    private int rows;
    private Picture airField;
    private Rectangle base;
    private static final int CELL_SIZE = 10;

    //@Override
    public void init() {
        base = new Rectangle(0,0,600,800);
        base.draw();
        airField = new Picture(0,0, "resources/map1.png");
        airField.draw();
        airField.translate(0, -3000);
    }

    public void move() {
        airField.translate(0, 1);
    }

    //@Override
    public int getWidth() {
        return base.getWidth();
    }

    //@Override
    public int getHeight() {
        return base.getHeight();
    }

    public Position makeGridPosition(int cols, int rows, String image) {
        return new Position(cols, rows, this, image);
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

    public int getCellSize() {
        return CELL_SIZE;
    }

    public int colToX(int cols) {
        return cols * CELL_SIZE;
    }

    public int rowToY(int rows) {
        return rows * CELL_SIZE;
    }


}
