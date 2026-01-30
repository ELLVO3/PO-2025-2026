package zadanie_pierwsze.z_polem_zmiennym_typu_rekord;

public class TestTrainingSession {
    public static void main(String[] args) {
        Discipline d1 = new Discipline("Pływanie", "Wodne", 60, 90);
        TrainingSession t1 = new TrainingSession("Maciej", "30.01.2026", d1, 300);
        TrainingSession t2 = new TrainingSession("Maciej", "30.01.2026", d1, 300);

        System.out.println(d1);
        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1.equals(t2));

        t2.setCaloriesBurned(200);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println(t1.equals(t2));

        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }
}
