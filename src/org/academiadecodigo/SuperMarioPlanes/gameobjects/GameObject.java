package org.academiadecodigo.SuperMarioPlanes.gameobjects;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.AbstractPosition;

public abstract class GameObject {
    private AbstractPosition hitArea;
    private AbstractPosition position;
    private String message;
    private int width;
    private int height;

    public GameObject(AbstractPosition position, int width, int height){
        this.width = width;
        this.height = height;
        this.position = position;
    }

    public GameObject(AbstractPosition position){
        this.position = position;
    }

    public AbstractPosition getHitPosition(){
        return null;
    }

    public String getMessage() {
        return this.message;
    }

    public AbstractPosition getPosition(){
        return this.position;
    }
}
