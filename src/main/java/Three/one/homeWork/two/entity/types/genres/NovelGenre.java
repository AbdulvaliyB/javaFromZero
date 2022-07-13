package Three.one.homeWork.two.entity.types.genres;

import Three.one.homeWork.two.entity.types.GenreByNumberOfPages;
import Three.one.homeWork.two.enums.GenreEnum;

public class NovelGenre extends GenreByNumberOfPages {

    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }
}
