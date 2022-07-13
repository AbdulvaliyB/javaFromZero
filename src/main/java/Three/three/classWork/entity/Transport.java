package Three.three.classWork.entity;

public abstract class Transport implements Mover {
    private int fuel;

    public Transport(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public abstract void move(String name, String from, String to);

}
