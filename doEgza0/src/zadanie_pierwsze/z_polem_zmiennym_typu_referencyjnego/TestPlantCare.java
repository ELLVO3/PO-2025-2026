package zadanie_pierwsze.z_polem_zmiennym_typu_referencyjnego;

public class TestPlantCare {
    public static void main(String[] args) {
        Species s1 = new Species("Specie", "habitat", 1, 1);
        PlantCare p1 = new PlantCare("Plant Name", "30.01.2026", s1, 1);

        System.out.println(s1);
        System.out.println(p1);

        System.out.println(s1.equals(p1));
        System.out.println(s1.hashCode());
        System.out.println(p1.hashCode());
    }
}
