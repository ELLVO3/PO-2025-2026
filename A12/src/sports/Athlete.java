package sports;

public class Athlete implements Comparable<Athlete>{
    private String name;
    private String sport;
    private int yearOfAchievement;

    public Athlete(String name, String sport, int yearOfAchievement) {
        this.name = name;
        this.sport = sport;
        this.yearOfAchievement = yearOfAchievement;
    }

    @Override
    public int compareTo(Athlete other) {
        return Integer.compare(this.yearOfAchievement, other.yearOfAchievement);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                ", yearOfAchievement=" + yearOfAchievement +
                '}';
    }
}
