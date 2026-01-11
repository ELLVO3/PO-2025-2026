package tourism;

public class Hotel implements Cloneable{
    private String name;
    private double capacity;

    public Hotel(String name, double capacity) {
        if(name == null){
            name = "";
        }

        if(capacity < 0){
            capacity = 50.0;
        }

        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    public Hotel clone() throws CloneNotSupportedException{
        return (Hotel) super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}
