package Three.three.classWork;

import Three.three.classWork.entity.Car;
import Three.three.classWork.entity.Mover;

public class Main {

    public static void main(String[] args) {


        moscowToPetersburg("Petya", new Car());

    }

    public static void moscowToPetersburg(String name, Mover mover){
        mover.move(name, "Moscow", "St. Petersburg");
    }
}
