package Three.threeThree.classWork;

import Three.threeThree.classWork.entity.Car;
import Three.threeThree.classWork.entity.Mover;

public class Main {

    public static void main(String[] args) {


        moscowToPetersburg("Petya", new Car());

    }

    public static void moscowToPetersburg(String name, Mover mover){
        mover.move(name, "Moscow", "St. Petersburg");
    }
}
