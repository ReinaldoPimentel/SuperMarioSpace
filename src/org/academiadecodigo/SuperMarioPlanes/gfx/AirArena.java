package org.academiadecodigo.SuperMarioPlanes.gfx;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;

public interface AirArena {

    void init();
    int getWidth();
    int getHeight();

    Position makeScreenPosition(int x, int y);

}
