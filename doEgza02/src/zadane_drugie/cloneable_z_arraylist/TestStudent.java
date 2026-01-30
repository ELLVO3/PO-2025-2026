package zadane_drugie.cloneable_z_arraylist;

import java.util.ArrayList;

public class TestStudent {
    static void main(String[] args) {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(3);
        grades.add(5);
        grades.add(4);
        Student s1 = new Student("Maciej", grades);
        try {
            Student s2 = (Student) s1.clone();
            System.out.println("Oryginał: " + s1);
            System.out.println("Klon: " + s2);

            s1.setGrades(0, 5);

            System.out.println("Oryginał: " + s1);
            System.out.println("Klon: " + s2);

        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
