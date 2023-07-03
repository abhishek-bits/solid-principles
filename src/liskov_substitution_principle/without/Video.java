package liskov_substitution_principle.without;

import lombok.Data;

@Data
public class Video {

    private String title;
    private int time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

    // will play a random ad for this video when invoked.
    public void playRandomAd() throws Exception {

    }
}
