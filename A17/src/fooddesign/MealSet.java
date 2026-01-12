package fooddesign;

public class MealSet implements Cloneable{
    private String name;
    private double numberOfItems;

    public MealSet(String name, double numberOfItems) {
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
        return "MealSet{" +
                "name='" + name + '\'' +
                ", numberOfItems=" + numberOfItems +
                '}';
    }

    @Override
    protected MealSet clone() throws CloneNotSupportedException {
        return (MealSet) super.clone();
    }
}
