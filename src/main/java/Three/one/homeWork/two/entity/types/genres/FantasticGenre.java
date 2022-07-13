package Three.one.homeWork.two.entity.types.genres;

import Three.one.homeWork.two.entity.types.GenreByContent;
import Three.one.homeWork.two.enums.GenreEnum;

public class FantasticGenre extends GenreByContent {

    @Override
    public String getGenreName() {
        return GenreEnum.FANTASTIC.name();
    }
}
