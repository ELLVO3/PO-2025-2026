package music;

import java.util.ArrayList;

public class VinylStore extends MusicStore{
    private int numberOfVinyls;

    public VinylStore(String name, String city, ArrayList<String> albums, int numberOfVinyls) {
        super(name, city, albums);
        this.numberOfVinyls = numberOfVinyls;
    }

    public int getNumberOfVinyls() {
        return numberOfVinyls;
    }

    public void setNumberOfVinyls(int numberOfVinyls) {
        this.numberOfVinyls = numberOfVinyls;
    }

    @Override
    public String toString() {
        return "VinylStore{" +
                "numberOfVinyls=" + numberOfVinyls +
                '}' + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if(o == this) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        VinylStore that = (VinylStore) o;
        return numberOfVinyls == that.numberOfVinyls;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + numberOfVinyls;
        return result;
    }
}
