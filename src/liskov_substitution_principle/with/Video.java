package liskov_substitution_principle.with;

// Applying Liskov Substitution Principle.
// Now, the classes can cherry-pick the behaviors they need.
public class Video {

    // Moving to Composition
    private VideoManager manager;

    public double getNumberOfHoursPlayed() {
        return manager.getNumberOfHours();
    }

    public void playRandomAd() {
        manager.playRandomAd();
    }
}
