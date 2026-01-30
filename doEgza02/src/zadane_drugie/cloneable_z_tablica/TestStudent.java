package zadane_drugie.cloneable_z_tablica;

public class TestStudent {
    public static void main(String[] args) {
        int[] g1 = {5,5,5,5,5};

        Student s1 = new Student("Maciej", g1);

        try{
            Student clone = s1.clone();

            System.out.println("Oryginał: " + s1);
            System.out.println("Klon: " + clone);

            s1.setGrade(0, 3);

            System.out.println("Oryginał: " + s1);
            System.out.println("Klon: " + clone);

            
        }
        catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
