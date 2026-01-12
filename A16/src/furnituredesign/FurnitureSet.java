package furnituredesign;

public class FurnitureSet implements Cloneable{
    private String name;
    private double numberOfItems;

    public FurnitureSet(String name, double numberOfItems) {
        if(name == null){
            name = "";
        }

        if(numberOfItems <= 0){
            numberOfItems = 5.0;
        }

        this.name = name;
        this.numberOfItems = numberOfItems;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(double numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    @Override
    public String toString() {
        return "FurnitureSet{" +
                "name='" + name + '\'' +
                ", numberOfItems=" + numberOfItems +
                '}';
    }

    @Override
    protected FurnitureSet clone() throws CloneNotSupportedException {
        return (FurnitureSet) super.clone();
    }
}
