package Three.threeOne.homeWork.threeTwo.entity.types.genres;

import Three.threeOne.homeWork.threeTwo.entity.types.GenreByContent;
import Three.threeOne.homeWork.threeTwo.enums.GenreEnum;

public class DetectiveGenre extends GenreByContent {

    @Override
    public String getGenreName() {
        return GenreEnum.DETECTIVE.name();
    }
}
