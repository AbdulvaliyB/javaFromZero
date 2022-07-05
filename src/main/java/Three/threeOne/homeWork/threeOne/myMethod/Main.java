package Three.threeOne.homeWork.threeOne.myMethod;

import Three.threeOne.homeWork.threeOne.entity.Book;
import Three.threeOne.homeWork.threeOne.enums.Status;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Lord of the Rings");
        BookMover.moveToStatus(book, Status.OVERDUED);
        System.out.println(book.getStatus());
        BookMover.moveToStatus(book,Status.AVAILABLE);
        System.out.println(book.getStatus());
        BookMover.moveToStatus(book,Status.BORROWED);
        System.out.println(book.getStatus());

    }
}
