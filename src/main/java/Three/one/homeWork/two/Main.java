package Three.one.homeWork.two;

import Three.one.homeWork.two.entity.Book;
import Three.one.homeWork.two.entity.Genre;
import Three.one.homeWork.two.entity.types.genres.*;
import Three.one.homeWork.two.service.BookService;

public class Main {

    public static void main(String[] args) {


        Book book1 = new Book("Властелин колец", new Genre[] {new StoryGenre(), new ProseGenre(), new FantasticGenre()});

        Book book2 = new Book("Шерлок Холмс", new Genre[] {new NovelGenre(), new DetectiveGenre()});

        BookService bookService = new BookService();

        bookService.filterBookByGenre(new Book[]{book1, book2}, new StoryGenre());
        bookService.filterBookByGenre(new Book[]{book1, book2}, new DetectiveGenre());
        bookService.filterBookByGenre(new Book[]{book1, book2}, new NarrativeGenre());
        bookService.filterBookByGenre(new Book[]{book1, book2}, new VerseGenre());
    }
}
