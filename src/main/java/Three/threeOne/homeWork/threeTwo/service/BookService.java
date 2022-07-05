package Three.threeOne.homeWork.threeTwo.service;

import Three.threeOne.homeWork.threeTwo.entity.Book;
import Three.threeOne.homeWork.threeTwo.entity.Genre;

public class BookService {

    public void filterBookByGenre(Book[] bookList, Genre genre) {
        for (Book book : bookList) {
            for (Genre genreFromBook : book.getGenres()) {
                if (genreFromBook.getAttributeOfGenre().equals(genre.getAttributeOfGenre())) {
                    if (genreFromBook.equals(genre)) {
                        System.out.println("Книга - " + book.getTitle() + " подходит под данный фильтр: жанр - " + genre.getGenreName());
                        break;
                    } else {
                        System.out.println("Книга - " + book.getTitle() + " не прошла фильтр: жанр - " + genre.getGenreName() + ", критерий- " +
                                genre.getAttributeOfGenre() + ", так как имеет жанр " +
                                genreFromBook.getGenreName());
                    }
                }
            }
        }
    }
}
