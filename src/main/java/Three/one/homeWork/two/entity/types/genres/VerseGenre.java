package Three.one.homeWork.two.entity.types.genres;

import Three.one.homeWork.two.entity.types.GenreByForm;
import Three.one.homeWork.two.enums.GenreEnum;

public class VerseGenre extends GenreByForm {

    @Override
    public String getGenreName() {
        return GenreEnum.VERSE.name();
    }
}
