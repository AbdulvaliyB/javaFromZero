package Three.two.ClassWork.entity;

public class Figure {

    String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Figure(String color) {
        this.color = color;
    }

    public double getArea(){
        throw new UnsupportedOperationException();
    }

    public double getPerimeter(){
        throw new UnsupportedOperationException();
    }


}
