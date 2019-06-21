package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

public class Main {
    public static void main(String[] args) {
        SimpleGfxAirArena arena = new SimpleGfxAirArena();
        arena.init();

        try {
            while (true) {
                Thread.sleep(100);
                arena.move();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
