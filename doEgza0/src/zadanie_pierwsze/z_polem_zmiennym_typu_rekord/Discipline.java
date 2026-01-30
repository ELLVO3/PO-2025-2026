package zadanie_pierwsze.z_polem_zmiennym_typu_rekord;

public record Discipline(String name, String category, int trainingFrequency, int matchDuration) {
    public Discipline {
        if(name == null) name = "";
        if(category == null) category = "";
        if(trainingFrequency < 0) trainingFrequency = 0;
        if(matchDuration < 0) matchDuration = 0;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", trainingFrequency=" + trainingFrequency +
                ", matchDuration=" + matchDuration +
                '}';
    }
}
