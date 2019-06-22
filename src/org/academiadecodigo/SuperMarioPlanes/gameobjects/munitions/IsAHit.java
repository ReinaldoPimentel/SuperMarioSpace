package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;

public class IsAHit {

   public static boolean detected(GameObject obj1, GameObject[] objects){
       int totalHeightOfObjs;
       int totalWidthOfObjs;
       int heightOfImplementation;
       int widthOfImplementation;
       int xOfObj1 = obj1.getPosition().getCol();
       int yOfObj1 = obj1.getPosition().getRow();

    //   int xMaxOfObj1 = xOfObj1 + obj1.getPosition().getImageWidth();
    //   int yMaxOfObj1 = yOfObj1 + obj1.getPosition().getImageHeigth();

    //   int widthOfObj1 = obj1.getPosition().getImageWidth();
    //   int heightOfObj1 = obj1.getPosition().getImageHeigth();

       //System.out.println(obj1.getWidth());

       for (GameObject obj2 : objects){


           int xOfObj2 = obj2.getPosition().getCol();
           int yOfObj2 = obj2.getPosition().getRow();

           GameObject mostLeft = xOfObj1 <= xOfObj2 ? obj1 : obj2;

           GameObject mostRight = xOfObj1 <= xOfObj2 ? obj2 : obj1;


           GameObject mostUp = yOfObj1 <= yOfObj2 ? obj1 : obj2;

           GameObject mostDown = yOfObj1 <= yOfObj2 ? obj2 : obj1;

           int totalWidth = mostLeft.getPosition().getImageWidth() + mostRight.getPosition().getImageWidth();

           int totalHeight = mostUp.getPosition().getImageHeigth() + mostDown.getPosition().getImageHeigth();

           int totalWidthOfBox = ((mostRight.getPosition().getCol()*10 + mostRight.getPosition().getImageWidth()) - mostLeft.getPosition().getCol()*10);

           int totalHeightOfBox = ((mostDown.getPosition().getRow()*10 + mostUp.getPosition().getImageHeigth()) - mostUp.getPosition().getRow()*10);

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

           if (totalHeightOfBox < totalHeight && totalWidthOfBox < totalWidth) {
               return true;
           }

       }


       return false;
   }

}
