package org.academiadecodigo.SuperMarioPlanes.gameobjects.position;

import org.academiadecodigo.SuperMarioPlanes.gfx.SimpleGfxAirArena;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public class Position {

    private SimpleGfxAirArena grid;
    private int col;
    private int row;
    private Picture image;


    public Position(int xStartPosition, int yStartPosition, SimpleGfxAirArena grid, String image) {
        this.col = xStartPosition;
        this.row = yStartPosition;
        this.grid = grid;
        this.image = new Picture(grid.colToX(xStartPosition), grid.rowToY(yStartPosition), image);
        this.image.draw();

    }

    public Picture getImage() {
        return image;
    }

    public int getImageWidth() {
        return image.getWidth();
    }

    public int getImageHeigth() {
        return image.getHeight();
    }

    public void moveInDirection(Directions direction, int dist) {

        int prevColX = grid.colToX(col);
        int prevRowY = grid.rowToY(row);

        switch (direction) {
            case UP:
                moveUp(dist);
                break;
            case UP_BULLET:
                moveUpBullet(dist);
                break;
            case DOWN:
                moveDown(dist);
                break;
            case DOWN_ENEMY:
                moveDownEnemy(dist);
            case LEFT:
                moveLeft(dist);
                break;
            case RIGHT:
                moveRight(dist);
                break;
        }

        int finalColX = grid.colToX(col);
        int finalRowY = grid.rowToY(row);

        image.translate(finalColX - prevColX, finalRowY - prevRowY);

    }

    private void moveUp(int dist) {
        if (getRow() > 0) {
            //int maxRowsUp = Math.min(dist, pos.getRow());
            setPos(getCol(), getRow() - dist);
        }
    }

    private void moveUpBullet(int dist) {
        setPos(getCol(), getRow() - dist );
    }


    private void moveDown(int dist) {
        if (getRow() < 70) {
            //int maxRowsDown = Math.min(getGrid().getRows() - (pos.getRow() + 1),dist);
            setPos(getCol(), getRow() + dist);
        }
    }

    private void moveDownEnemy(int dist) {


        //int maxRowsDown = Math.min(getGrid().getRows() - (pos.getRow() + 1),dist);
        setPos(getCol() + dist , getRow() + dist);

    }

    private void moveLeft(int dist) {
        if (getCol() > 0) {
            //int maxRowsLeft = Math.min(dist,pos.getCol());
            setPos(getCol() - dist, getRow());
        }

    }

    private void moveRight(int dist) {
        if (getCol() < 50) {
            //int maxRowsRight = Math.min(getGrid().getCols() - (getCol() + 1), dist);
            setPos(getCol() + dist, getRow());
        }
    }

    public void setCol(int x) {
        this.col = x;
    }

    public void setRow(int y) {
        this.row = y;
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public void setPos(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public SimpleGfxAirArena getGrid() {
        return grid;
    }
}
