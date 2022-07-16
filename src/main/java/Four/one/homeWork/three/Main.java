package Four.one.homeWork.three;

public class Main {
    public static void main(String[] args) {


        FruitBox<String, Banana> bananaFruitBox = new FruitBox<>("banana", new Banana());
        bananaFruitBox.getObj().printClass();

        FruitBox<String, Apple> appleFruitBox = new FruitBox<>("apple", new Apple());
        appleFruitBox.getObj().printClass();

        FruitBox<String, Fruit> fruitFruitBox = new FruitBox<>("fruit", new Fruit());
        fruitFruitBox.getObj().printClass();


        VegetableBox<String, Cabbage> cabbageVegetableBox = new VegetableBox<>("cabbage", new Cabbage());
        cabbageVegetableBox.getObj().printClass();

        VegetableBox<String, Vegetable> vegetableBox = new VegetableBox<>("vegetable", new Vegetable());
        vegetableBox.getObj().printClass();


    }
}
