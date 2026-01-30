package zadanie_pierwsze.zadanie_z_polem_jako_tablica;

public class TestGames {
    public static void main(String[] args) {
        double[] r1 = {9.0, 8.0, 5.4};
        double[] r2 = {9.0, 8.0, 7.8};
        ComputerGame cg1 = new ComputerGame("Geometry Dash", "RobTopGames", r1);
        ComputerGame cg2 = new ComputerGame("Minecraft", "Notch", r2);

        System.out.println(cg1);
        System.out.println(cg2);

        cg1.addRatings(10.0);
        cg2.addRatings(10.0);

        System.out.println(cg1);
        System.out.println(cg2);

        cg1.removeRating(10.0);
        cg2.removeRating(10.0);

        System.out.println(cg1);
        System.out.println(cg2);

        System.out.println(cg1.equals(cg2));
        System.out.println(cg1.hashCode());
        System.out.println(cg2.hashCode());

    }
}
