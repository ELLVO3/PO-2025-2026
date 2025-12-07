package zestaw7;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Cw1

        Punkt3D p1 = new Punkt3D(1.0, 2.0, 3.0);
        Punkt3D p2 = new Punkt3D(4.0, 6.0, 8.0);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        double distance1 = p1.calculateDistance(p2);

        System.out.println("Distance :" + distance1);

        p1 = new Punkt3D(10, p1.y(), p1.z());

        System.out.println("New p1: " + p1);

        double distance2 = p1.calculateDistance(p2);

        System.out.println("New distance: " + distance2);

        System.out.println(p2);

        // Cw2

        Punkt3D p4 = new Punkt3D(10, 10, 10);
        Punkt3D p5 = new Punkt3D(0, 0, 0);
        Punkt3D p6 = new Punkt3D(5, 5, 5);

        List<Punkt3D> pointsList = new ArrayList<>();

        pointsList.add(p4);
        pointsList.add(p5);
        pointsList.add(p6);

        System.out.println("Not sorted lits of points: " + pointsList);

        Collections.sort(pointsList);

        System.out.println("Sorted list of points: " + pointsList);

        // Cw3

        Punkt3D pSum1 = new Punkt3D(1, 2, 3);
        Punkt3D pSum2 = new Punkt3D(3, 2, 1);
        Punkt3D pSum3 = new Punkt3D(0, 0, 0);

        System.out.println("Sum of pSum1 equals pSum2? " + pSum1.equals(pSum2));
        System.out.println("Sum of pSum1 equals pSum3? " + pSum1.equals(pSum3));

        System.out.println("Hashcode of pSum1: " + pSum1.hashCode());
        System.out.println("Hashcode of pSum2: " + pSum2.hashCode());
        System.out.println("Hashcode of pSum3 (different): " + pSum3.hashCode());

        // Cw4

        Punkt3D p7 = new Punkt3D(1, 2, 3);
        Punkt3D p8 = new Punkt3D(5, 10, 15);

        Wektor3D p7Plusp8 = new Wektor3D(p7, p8);

        System.out.println("Point 7: " + p7);
        System.out.println("Point 8: " + p8);

        System.out.println("Vector made out of p7 and p8: " + p7Plusp8);

        Wektor3D myVector = new Wektor3D(5, 6, 3);

        System.out.println("My Vector: " + myVector);
        System.out.println("Magnitude of myVector: " + myVector.calculateMagnitude());

        // Cw5

        Wektor3D v1 = new Wektor3D(100, 100, 100);
        Wektor3D v2 = new Wektor3D(0, 0, 0);
        Wektor3D v3 = new Wektor3D(50, 50, 50);

        List<Wektor3D> vectorsList = new ArrayList<>();

        vectorsList.add(v1);
        vectorsList.add(v2);
        vectorsList.add(v3);

        System.out.println("Not sorted list of points: " + vectorsList);

        Collections.sort(vectorsList);

        System.out.println("Sorted list of points: " + vectorsList);

        System.out.println("Length of v1: " + vectorsList.getFirst().calculateMagnitude());
        System.out.println("Length of v2: " + vectorsList.get(1).calculateMagnitude());
        System.out.println("Length of v3: " + vectorsList.getLast().calculateMagnitude());

        // Cw6

        Wektor3D vX = new Wektor3D(1, 0 , 0);
        Wektor3D vY = new Wektor3D(0, 1 , 0);
        Wektor3D vZ = new Wektor3D(1, 0 , 1);

        System.out.println("Vector X axis: " + vX);
        System.out.println("Vector Y axis: " + vY);
        System.out.println("Vector Z axis: " + vZ);

        System.out.println("Is vX perpendicular to vY? " + vX.equals(vY));
        System.out.println("Is vX perpendicular to vZ? " + vX.equals(vZ));

        // Cw7

        Ksiazka b1 = new Ksiazka("Wiedźmin: Krew Elfów", "Andrzej Sapkowski", LocalDate.of(1994, 12, 1), 823);
        Ksiazka b2 = new Ksiazka("Wiedźmin: Pani Jeziora", "Andrzej Sapkowski", LocalDate.of(1999, 10, 17), 827);
        Ksiazka b3 = new Ksiazka("Hobbit", "Tolkien", LocalDate.of(1937, 9, 21), 6700);
        Ksiazka b4 = new Ksiazka("Hobbit", "Unknown", LocalDate.of(1937, 9, 21), 6700);

        System.out.println("b3 equals b4? " + b3.equals(b4));
        System.out.println("b1 equals b2? " + b1.equals(b2));

        ArrayList<Ksiazka> library = new ArrayList<>();

        library.add(b1);
        library.add(b2);
        library.add(b3);
        library.add(b4);

        System.out.println("\nBooks before sorting: ");
        for(Ksiazka b : library){
            System.out.println(b);
        }

        Collections.sort(library);

        System.out.println("\nBooks after sorting: ");
        for(Ksiazka b : library){
            System.out.println(b);
        }

        // Cw8

        Ksiazka b5 = new Ksiazka("Wiedźmin: Krew Elfów", "Andrzej Sapkowski", LocalDate.of(1994, 12, 1), 823);
        Ksiazka b6 = new Ksiazka("Wiedźmin: Pani Jeziora", "Andrzej Sapkowski", LocalDate.of(1999, 10, 17), 827);
        Ksiazka b7 = new Ksiazka("Okularnik", "Katarzyna Bonda", LocalDate.of(2015, 1,1), 9238);

        ArrayList<Ksiazka> booksForLibrary1 = new ArrayList<>();
        booksForLibrary1.add(b5);
        Biblioteka library1 = new Biblioteka(new Punkt3D(0, 0, 3), booksForLibrary1);

        ArrayList<Ksiazka> booksForLibrary2 = new ArrayList<>();
        booksForLibrary2.add(b5);
        booksForLibrary2.add(b6);
        booksForLibrary2.add(b7);
        Biblioteka library2 = new Biblioteka(new Punkt3D(0, 0, 150), booksForLibrary2);

        ArrayList<Biblioteka> listOfLibraries = new ArrayList<>();

        listOfLibraries.add(library1);
        listOfLibraries.add(library2);

        System.out.println("List of libraries before sorting: ");
        for(Biblioteka l : listOfLibraries){
            System.out.println(l);
        }

        Collections.sort(listOfLibraries);

        System.out.println("List of libraries after sorting: ");
        for(Biblioteka l : listOfLibraries){
            System.out.println(l);
        }
    }
}