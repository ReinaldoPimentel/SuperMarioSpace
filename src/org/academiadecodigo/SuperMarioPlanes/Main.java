package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.audioX.AudioX;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.IsAHit;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.Munition;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions.MunitionFactory;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.Plane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlaneFactory;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        SimpleGfxAirArena arena = new SimpleGfxAirArena();
        arena.init();
        PlayerPlane b = new PlayerPlane(arena, arena.makeGridPosition(25, 65, "resources/player1.png"));
        AudioX audio = new AudioX();
        int counter = 0;
        double levelDiff = 0.05;
        int difficulty = (int) (Math.random() * 100);





        IsAHit isThereAColission = new IsAHit();



        LinkedList allObjects = new LinkedList();

        allObjects.add(b);



            while (!b.isDead()) {
                Text score = new Text(110, 50, "SCORE: " + counter);
                score.grow(100, 25);
                score.draw();

                try {
                    Thread.sleep(40);
                    //threadCounter += 40;
                    arena.move();

                    if (Math.random() < 0.9) {

                        EnemyPlane enemy = PlaneFactory.getNewPlane(arena);

                        allObjects.add(enemy);
                    }
                    if (b.hasFired()) {
                        GameObject ammo = MunitionFactory.getNewMunition(b.getGrid(), b.getPosition(), b);

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

                        if (allObjects.get(i) instanceof PlayerPlane) {
                            PlayerPlane object = (PlayerPlane) allObjects.get(i);
                            if (object.isHide()) {
                                b.setDead();
                                object.explosion(object.getPosition().getCol() * 10, object.getPosition().getRow() * 10);
                            }
                        }

                        if (allObjects.get(i) instanceof EnemyPlane) {
                            EnemyPlane object = (EnemyPlane) allObjects.get(i);

                            if (!object.isHide()) {
                                object.move();
                                if (object.getPosition().getRow() >= 0) {
                                    object.shoot();

                                    System.out.println(object.isDead());
                                }
                            } else {
                                if (object.getPosition().getRow() >= 0) {
                                    object.explosion(object.getPosition().getCol() * 10, object.getPosition().getRow() * 10);
                                    counter += 1;

                                }
                                System.out.println("is dead");
                                isToRemove = true;


                            }

                            if (object.hasFired()) {
                                GameObject ammo = MunitionFactory.getNewMunition(object.getGrid(), object.getPosition(), object);
                                allObjects.add(ammo);
                                object.reset_fired();
                            }

                        }

                      if (isToRemove) {
                            allObjects.remove(allObjects.get(i));

                        }

                    }

                    isThereAColission.detected(allObjects);


                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                if (b.isMoving()) {
                    b.move();
                    arena.move();

                    try {
                        Thread.sleep(30);
                    } catch (InterruptedException e) {
                    }

                }

                score.delete();

            }

        System.out.println(levelDiff);
        System.out.println("fuck you --> score: " + counter);
        Text score = new Text(250, 500, "Score: " + counter);
        score.grow(150,150);
        score.setColor(Color.DARK_GRAY);
        score.draw();




    }

}
