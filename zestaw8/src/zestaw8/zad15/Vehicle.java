package zestaw8.zad15;

public class Vehicle implements Comparable<Vehicle>{
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String name) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int age) {
        this.speed = speed;
    }

    @Override
    public int compareTo(Vehicle other){
        return Integer.compare(this.speed, other.speed);
    }
}
