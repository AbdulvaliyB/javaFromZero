package Three.threeOne.homeWork.threeTwo.entity;

public class Genre {

    protected String attribute;

    public Genre(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }


    public String getAttributeOfGenre() {
        return attribute;
    }

    public String getGenreName() {
        return "Жанр не указан";
    }

}
