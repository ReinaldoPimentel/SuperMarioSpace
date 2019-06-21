package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyFlyPath;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SimpleGfxAirArena arena = new SimpleGfxAirArena();
        arena.init();
        Picture a = new Picture(10, 10, "resources/bumbum.png");
        a.draw();
        int y = 0;
        Picture b = new Picture(100, 100, "resources/plani.png");
        b.draw();


        try {
            while (true) {
                Thread.sleep(10);
                arena.move();
                a.translate(0, 2);
                b.translate(1, 1);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
