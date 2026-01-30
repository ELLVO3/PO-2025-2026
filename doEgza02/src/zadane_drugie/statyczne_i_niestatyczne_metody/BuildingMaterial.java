package zadane_drugie.statyczne_i_niestatyczne_metody;

public class BuildingMaterial {
    private String materialType;
    private String qualityGrade;
    private int quantityInStock;

    public BuildingMaterial(String materialType, String qualityGrade, int quantityInStock) {
        this.materialType = materialType;
        this.qualityGrade = qualityGrade;
        this.quantityInStock = quantityInStock;
    }

    public static boolean isSufficientQuantity(BuildingMaterial buildingMaterial){
        if(buildingMaterial == null){
            return false;
        }
        return buildingMaterial.quantityInStock > 100;
    }

    public boolean isSufficientQuantity(){
        return this.quantityInStock > 100;
    }

    @Override
    public String toString() {
        return "BuildingMaterial{" +
                "materialType='" + materialType + '\'' +
                ", qualityGrade='" + qualityGrade + '\'' +
                ", quantityInStock=" + quantityInStock +
                '}';
    }


}
