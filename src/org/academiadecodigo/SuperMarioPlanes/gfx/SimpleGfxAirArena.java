package org.academiadecodigo.SuperMarioPlanes.gfx;


import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class SimpleGfxAirArena implements AirArena {

    private Picture airField;

    @Override
    public void init() {
        airField = new Picture(0,0, "resources/map1.png");
        airField.draw();
        airField.translate(0, -3000);
    }

    public void move() {
        airField.translate(0, 2);
    }

    @Override
    public int getWidth() {
        return airField.getWidth();
    }

    @Override
    public int getHeight() {
        return airField.getHeight();
    }

    @Override
    public Position makeScreenPosition(int x, int y) {
        return new PositionAndMovementOnSimpleGfxAirArena(x, y, this);
    }

    public int getX() {
        return this.airField.getX();
    }

    public int getY() {
        return this.airField.getY();
    }

}
