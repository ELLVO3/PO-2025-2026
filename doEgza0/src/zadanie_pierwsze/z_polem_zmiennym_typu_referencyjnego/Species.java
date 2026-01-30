package zadanie_pierwsze.z_polem_zmiennym_typu_referencyjnego;

public class Species {
    private String name, habitat;
    private int wateringFrequency, sunlightRequirement;

    public Species(String name, String habitat, int wateringFrequency, int sunlightRequirement) {
        if(name == null){
            this.name = "";
        }
        else{
            this.name = name;
        }

        if(habitat == null){
            this.habitat = "";
        }
        else{
            this.habitat = habitat;
        }

        if(wateringFrequency < 0){
            this.wateringFrequency = 0;
        }
        else{
            this.wateringFrequency = wateringFrequency;
        }

        if(sunlightRequirement < 0){
            this.sunlightRequirement = 0;
        }
        else{
            this.sunlightRequirement = sunlightRequirement;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null){
            this.name = "";
        }
        else{
            this.name = name;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        if(habitat == null){
            this.habitat = "";
        }
        else{
            this.habitat = habitat;
        }
    }

    public int getWateringFrequency() {
        return wateringFrequency;
    }

    public void setWateringFrequency(int wateringFrequency) {
        if(wateringFrequency < 0){
            this.wateringFrequency = 0;
        }
        else{
            this.wateringFrequency = wateringFrequency;
        }
    }

    public int getSunlightRequirement() {
        return sunlightRequirement;
    }

    public void setSunlightRequirement(int sunlightRequirement) {
        if(sunlightRequirement < 0){
            this.sunlightRequirement = 0;
        }
        else{
            this.sunlightRequirement = sunlightRequirement;
        }
    }

    @Override
    public String toString() {
        return "Species{" +
                "name='" + name + '\'' +
                ", habitat='" + habitat + '\'' +
                ", wateringFrequency=" + wateringFrequency +
                ", sunlightRequirement=" + sunlightRequirement +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Species species = (Species) o;
        return wateringFrequency == species.wateringFrequency && sunlightRequirement == species.sunlightRequirement && name.equals(species.name) && habitat.equals(species.habitat);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + habitat.hashCode();
        result = 31 * result + wateringFrequency;
        result = 31 * result + sunlightRequirement;
        return result;
    }
}
