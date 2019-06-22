package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.IsAHit;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.Munition;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.MunitionFactory;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        SimpleGfxAirArena arena = new SimpleGfxAirArena();
        arena.init();
        PlayerPlane b = new PlayerPlane(arena, arena.makeGridPosition(25, 65, "resources/plani.png"));
        EnemyPlane enemyPlane = new EnemyPlane(arena, arena.makeGridPosition(25, 15, "resources/Enemy.png"), Directions.DOWN);
        IsAHit isThereAColission = new IsAHit();

        //LinkedList playerBullets = new LinkedList();
        //LinkedList planes = new LinkedList();
        //planes.add(b);

        LinkedList allObjects = new LinkedList();

        allObjects.add(b);
        allObjects.add(enemyPlane);

        Position startPoint = b.getPosition();


        while (true) {

            try {
                Thread.sleep(40);
                arena.move();

                if (b.hasFired()) {
                    GameObject ammo = MunitionFactory.getNewMunition(b.getGrid(), b.getPosition(), b);

                    //playerBullets.add(ammo);
                    allObjects.add(ammo);

                    b.reset_fired();
                }
                for (int i = 0; i < allObjects.size(); i++) {
                boolean isToRemove = false;


                        if (allObjects.get(i) instanceof Munition) {
                            Munition object = (Munition) allObjects.get(i);
                            if (!object.isHide()) {
                                object.move();
                            } else {
                                isToRemove = true;
                            }

                        }

                        if (allObjects.get(i) instanceof EnemyPlane) {
                            EnemyPlane object = (EnemyPlane) allObjects.get(i);
                            // PARA ELIMINAR AS BARRAS DE COMENTARIO
                            if (!object.isHide()) {
                                object.shoot();
                            } else {
                                System.out.println("is dead");
                                isToRemove = true;
                            }

                            if (object.hasFired()) {
                                GameObject ammo = MunitionFactory.getNewMunition(object.getGrid(), object.getPosition(), object);
                                allObjects.add(ammo);
                                object.reset_fired();
                            }

                            // PARA ELIMINAR AS BARRAS DO COMENTARIO pois impede o enemy plane de andar!!!!
                            // object.move();
                        }

                        if (isToRemove){
                            allObjects.remove(i);
                        }

                }

                isThereAColission.detected(allObjects);


                //   System.out.println(IsAHit.detected(b,array));
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }


            if (b.isMoving()) {
                b.move();
                arena.move();
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
