package Three.one.homeWork.one.netologyMethod;


import Three.one.homeWork.one.entity.Book;
import Three.one.homeWork.one.enums.Status;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The Lord of the Rings");

        BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
        BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
        BookMover fromArchivedStatusMover = new FromArchivedStatusMover();
        BookMover fromOverduedStatusMover = new FromOverduedStatusMover();

        //can do
        fromAvailableStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
        fromBorrowedStatusMover.moveToStatus(book,Status.OVERDUED);
        System.out.println(book.getStatus());
        fromOverduedStatusMover.moveToStatus(book,Status.ARCHIVED);
        System.out.println(book.getStatus());
        fromArchivedStatusMover.moveToStatus(book,Status.AVAILABLE);
        System.out.println(book.getStatus());
        //can't do
        fromAvailableStatusMover.moveToStatus(book,Status.OVERDUED);
        System.out.println(book.getStatus());



    }
}
