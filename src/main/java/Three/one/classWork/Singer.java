package Three.one.classWork;


public class Singer extends Human{

    protected int rating;

    @Override
    public void happyBirthday(){
        age++;
        System.out.println("Я пою себе о др!!!");
    }

    public void sing(String verse){
        System.out.println("Я поюююю "+ verse);
        super.happyBirthday();
    }

    public Singer(String name, int age, int rating) {
        super(name, age);
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                '}';
    }
}
