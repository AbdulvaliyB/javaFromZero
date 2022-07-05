package Three.threeThree.homeWork.one;

public class Main {

    public static void main(String[] args) {
        Administrator administrator = new Administrator("admin");
        Librarian librarian = new Librarian("librarian");
        Supplier supplier = new Supplier("supplier");
        Reader reader = new Reader("reader");

        librarian.orderBook(supplier);
        supplier.bringBook();
        reader.takeBook(administrator);
        administrator.overdueNotification(reader);
        reader.returnBook(administrator);
        supplier.takeBook(administrator);
        supplier.returnBook(administrator);
        administrator.findBook();
    }
}
