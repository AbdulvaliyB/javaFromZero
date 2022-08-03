package Four.five.classWork;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Country implements Comparable<Country> {
    private String name;
    private int population;

    @Override
    public int compareTo(Country country) {
        if (population > country.population) return 1;
        else if (population < country.population) return -1;
        return 0;
//        return name.compareTo(country.name);
    }

    @Override
    public boolean equals(Object obj) {
        return ((Country) obj).population == population;
    }
}

