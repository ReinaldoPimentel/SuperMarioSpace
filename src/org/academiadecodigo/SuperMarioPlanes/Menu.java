package org.academiadecodigo.SuperMarioPlanes;

import org.academiadecodigo.SuperMarioPlanes.audioX.AudioXX;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Menu implements KeyboardHandler {
    private Keyboard keyboard;
    private Picture mainMenu;
    boolean hasFinished;
    boolean restart;
    AudioXX audio = new AudioXX();



    public Menu() {
        keyboard = new Keyboard(this);

    }

    public void startMenu() {
        audio.startMusic();
        mainMenu = new Picture(0,0,"resources/startMenu.jpg");
        mainMenu.draw();

        

        KeyboardEvent start = new KeyboardEvent();
        start.setKey(KeyboardEvent.KEY_SPACE);
        start.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        keyboard.addEventListener(start);


    }


    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            mainMenu.delete();
            hasFinished = true;
            audio.stopMusic();





        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public void setHasFinished(boolean hasFinished) {
        this.hasFinished = hasFinished;
    }
}
