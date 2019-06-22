package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyFlyPath;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        SimpleGfxAirArena arena = new SimpleGfxAirArena();
        arena.init();
        Picture a = new Picture(10, 10, "resources/fireball.png");
        a.draw();
        int y = 0;
        PlayerPlane b = new PlayerPlane(arena, arena.makeGridPosition(25, 65, "resources/plani.png"));


        while (true) {

           try {
                    Thread.sleep(40);
               arena.move();
               a.translate(0, 2);
           } catch (InterruptedException e) {
               //e.printStackTrace();
           }

                while (b.isMoving()){
                    b.move();
                    arena.move();
                    a.translate(0, 2);

                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                    }

                }

        }
    }
}
