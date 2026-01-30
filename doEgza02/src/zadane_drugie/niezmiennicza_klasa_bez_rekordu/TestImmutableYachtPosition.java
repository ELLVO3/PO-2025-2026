package zadane_drugie.niezmiennicza_klasa_bez_rekordu;

public class TestImmutableYachtPosition {
    static void main(String[] args) {
        ImmutableYachtPosition p1 = new ImmutableYachtPosition(10.0, 20.2, 3.1);
        System.out.println("Pozycja startowa: " + p1);

        ImmutableYachtPosition newp1 = new ImmutableYachtPosition(1,2,3);
        System.out.println("Przesunięcie: " + newp1);
        System.out.println("Pozycja startowa: " + p1);
    }
}
