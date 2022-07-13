package Three.four.homeWork.two.entity;

import lombok.ToString;

@ToString
public abstract class Event {
    private String title;
    private Integer realiseYear;
    private Integer age;

    public Event(String title, Integer realiseYear, Integer age) {
        this.title = title;
        this.realiseYear = realiseYear;
        this.age = age;
    }

    public Event() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getRealiseYear() {
        return realiseYear;
    }

    public void setRealiseYear(Integer realiseYear) {
        this.realiseYear = realiseYear;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
