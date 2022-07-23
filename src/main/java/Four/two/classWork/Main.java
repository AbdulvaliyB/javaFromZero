package Four.two.classWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Fruit> fruitsArray = new ArrayList<>();
        List<Fruit> fruitsLinked = new LinkedList<>();

        addFruitToCollections(new Fruit("Apple", 300), fruitsArray, fruitsLinked);
        addFruitToCollections(new Fruit("Orange", 100), fruitsArray, fruitsLinked);
        addFruitToCollections(new Fruit("Banana", 150), fruitsArray, fruitsLinked);

        fruitsArray.clear();

        System.out.println("Все фрукты в ArrayList:");
        print(fruitsArray);
        System.out.println("Все фрукты в LinkedList:");
        print(fruitsLinked);
    }

    private static void print(Collection<Fruit> fruitCollection) {
        for (Fruit fruit : fruitCollection) {
            System.out.println(fruit);
        }
    }

    private static boolean addFruitToCollections(Fruit fruit, List<Fruit> fruitsArray, List<Fruit> fruitsLinked) {
        return fruitsArray.add(fruit) & fruitsLinked.add(fruit);
    }


}
