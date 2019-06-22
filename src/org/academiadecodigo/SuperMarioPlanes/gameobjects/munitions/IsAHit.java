package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import org.academiadecodigo.SuperMarioPlanes.gameobjects.GameObject;

public abstract class IsAHit {

   public boolean detected(GameObject obj1, GameObject[] objects){
       int totalHeightOfObjs;
       int totalWidthOfObjs;
       int heightOfImplementation;
       int widthOfImplementation;
       int xOfObj1 = obj1.getPosition().getX();
       int yOfObj1 = obj1.getPosition().getY();
       int xMaxOfObj1 = xOfObj1 + obj1.getWidth;
       int yMaxOfObj1 = yOfObj1 + obj1.getHeight;
       int widthOfObj1 = xMaxOfObj1 - xOfObj1;
       int heightOfObj1 = yMaxOfObj1 - yOfObj1;

       for (GameObject obj2 : objects){

           int xOfObj2 = obj2.getPosition().getX();
           int yOfObj2 = obj2.getPosition().getY();
           int xMaxOfObj2 = xOfObj2 + obj2.getWidth;
           int yMaxOfObj2 = yOfObj2 + obj2.getHeight;

           int widthOfObj2 = xMaxOfObj2 - xOfObj2;
           int heightOfObj2 = yMaxOfObj2 - yOfObj2;

           totalHeightOfObjs = heightOfObj1 + heightOfObj2;
           totalWidthOfObjs = widthOfObj1 + widthOfObj2;

           widthOfImplementation = (xOfObj2 < xOfObj1 ? xMaxOfObj1 - xOfObj2 : xMaxOfObj2 - xOfObj1);
           heightOfImplementation = (yOfObj1 < yOfObj2 ? yMaxOfObj2 - yOfObj1 : yMaxOfObj1 - yOfObj1);

           return totalWidthOfObjs > widthOfImplementation && totalHeightOfObjs > heightOfImplementation;
       }



       return false;
   }
}
