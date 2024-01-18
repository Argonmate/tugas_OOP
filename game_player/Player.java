package game_player;

public class Player {
    String name;
    int speed,healthpoint,damage,Armorpoint;

    void run(){
        System.out.println(name+" is up running");
        System.out.println(speed+" km/h");
        System.out.println("Plane HP "+healthpoint);
    }
    void attack(){
        System.out.println("Su 7 damage ="+ damage);
    }
    void defense(){
        System.out.println("Su 7 Armorpoint ="+Armorpoint);
    }

    boolean isDead(){
        if(healthpoint <= 0) return true;
                    return false;
    }
}
