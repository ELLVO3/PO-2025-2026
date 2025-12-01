package zestaw7;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Cw1

        Punkt3D p1 = new Punkt3D(1.0, 2.0, 3.0);
        Punkt3D p2 = new Punkt3D(4.0, 6.0, 8.0);

        System.out.println("Punkt 1: " + p1);
        System.out.println("Punkt 2: " + p2);

        double odleglosc1 = p1.dlugoscDo(p2);

        System.out.println(odleglosc1);

        p1 = new Punkt3D(10, p1.y(), p1.z());

        System.out.println("Nowy p1: " + p1);

        double odleglosc2 = p1.dlugoscDo(p2);

        System.out.println(odleglosc2);

        System.out.println(p2);

        // Cw2

        Punkt3D pA = new Punkt3D(5, 0, 0);
        Punkt3D pB = new Punkt3D(6, 5, 4);
        Punkt3D pC = new Punkt3D(-1, 0, 1);
        Punkt3D pD = new Punkt3D(1, 1, 1);

        List<Punkt3D> punkty = new ArrayList<>(List.of(pA, pB, pC, pD));

        System.out.println("");

        System.out.println("Lista przed sortowaniem:");
        for(Punkt3D p : punkty){
            System.out.println(" -> " + p + " (Odległość od (0,0,0): " + p.odlegloscOdPoczatku() + ")");
        }

        Collections.sort(punkty);

        System.out.println("");

        System.out.println("Lista po sortowaniu:");
        for(Punkt3D p : punkty){
            System.out.println(" -> " + p + " (Odległość od (0,0,0): " + p.odlegloscOdPoczatku() + ")");
        }



    }
}