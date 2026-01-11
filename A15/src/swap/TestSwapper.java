package swap;

public class TestSwapper {
    public static void main(String[] args) {
        VideoGame[] games = {new VideoGame("Yandere Simulator", "Yandere dev", 8.3),
                new VideoGame("Until Then", "Polychroma Games", 9.8),
                new VideoGame("Geometry Dash", "RobTopGames", 9.1)};

        System.out.println("Przed zamianą: ");
        for(VideoGame v : games){
            System.out.println(v);
        }

        Swapper.swapElements(games, 0, 2);

        System.out.println("Po zamianie: ");
        for(VideoGame v : games){
            System.out.println(v);
        }
    }
}
