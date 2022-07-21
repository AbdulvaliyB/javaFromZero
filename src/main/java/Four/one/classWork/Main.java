package Four.one.classWork;

public class Main {

    public static void main(String[] args) {

        Box<Number> box = new Box<>(4);
        Number num = 4;

        Float sumFloat = sum(5.0f, 4.5f);
        Integer sumInteger = sum(5, 4);


    }

    public static <T extends Number> T sum(T arg1, T arg2) {
//            return arg1 + arg2;
        return null;
    }
}
