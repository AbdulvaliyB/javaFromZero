package Four.four.classWork;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Product {

    private final String number;
    private String name;
    private int price;

    public Product(String number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(number, product.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
