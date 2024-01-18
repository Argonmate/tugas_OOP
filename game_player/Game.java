package game_player;

public class Game {

     public static void main(String[] args) {
        Player hero = new Player();

        hero.name = "su 7";
        hero.speed = 1000;
        hero.healthpoint = 100;

        hero.run();

     }
}