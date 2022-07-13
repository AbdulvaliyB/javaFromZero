package Three.one.homeWork.one.entity;

import Three.one.homeWork.one.enums.Status;

public class Book {
    private String title;
    private Status status=Status.AVAILABLE;


    public Book(String title) {
        this.title = title;
    }

    public String getName() {
        return title;
    }

    public void setName(String title) {
        this.title = title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
