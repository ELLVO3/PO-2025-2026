package zadanie_pierwsze.zadanie_z_polem_jako_arraylista;

import java.util.ArrayList;
import java.util.Objects;

public class CoffeBlend {
    private String name;
    private String origin;
    private ArrayList<String> flavorNotes;

    public CoffeBlend(String name, String origin, ArrayList<String> flavorNotes) {
        this.name = name;
        this.origin = origin;
        this.flavorNotes = new ArrayList<>(flavorNotes);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public ArrayList<String> getFlavorNotes() {
        return new ArrayList<>(flavorNotes);
    }

    public void setFlavorNotes(ArrayList<String> flavorNotes) {
        this.flavorNotes = new ArrayList<>(flavorNotes);
    }

    public void addFlavorNotes(String note){
        this.flavorNotes.add(note);
    }

    public void removeFlavorNotes(String note){
        this.flavorNotes.remove(note);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" +
                name + ", " +
                origin + ", " +
                flavorNotes +
                '.';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        CoffeBlend that = (CoffeBlend) o;
        return Objects.equals(name, that.name) && Objects.equals(origin, that.origin) && Objects.equals(flavorNotes, that.flavorNotes);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(origin);
        result = 31 * result + Objects.hashCode(flavorNotes);
        return result;
    }
}
