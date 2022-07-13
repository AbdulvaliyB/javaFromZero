package Three.one.homeWork.one.myMethod;

import Three.one.homeWork.one.entity.Book;
import Three.one.homeWork.one.enums.Status;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Lord of the Rings");
        BookMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());
        BookMover.moveToStatus(book, Status.AVAILABLE);
        System.out.println(book.getStatus());
        BookMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());

    }
}
