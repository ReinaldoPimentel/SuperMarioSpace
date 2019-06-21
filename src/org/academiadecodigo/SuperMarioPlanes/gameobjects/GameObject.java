package org.academiadecodigo.SuperMarioPlanes.gameobjects;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public abstract class GameObject {
    private Position hitArea;
    private Position position;
    private String message;
    private int width;
    private int height;

    public GameObject(Position position, int width, int height){
        this.width = width;
        this.height = height;
        this.position = position;
    }

    public Position getHitPosition(){


    }

    public String getMessage() {
        return this.message;
    }

    public Position getPosition(){
        return this.position;
    }
}
