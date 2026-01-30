package zadane_drugie.statyczne_i_niestatyczne_metody;

public class TestBuildingMaterial {
    static void main(String[] args) {
        BuildingMaterial cement = new BuildingMaterial("Cement", "Wysoka", 150);
        BuildingMaterial piasek = new BuildingMaterial("Piasek", "Słaba", 50);

        System.out.println(cement.isSufficientQuantity());
        System.out.println(piasek.isSufficientQuantity());

        System.out.println(


        );

        System.out.println(BuildingMaterial.isSufficientQuantity(cement));
        System.out.println(BuildingMaterial.isSufficientQuantity(piasek));
        System.out.println(BuildingMaterial.isSufficientQuantity(null));
    }
}
