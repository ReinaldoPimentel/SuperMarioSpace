package org.academiadecodigo.SuperMarioPlanes.audioX;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

public class AudioX {
   /* public static void main(String[] args) {
        playMusic(".//res//SuperMarioBros.wav");
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        playMusic(".//res//smb3_fireball.wav");
        playMusic(".//res//smb3_kick.wav");
        playMusic(".//res//smb3_kick.wav");
        playMusic(".//res//smb3_kick.wav");
    }*/

    public static void shoot(){
        playMusic(".//res//smb3_fireball.wav");
    }

    public static void theme(){
        playMusic(".//res//SuperMarioBros.wav");
    }

    public static void playMusic(String filePath) {

        InputStream music;
        try {
            music = new FileInputStream(new File(filePath));
            AudioStream sound = new AudioStream(music);
            AudioPlayer.player.start(sound);
        } catch (Exception e) {

        }

    }
}
