package org.academiadecodigo.SuperMarioPlanes;


public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Game game = new Game();
        menu.startMenu();
        while (true) {


            while (!menu.hasFinished) {
                System.out.println(" ");
            }

            //menu.setHasFinished(false);
            //game = new Game();
            game.init();


        }


    }

}
