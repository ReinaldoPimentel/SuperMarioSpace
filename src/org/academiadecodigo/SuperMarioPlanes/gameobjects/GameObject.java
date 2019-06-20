package org.academiadecodigo.SuperMarioPlanes.gameobjects;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public abstract class GameObject {
    private Position position;
    private String message;

    public GameObject(Position position){
        this.position = position;
    }

    public String getMessage() {
        return this.message;
    }

    public Position getPosition(){
        return this.position;
    }
}
