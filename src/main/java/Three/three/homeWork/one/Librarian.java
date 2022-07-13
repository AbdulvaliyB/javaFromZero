package Three.three.homeWork.one;

public class Librarian extends User implements iLibrarian, iAdministrator{

    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier) {
        supplier.orderBook(this);
    }

    @Override
    public void findBook() {
        System.out.println("Librarian found the book");
    }

    @Override
    public void overdueNotification(User user) {
        System.out.println("Librarian notified reader " + getName());
    }
}
