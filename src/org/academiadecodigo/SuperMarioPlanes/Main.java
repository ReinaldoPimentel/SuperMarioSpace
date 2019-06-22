package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.IsAHit;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Main {
    public static void main(String[] args) {

        SimpleGfxAirArena arena = new SimpleGfxAirArena();
        arena.init();
        Picture a = new Picture(10, 10, "resources/fireball.png");
        a.draw();
        int y = 0;
        PlayerPlane b = new PlayerPlane(arena, arena.makeGridPosition(25, 65, "resources/plani.png"));
        EnemyPlane enemyPlane = new EnemyPlane(arena, arena.makeGridPosition(25, 15, "resources/plani.png"));

        GameObject[] array = {enemyPlane};
        System.out.println(b.getPosition().getCol());

        while (true) {

            try {
                Thread.sleep(40);
                arena.move();
                a.translate(0, 2);
                System.out.println(IsAHit.detected(b,array));
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }


            while (b.isMoving()) {
                b.move();
                arena.move();
                a.translate(0, 2);
                //System.out.println(b.getPosition().getCol() + " - " + b.getPosition().getRow());

                try {
                    Thread.sleep(30);
                } catch (InterruptedException e) {
                    //e.printStackTrace();
                }

            }

        }
    }
}
