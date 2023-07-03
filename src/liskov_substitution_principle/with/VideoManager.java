package liskov_substitution_principle.with;

// Applying Liskov Substitution Principle
public class VideoManager {

    private String title;
    private Long time;
    private Integer likes;
    private Integer views;

    public double getNumberOfHours() {
        return (time / 3600.0) * views;
    }

    public void playRandomAd() {
        // play an add
    }
}
