public class Song {
    private String artist;
    private String title;
    private String lyrics;
    private double duration;

    public Song(String artist, String title, double duration) {
        this.artist = artist;
        this.title = title;
        this.duration = duration;
    }

    public void createLyrics (String verse) {
        lyrics = verse;
    }

    public String sing() {
        return "Roll down car windows... turn up radio volume...\n" +
                "as loud as you can begin singing... " + lyrics;
    }

    //if the duration is less than or equal to 3.05
    //AND
    //lyrics String has 13 or more characters in it
    //this song can win and award
    //otherwise it cannot
    public boolean canWinAward () {
        return duration <= 3.05 && lyrics.length() >= 13;
    }

    @Override
    public String toString() {
        return "Song: " + title +
                " by " + artist +
                " has a duration of " + duration;
    }
}
