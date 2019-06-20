package org.academiadecodigo.SuperMarioPlanes.gfx;


import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class SimpleGfxAirArena implements AirArena {

    public static final int PADDING = 10;

    private int width;
    private int height;
    private Rectangle AirField;

    public SimpleGfxAirArena(int width, int height){
        this.width = width;
        this.height = height;
    }

    @Override
    public void init() {
        this.AirField = new Rectangle(PADDING,PADDING, width, height);
        this.AirField.draw();
    }

    @Override
    public int getWidth() {
        return AirField.getWidth();
    }

    @Override
    public int getHeight() {
        return AirField.getHeight();
    }

    @Override
    public Position makeScreenPosition(int x, int y) {
        return new PositionAndMovimentOnSimpleGfxAirArena(x, y, this);
    }

    public int getX() {
        return this.AirField.getX();
    }

    public int getY() {
        return this.AirField.getY();
    }

}
