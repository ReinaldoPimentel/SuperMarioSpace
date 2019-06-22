package org.academiadecodigo.SuperMarioPlanes.gameobjects;


import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public abstract class GameObject {
    private Position hitArea;
    private Position position;
    private String message;
    private int width;
    private int height;

    public GameObject(){
        this.width = width;
        this.height = height;
        this.position = position;
    }

    public GameObject(Position position){
        this.position = position;
        this.width = position.getImageWidth();
        this.height = position.getImageHeigth();
    }

    public Position getHitPosition(){
        return null;
    }

    public String getMessage() {
        return this.message;
    }

    public Position getPosition(){
        return this.position;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight() {
        return height;
    }
}
