package Four.five.classWork;

import java.util.Comparator;

public class CountryNameComparator implements Comparator<Country> {
    @Override
    public int compare(Country o1, Country o2) {
        return o1.compareTo(o2);
    }
}
