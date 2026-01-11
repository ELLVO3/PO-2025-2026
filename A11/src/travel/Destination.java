package travel;

public class Destination {
    private String name;
    private String country;
    private int distance;

    public Destination(String name, String country, int distance) {
        this.name = name;
        this.country = country;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", distance=" + distance +
                '}';
    }
}
