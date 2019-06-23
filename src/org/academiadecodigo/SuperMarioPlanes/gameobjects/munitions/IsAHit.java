package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import jdk.swing.interop.SwingInterOpUtils;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.EnemyPlane;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.planes.PlayerPlane;

import java.util.LinkedList;

public class IsAHit {

    public void detected(LinkedList objects) {
        int totalHeightOfObjs;
        int totalWidthOfObjs;
        int heightOfImplementation;
        int widthOfImplementation;
        //   int xOfObj1 = obj1.getPosition().getCol();
        //   int yOfObj1 = obj1.getPosition().getRow();

        //   int xMaxOfObj1 = xOfObj1 + obj1.getPosition().getImageWidth();
        //   int yMaxOfObj1 = yOfObj1 + obj1.getPosition().getImageHeigth();

        //   int widthOfObj1 = obj1.getPosition().getImageWidth();
        //   int heightOfObj1 = obj1.getPosition().getImageHeigth();

        //System.out.println(obj1.getWidth());

        for (int i = 0; i < objects.size(); i++) {

            GameObject obj1 = (GameObject) objects.get(i);

            int xOfObj1 = obj1.getPosition().getCol();
            int yOfObj1 = obj1.getPosition().getRow();

            for (int j = i + 1; j < objects.size(); j++) {

                GameObject obj2 = (GameObject) objects.get(j);
                boolean jump = false;

                if (obj1 instanceof Munition && obj2 instanceof PlayerPlane) {

                    Munition ammoObj = (Munition) obj1;
                    PlayerPlane planeObj = (PlayerPlane) obj2;

                    if (planeObj == ammoObj.getPlaneOrigin()) {
                        System.out.println(" player vai dar salto");
                        continue;
                    }

                }

                if (obj2 instanceof Munition && obj1 instanceof PlayerPlane) {

                    Munition ammoObj = (Munition) obj2;
                    PlayerPlane planeObj = (PlayerPlane) obj1;

                    if (planeObj == ammoObj.getPlaneOrigin()) {
                        continue;
                    }

                }

                if (obj1 instanceof Munition && obj2 instanceof EnemyPlane) {

                    Munition ammoObj = (Munition) obj1;
                    EnemyPlane planeObj = (EnemyPlane) obj2;

                    if (planeObj == ammoObj.getPlaneOrigin()) {
                        System.out.println("enemy salta");
                        continue;
                    }

                }

                if (obj2 instanceof Munition && obj1 instanceof EnemyPlane) {

                    Munition ammoObj = (Munition) obj2;
                    EnemyPlane planeObj = (EnemyPlane) obj1;

                    if (planeObj == ammoObj.getPlaneOrigin()) {
                        continue;
                    }

                }
                if (obj1 instanceof Munition && obj2 instanceof Munition) {
                    continue;
                }


                if (i != j) {

                    int xOfObj2 = obj2.getPosition().getCol();
                    int yOfObj2 = obj2.getPosition().getRow();

                    GameObject mostLeft = xOfObj1 <= xOfObj2 ? obj1 : obj2;

                    GameObject mostRight = xOfObj1 <= xOfObj2 ? obj2 : obj1;

                    GameObject mostUp = yOfObj1 <= yOfObj2 ? obj1 : obj2;

                    GameObject mostDown = yOfObj1 <= yOfObj2 ? obj2 : obj1;

                    int totalWidth = mostLeft.getPosition().getImageWidth() + mostRight.getPosition().getImageWidth();

                    int totalHeight = mostUp.getPosition().getImageHeigth() + mostDown.getPosition().getImageHeigth();

                    int totalWidthOfBox = ((mostRight.getPosition().getCol() * 10 + mostRight.getPosition().getImageWidth()) - mostLeft.getPosition().getCol() * 10);

                    int totalHeightOfBox = ((mostDown.getPosition().getRow() * 10 + mostUp.getPosition().getImageHeigth()) - mostUp.getPosition().getRow() * 10);

        /*   int xMaxOfObj2 = xOfObj2 + obj2.getPosition().getImageWidth();
           int yMaxOfObj2 = yOfObj2 + obj2.getPosition().getImageHeigth();
           //System.out.println("1 " + obj2.getWidth());

           int widthOfObj2 = obj2.getPosition().getImageWidth();
           int heightOfObj2 = obj2.getPosition().getImageHeigth();
           //System.out.println(widthOfObj2);

           totalWidthOfObjs = widthOfObj1 + widthOfObj2;
           totalHeightOfObjs = heightOfObj1 + heightOfObj2;

           widthOfImplementation = (xOfObj2 < xOfObj1 ? xMaxOfObj1 - xOfObj2 : xMaxOfObj2 - xOfObj1);
           heightOfImplementation = (yOfObj1 < yOfObj2 ? yMaxOfObj2 - yOfObj1 : yMaxOfObj1 - yOfObj2);
*/


                    //  return ((totalWidthOfObjs > widthOfImplementation) && (totalHeightOfObjs > heightOfImplementation));

                    if ((totalHeightOfBox < totalHeight && totalWidthOfBox < totalWidth)) {

                        obj1.hide();
                        // obj1.explosion();
                        obj2.hide();
                        // obj2.explosion();
                    }
                }
            }

        }

    }

}
