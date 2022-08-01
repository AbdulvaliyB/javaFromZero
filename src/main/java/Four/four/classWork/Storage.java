package Four.four.classWork;

import lombok.*;

import java.util.Objects;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Storage {

    private final String name;
    private String address;

    public Storage(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Storage storage = (Storage) o;
        return Objects.equals(name, storage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
