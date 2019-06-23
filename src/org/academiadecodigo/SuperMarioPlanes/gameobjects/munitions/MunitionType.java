package org.academiadecodigo.SuperMarioPlanes.gameobjects.munitions;

import javax.imageio.stream.FileImageInputStream;

public enum MunitionType {
    FIREBALL(50, "resources/fireball.png");


    private int impact;
    private FileImageInputStream imgPath;

    MunitionType(int impact, String imgPath){
        this.impact = impact;
    }

    public int getImpact() {
        return impact;
    }

    public FileImageInputStream getImgPath(){
        return imgPath;
    }
}
