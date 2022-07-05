package Three.threeOne.homeWork.threeOne.netologyMethod;

import Three.threeOne.homeWork.threeOne.entity.Book;
import Three.threeOne.homeWork.threeOne.enums.Status;

public class FromArchivedStatusMover extends BookMover {

    @Override
    protected void moveToStatus(Book book, Status requestedStatus) {

        switch (requestedStatus) {
            case AVAILABLE -> {
                book.setStatus(requestedStatus);
                System.out.println("Status changed");
            }
            default -> System.out.println("Перевод книги из статуса" + book.getStatus().name() + " в статус " + requestedStatus + " невозможен");
        }

    }

}