package Four.three.classWork;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Account {
    private final String number;
    private final String name;
    private int money;

    public Account(String number, String name) {
        this.number = number;
        this.name = name;
        this.money = 0;
    }
}
