package Three.threeOne.homeWork.threeTwo.entity.types.genres;

import Three.threeOne.homeWork.threeTwo.entity.types.GenreByNumberOfPages;
import Three.threeOne.homeWork.threeTwo.enums.GenreEnum;

public class StoryGenre extends GenreByNumberOfPages {

    @Override
    public String getGenreName() {
        return GenreEnum.STORY.name();
    }
}
