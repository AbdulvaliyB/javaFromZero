package Three.three.classWork.entity;

public class Ship extends Transport{

    public Ship(int fuel) {
        super(120);
    }

    @Override
    public void move(String name, String from, String to) {
        System.out.println(name+" переплыл из "+from+" в "+to);
    }
}
