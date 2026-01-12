package zad13;

public class Circle implements ColorDrawable {
    private String myColor = "red";

    @Override
    public void draw() {
        System.out.println("Drawing circle in color: " + myColor);
    }

    @Override
    public void setColor(String color) {
        this.myColor = color;
        System.out.println("Changed color to: " + color);
    }
}
