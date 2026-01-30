package zadanie_pierwsze.z_polem_zmiennym_typu_referencyjnego;

public class PlantCare {
    private String plantName, careDate;
    private Species species;
    private int waterAmount;

    public PlantCare(String plantName, String careDate, Species species, int waterAmount) {
        this.plantName = plantName != null ? plantName : "";
        this.careDate = careDate != null ? careDate : "";
        this.species = species != null ? new Species(species.getName(), species.getHabitat(), species.getWateringFrequency(), species.getSunlightRequirement()) : new Species("", "", 0, 0);
        this.waterAmount = waterAmount > 0 ? waterAmount : 0;
    }

    public String getPlantName() {
        return plantName;
    }

    public void setPlantName(String plantName) {
        this.plantName = plantName != null ? plantName : "";
    }

    public String getCareDate() {
        return careDate;
    }

    public void setCareDate(String careDate) {
        this.careDate = careDate != null ? careDate : "";
    }

    public Species getSpecies() {
        return new Species(species.getName(), species.getHabitat(), species.getWateringFrequency(), species.getSunlightRequirement());
    }

    public void setSpecies(Species species) {
        this.species = species != null ? new Species(species.getName(), species.getHabitat(), species.getWateringFrequency(), species.getSunlightRequirement()) : new Species("", "", 0, 0);
    }

    public int getWaterAmount() {
        return waterAmount;
    }

    public void setWaterAmount(int waterAmount) {
        this.waterAmount = waterAmount > 0 ? waterAmount : 0;
    }

    @Override
    public String toString() {
        return "PlantCare{" +
                "plantName='" + plantName + '\'' +
                ", careDate='" + careDate + '\'' +
                ", species=" + species +
                ", waterAmount=" + waterAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlantCare plantCare = (PlantCare) o;
        return waterAmount == plantCare.waterAmount && plantName.equals(plantCare.plantName) && careDate.equals(plantCare.careDate) && species.equals(plantCare.species);
    }

    @Override
    public int hashCode() {
        int result = plantName.hashCode();
        result = 31 * result + careDate.hashCode();
        result = 31 * result + species.hashCode();
        result = 31 * result + waterAmount;
        return result;
    }
}
