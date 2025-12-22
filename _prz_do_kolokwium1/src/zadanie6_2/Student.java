package zadanie6_2;

import java.time.Year;
import java.util.Objects;

public class Student {
    private String lastName;
    private String fieldOfStudy;
    private int yearOfEnrollment;
    private static int studentCounter = 0;

    public Student(String lastName, String fieldOfStudy, int yearOfEnrollment) {

        if(yearOfEnrollment > Year.now().getValue()){
            throw new IllegalArgumentException("Rok nie może być większy od teraźniejszego roku.");
        }

        if((lastName == null || lastName.isBlank()) || (fieldOfStudy == null || fieldOfStudy.isBlank())){
            throw new IllegalArgumentException("Nazwisko oraz kierunek studiów nie mogą być null lub być puste.");
        }

        this.lastName = lastName;
        this.fieldOfStudy = fieldOfStudy;
        this.yearOfEnrollment = yearOfEnrollment;
        studentCounter++;
    }

    public static int studentCounterCheck(){
        return studentCounter;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("last name nie może być null bądź być puste.");
        }
        this.lastName = lastName;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        if(fieldOfStudy == null || fieldOfStudy.isBlank()){
            throw new IllegalArgumentException("fieldOfStudy ne może być null lub być pusty.");
        }
        this.fieldOfStudy = fieldOfStudy;
    }

    public int getYearOfEnrollment() {
        return yearOfEnrollment;
    }

    public void setYearOfEnrollment(int yearOfEnrollment) {
        if(yearOfEnrollment > Year.now().getValue()){
            throw new IllegalArgumentException("Rok nie może być większy od teraźniejszego roku.");
        }
        this.yearOfEnrollment = yearOfEnrollment;
    }

    public static int getStudentCounter() {
        return studentCounter;
    }

    public static void setStudentCounter(int studentCounter) {
        Student.studentCounter = studentCounter;
    }

    @Override
    public String toString() {
        return "Student: " +
                "[" + lastName +
                "], Field: [" + fieldOfStudy +
                "], Started: [" + yearOfEnrollment +
                "].";
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;

        return yearOfEnrollment == student.yearOfEnrollment && Objects.equals(lastName, student.lastName) && Objects.equals(fieldOfStudy, student.fieldOfStudy);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(fieldOfStudy);
        result = 31 * result + yearOfEnrollment;
        return result;
    }
}
