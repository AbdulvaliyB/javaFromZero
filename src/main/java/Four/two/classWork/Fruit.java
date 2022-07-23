package Four.two.classWork;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Fruit {
    private static final int MAX_WEIGHT = 5000;

    private final String name;
    private final int weight;
}
