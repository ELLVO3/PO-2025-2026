package music;

public record MusicTrack(String title, String artist, double duration) {

    public MusicTrack{
        if(duration <= 0){
            throw new IllegalArgumentException("Długość utworu nie może być mniejszy bądź równy 0.");
        }
    }

    public boolean isLongTrack(){
        if(duration > 5.00) return true;
        return false;
    }

    public void printDetails(){
        System.out.println("Title: " + title() + "\n" + "Artist: " + artist() + "\n" + "Duration: " + duration() + "\n");
    }
}
