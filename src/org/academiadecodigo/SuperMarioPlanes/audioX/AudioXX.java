package org.academiadecodigo.SuperMarioPlanes.audioX;

import org.academiadecodigo.SuperMarioPlanes.Main;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;


// Change this class to your liking, this is just a base example

public class AudioXX {
    Clip clip;

    public void stopMusic() {
        clip.stop();
    }

    public void startMusic() {
        String pathStr = "/resources/racestart.wav";
        URL soundURL;
        AudioInputStream audioInputStream = null;
        try {
            soundURL = Main.class.getResource(pathStr);
            if (soundURL == null) {
                pathStr = pathStr.substring(1);
                File file = new File(pathStr);
                soundURL = file.toURI().toURL();
            }
            audioInputStream = AudioSystem.getAudioInputStream(soundURL);
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();

            clip.loop(clip.LOOP_CONTINUOUSLY);
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
