package Three.two.ClassWork.entity;

public class Square extends Figure {

    private float length;

    public Square(String color, float length) {
        super(color);
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return Math.pow(length,2);
    }

    @Override
    public double getPerimeter() {
        return length*4;
    }
}
