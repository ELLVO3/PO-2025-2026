package zadanie_pierwsze.z_polem_zmiennym_typu_rekord;

import java.util.Objects;

public class TrainingSession {
    private String athleteName, sessionDate;
    private Discipline discipline;
    private int caloriesBurned;

    public TrainingSession(String athleteName, String sessionDate, Discipline discipline, int caloriesBurned) {
        this.athleteName = athleteName != null ? athleteName : "";
        this.sessionDate = sessionDate != null ? sessionDate : "";
        this.discipline = discipline;
        this.caloriesBurned = caloriesBurned < 0 ? 0 : caloriesBurned;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String athleteName) {
        this.athleteName = athleteName != null ? athleteName : "";
    }

    public String getSessionDate() {
        return sessionDate;
    }

    public void setSessionDate(String sessionDate) {
        this.sessionDate = sessionDate != null ? sessionDate : "";
    }

    public Discipline getDiscipline() {
        return discipline;
    }

    public void setDiscipline(Discipline discipline) {
        this.discipline = discipline;
    }

    public int getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned < 0 ? 0 : caloriesBurned;
    }

    @Override
    public String toString() {
        return "TrainingSession{" +
                "athleteName='" + athleteName + '\'' +
                ", sessionDate='" + sessionDate + '\'' +
                ", discipline=" + discipline +
                ", caloriesBurned=" + caloriesBurned +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        TrainingSession that = (TrainingSession) o;
        return caloriesBurned == that.caloriesBurned && athleteName.equals(that.athleteName) && sessionDate.equals(that.sessionDate) && Objects.equals(discipline, that.discipline);
    }

    @Override
    public int hashCode() {
        int result = athleteName.hashCode();
        result = 31 * result + sessionDate.hashCode();
        result = 31 * result + Objects.hashCode(discipline);
        result = 31 * result + caloriesBurned;
        return result;
    }
}
