package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;

public enum EnemyType {
    ENEMY1(20),
    ENEMY2(50);

    private int health;

    EnemyType(int health){
    this.health = health;
    }

    public int getHealth() {
        return health;
    }
}
