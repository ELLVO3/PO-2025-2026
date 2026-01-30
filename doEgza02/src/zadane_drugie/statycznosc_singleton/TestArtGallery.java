package zadane_drugie.statycznosc_singleton;

public class TestArtGallery {
    static void main(String[] args) {
        ArtGallery g1 = ArtGallery.getInstance("Luwr");

        ArtGallery g2 = ArtGallery.getInstance("...");

        if(g1.equals(g2)){
            System.out.println("Singleton działa poprawnie");
        }
        else{
            System.out.println("Nope");
        }

    }
}
