package org.academiadecodigo.SuperMarioPlanes.gameobjects;


import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {
    private Position position;
    private int X;
    private int Y;
    private String message;
    private int width;
    private int height;
    private SimpleGfxAirArena grid;
    private Picture image;


    public GameObject(){
        width = width;
        height = height;
        position = position;
    }

    public GameObject(SimpleGfxAirArena grid, Position position){
        this.position = position;
        this.X = position.getCol();
        this.Y = position.getRow();
        this.width = position.getImageWidth();
        this.height = position.getImageHeigth();
        this.grid = grid;
    }

    public Position getHitPosition(){
        return null;
    }

    public String getMessage() {
        return this.message;
    }

    public Position getPosition(){
        return position;
    }

    public SimpleGfxAirArena getGrid(){
        return grid;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public Picture getImage() {
        return image;
    }
}
