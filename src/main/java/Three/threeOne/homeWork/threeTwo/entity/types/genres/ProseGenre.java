package Three.threeOne.homeWork.threeTwo.entity.types.genres;

import Three.threeOne.homeWork.threeTwo.entity.types.GenreByForm;
import Three.threeOne.homeWork.threeTwo.enums.GenreEnum;

public class ProseGenre extends GenreByForm {

    @Override
    public String getGenreName() {
        return GenreEnum.PROSE.name();
    }
}