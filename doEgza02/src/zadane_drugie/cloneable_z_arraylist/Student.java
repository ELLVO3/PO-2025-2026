package zadane_drugie.cloneable_z_arraylist;

import java.util.ArrayList;

public class Student implements Cloneable{
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public void setGrades(int idx, int newGrade){
        if(idx >= 0 && idx < grades.size()){
            this.grades.set(idx, newGrade);
        }
        else{
            System.out.println("Błędny index");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student clonedStudent = (Student) super.clone();
        clonedStudent.grades = new ArrayList<>(this.grades);
        return clonedStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grades=" + grades +
                '}';
    }
}
