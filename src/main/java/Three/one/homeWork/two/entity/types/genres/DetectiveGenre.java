package Three.one.homeWork.two.entity.types.genres;

import Three.one.homeWork.two.entity.types.GenreByContent;
import Three.one.homeWork.two.enums.GenreEnum;

public class DetectiveGenre extends GenreByContent {

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }
}
