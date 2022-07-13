package Three.one.homeWork.one.myMethod;

import Three.one.homeWork.one.entity.Book;
import Three.one.homeWork.one.enums.Status;

public class BookMover extends Book {

    public BookMover(String title) {
        super(title);
    }

    protected static void moveToStatus(Book book, Status requestedStatus) {
        switch (book.getStatus()) {
            case AVAILABLE -> {
                if(requestedStatus==Status.BORROWED||requestedStatus==Status.ARCHIVED){
                    book.setStatus(requestedStatus);
                    System.out.println("Status changed");
                } else{
                    System.out.println("Перевод книги из статуса" + book.getStatus().name() + " в статус " + requestedStatus + " невозможен");
                }
            }
            case BORROWED -> book.setStatus(requestedStatus) ;
            case ARCHIVED ->{
                if(requestedStatus==Status.AVAILABLE){
                    book.setStatus(requestedStatus);
                    System.out.println("Status changed");
                } else{
                    System.out.println("Перевод книги из статуса" + book.getStatus().name() + " в статус " + requestedStatus + " невозможен");
                }
            }
            case OVERDUED -> {
                if(requestedStatus==Status.AVAILABLE||requestedStatus==Status.ARCHIVED){
                    book.setStatus(requestedStatus);
                    System.out.println("Status changed");
                } else{
                    System.out.println("Перевод книги из статуса" + book.getStatus().name() + " в статус " + requestedStatus + " невозможен");
                }
            }
            default -> System.out.println("Nothing to see");
        }
    }
}