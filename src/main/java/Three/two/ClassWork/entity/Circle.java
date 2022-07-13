package Three.two.ClassWork.entity;

public class Circle extends Figure {

    private float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public float getLength() {
        return radius;
    }

    public void setLength(float radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*radius;
    }
}
