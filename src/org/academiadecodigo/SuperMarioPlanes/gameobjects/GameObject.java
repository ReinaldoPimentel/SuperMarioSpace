package org.academiadecodigo.SuperMarioPlanes.gameobjects;


import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {
    private boolean Hide;
    private Position position;
    private int X;
    private int Y;
    private String message;
    private int width;
    private int height;
    private SimpleGfxAirArena grid;
    //private Picture image;


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
        this.Hide = false;
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

    public void hide(){
        Hide = true;
        position.getImage().delete();
    }

    public boolean isHide() {
        return Hide;
    }

    public void explosion() {
        Picture bum = new Picture(0,0, "resources/bumbum.png");
        bum.draw();
    }
    /* public Picture getImage() {
        return image;
    }*/
}
