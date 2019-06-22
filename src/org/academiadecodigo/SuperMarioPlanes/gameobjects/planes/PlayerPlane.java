package org.academiadecodigo.SuperMarioPlanes.gameobjects.planes;


import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Directions;
import org.academiadecodigo.SuperMarioPlanes.gameobjects.position.Position;
import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class PlayerPlane extends Plane implements KeyboardHandler {

    private Keyboard keyboard;
    private int speed = 1;
    private Position pos;
    private boolean moving = false;
    private SimpleGfxAirArena grid;
    private Directions direction;

    public PlayerPlane(SimpleGfxAirArena grid, Position pos){
        super(pos);
        this.pos = pos;
        this.grid = grid;
        keyboard = new Keyboard(this);
        init();

    }

    public void init() {

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent shoot = new KeyboardEvent();
        shoot.setKey(KeyboardEvent.KEY_SPACE);
        shoot.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);

        KeyboardEvent rLeft = new KeyboardEvent();
        rLeft.setKey(KeyboardEvent.KEY_LEFT);
        rLeft.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent rRight = new KeyboardEvent();
        rRight.setKey(KeyboardEvent.KEY_RIGHT);
        rRight.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent rUp = new KeyboardEvent();
        rUp.setKey(KeyboardEvent.KEY_UP);
        rUp.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent rDown = new KeyboardEvent();
        rDown.setKey(KeyboardEvent.KEY_DOWN);
        rDown.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        KeyboardEvent rShoot = new KeyboardEvent();
        rShoot.setKey(KeyboardEvent.KEY_SPACE);
        rShoot.setKeyboardEventType(KeyboardEventType.KEY_RELEASED);

        keyboard.addEventListener(left);
        keyboard.addEventListener(right);
        keyboard.addEventListener(up);
        keyboard.addEventListener(down);
        keyboard.addEventListener(shoot);
        keyboard.addEventListener(rLeft);
        keyboard.addEventListener(rRight);
        keyboard.addEventListener(rUp);
        keyboard.addEventListener(rDown);
        keyboard.addEventListener(rShoot);

    }

    public void shoot(){
        //MunitionFactory.getNewMunition(pos, this);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            shoot();
            return;
        }

        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                direction = Directions.LEFT;
                moving = true;
                //pos.moveInDirection(Directions.LEFT, speed);
                break;
            case KeyboardEvent.KEY_RIGHT:
                direction = Directions.RIGHT;
                moving = true;

                //pos.moveInDirection(Directions.RIGHT, speed);
                break;
            case KeyboardEvent.KEY_UP:
                direction = Directions.UP;
                moving = true;
                //pos.moveInDirection(Directions.UP, speed);
                break;
            case KeyboardEvent.KEY_DOWN:
                direction = Directions.DOWN;
                moving = true;
                //pos.moveInDirection(Directions.DOWN, speed);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {
            case KeyboardEvent.KEY_LEFT:
                moving = false;
                //pos.moveInDirection(Directions.LEFT, speed);
                break;
            case KeyboardEvent.KEY_RIGHT:
                moving = false;

                //pos.moveInDirection(Directions.RIGHT, speed);
                break;
            case KeyboardEvent.KEY_UP:

                moving = false;
                //pos.moveInDirection(Directions.UP, speed);
                break;
            case KeyboardEvent.KEY_DOWN:
                moving = false;
                //pos.moveInDirection(Directions.DOWN, speed);
                break;
        }
    }

    public SimpleGfxAirArena getGrid() {
        return grid;
    }

    public void move() {
        pos.moveInDirection(direction, speed);
    }

    public boolean isMoving() {
        return moving;
    }

    public void setMoving(boolean moving) {
        this.moving = moving;
    }
}

