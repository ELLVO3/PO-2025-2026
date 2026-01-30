package zadane_drugie.cloneable_z_tablica;

import java.util.Arrays;

public class Student implements Cloneable{
    private String name;
    private int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        if(grades.length != 5){
            throw new IllegalArgumentException("Tablica musi mieć dokładnie pięć ocen!");
        }
        this.grades = grades;
    }

    public void setGrade(int idx, int newGrade){
        if(idx >= 0 && idx < grades.length){
            this.grades[idx] = newGrade;
        }
        else System.out.println("Błędny indeks tablicy.");
    }

    @Override
    public Student clone() throws CloneNotSupportedException{
        Student clonedStudent = (Student) super.clone();

        clonedStudent.grades = this.grades.clone();
        return clonedStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }
}
