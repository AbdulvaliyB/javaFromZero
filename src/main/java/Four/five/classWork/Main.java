package Four.five.classWork;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Masha");
        list.add("Petya");
        list.add("Kolya");

        Map<Country, String> map = new TreeMap<>();
        map.put(new Country("Russia",146), "Masha");
        map.put(new Country("USA",360), "Petya");
        map.put(new Country("Ukraine",40), "Kolyav");

        for (Country country : map.keySet()) {
            System.out.println(country);
        }

    }
}
