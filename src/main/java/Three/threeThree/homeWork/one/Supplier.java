package Three.threeThree.homeWork.one;

public class Supplier extends User implements iSupplier, iReader {

    public Supplier(String name) {
        super(name);
    }

    @Override
    public void bringBook () {
        System.out.println("Supplier bring books to the library");
    }

    @Override
    public void takeBook (Administrator administrator) {
        System.out.println("The supplier took the book from the administrator " + administrator.getName());
    }

    @Override
    public void returnBook (Administrator administrator) {
        System.out.println("The supplier returned the book to the administrator " + administrator.getName());
    }

    @Override
    public void orderBook (Librarian librarian) {
        System.out.println("Supplier " + getName()  + " delivered the book" + " \"Book\"" + " to librarian " + librarian.getName());
    }
}
