package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        SimpleGfxAirArena arena = new SimpleGfxAirArena();
        arena.init();
        Picture a = new Picture(10, 10, "resources/fireball.png");
        a.draw();
        PlayerPlane b = new PlayerPlane(arena, arena.makeGridPosition(25, 65, "resources/plani.png"));
        EnemyPlane enemyPlane = new EnemyPlane(arena, arena.makeGridPosition(25, 15, "resources/plani.png"));
        LinkedList bullets = new LinkedList();

        GameObject[] array = {enemyPlane};
        System.out.println(b.getPosition().getCol());

        Position startPoint = b.getPosition();

      //  Munition munition = new Munition(arena, startPoint, MunitionType.FIREBALL, Directions.UP);


        while (true) {

            try {
                Thread.sleep(40);
                arena.move();
                a.translate(0, 2);
              //  munition.move();




             //   System.out.println(IsAHit.detected(b,array));
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
