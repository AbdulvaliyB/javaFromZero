package Three.four.homeWork.two;

import Three.four.homeWork.two.entity.Event;
import Three.four.homeWork.two.entity.Movie;
import Three.four.homeWork.two.entity.Theatre;

public class Main {

    public static void main(String[] args) {
        System.out.println("Кино:");
        for (Event event: getMovies()) {
            validEvent(event);
        }
        System.out.println("Театр:");
        for (Event event: getTheatres()) {
            validEvent(event);
        }
        System.out.println("Все события корректны");
    }

    public static Movie[] getMovies() {
        return new Movie[]{
                new Movie("Начало", 2010, 10),
                new Movie("Середина", 2012, 12),
                new Movie("Полавина", 2014, 14),
                new Movie("Конец", 2016, 16)
        };
    }

    public static Theatre[] getTheatres() {
        return new Theatre[]{
                new Theatre("Анна Каренина", 2017, 17),
                new Theatre("Something", 2018, 18),
                new Theatre("Anything", 2019, 19),
                new Theatre("Everything", 2020,0)

        };
    }
    public static void validEvent(Event event){
        if(event.getTitle() == null||event.getRealiseYear()==0||event.getAge()==0){
          throw new RuntimeException();
        }else{
            System.out.println(event);
        }
    };
}
