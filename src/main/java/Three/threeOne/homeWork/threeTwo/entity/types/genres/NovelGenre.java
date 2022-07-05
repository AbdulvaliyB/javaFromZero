package Three.threeOne.homeWork.threeTwo.entity.types.genres;

import Three.threeOne.homeWork.threeTwo.entity.types.GenreByNumberOfPages;
import Three.threeOne.homeWork.threeTwo.enums.GenreEnum;

public class NovelGenre extends GenreByNumberOfPages {

    @Override
    public String getGenreName() {
        return GenreEnum.NOVEL.name();
    }
}
