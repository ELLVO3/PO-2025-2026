package zadane_drugie.cloneable_ze_zmiennym_polem_referencyjnym;

public class Kitchen implements Cloneable{
    private String name;
    private Stove stove;

    public Kitchen(String name, Stove stove) {
        this.name = name;
        this.stove = stove;
    }

    @Override
    protected Kitchen clone() throws CloneNotSupportedException {
        Kitchen cloned = (Kitchen) super.clone();

        cloned.stove = this.stove.clone();
        return cloned;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "name='" + name + '\'' +
                ", stove=" + stove +
                '}';
    }
}
