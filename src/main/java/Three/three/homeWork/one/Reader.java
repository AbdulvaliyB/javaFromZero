package Three.three.homeWork.one;

public class Reader extends User implements iReader, iAdministrator{
    public Reader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Administrator administrator) {
        System.out.println("The reader took a book from the library from the administrator " + administrator.getName());
    }

    @Override
    public void returnBook(Administrator administrator) {
        System.out.println("The reader returned the book to the administrator " + administrator.getName());
    }

    @Override
    public void findBook() {
        System.out.println("Administrator found thr book");
    }

    @Override
    public void overdueNotification(User user) {

    }
}


