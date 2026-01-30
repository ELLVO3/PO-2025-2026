package zadane_drugie.cloneable_ze_zmiennym_polem_referencyjnym;

public class Stove implements Cloneable{
    private int burners;
    private String brand;
    private String serialNumber;

    public Stove(int burners, String brand, String serialNumber) {
        this.burners = burners;
        this.brand = brand;
        this.serialNumber = serialNumber;
    }

    @Override
    protected Stove clone() throws CloneNotSupportedException {
        return (Stove) super.clone();
    }

    @Override
    public String toString() {
        return "Stove{" +
                "burners=" + burners +
                ", brand='" + brand + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
