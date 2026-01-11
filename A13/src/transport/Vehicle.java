package transport;

public class Vehicle {
    private String model;
    private String type;
    private int range;

    public Vehicle(String model, String type, int range) {
        this.model = model;
        this.type = type;
        this.range = range;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", type='" + type + '\'' +
                ", range=" + range +
                '}';
    }
}
