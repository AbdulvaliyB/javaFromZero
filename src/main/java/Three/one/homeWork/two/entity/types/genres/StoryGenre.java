package Three.one.homeWork.two.entity.types.genres;

import Three.one.homeWork.two.entity.types.GenreByNumberOfPages;
import Three.one.homeWork.two.enums.GenreEnum;

public class StoryGenre extends GenreByNumberOfPages {

    @Override
    public String getGenreName() {
        return GenreEnum.STORY.name();
    }
}
