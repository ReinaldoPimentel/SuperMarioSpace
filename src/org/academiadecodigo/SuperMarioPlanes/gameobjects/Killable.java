package org.academiadecodigo.SuperMarioPlanes.gameobjects;

public interface Killable {
    void hit(int impact);
    boolean isDead();
}
