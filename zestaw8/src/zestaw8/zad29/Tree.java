package zestaw8.zad29;

public class Tree extends Plant implements Comparable<Tree>{
    private int height;

    public Tree(String name, int height) {
        super(name);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int compareTo(Tree other){
        return Integer.compare(this.height, other.height);
    }
}
