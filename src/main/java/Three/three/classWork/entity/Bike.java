package Three.three.classWork.entity;

public class Bike implements Mover {
    @Override
    public void move(String name, String from, String to) {
        System.out.println(name+" прокатился из "+from+"в"+to);
    }
}
