package interface_segregation_principle.with;

// Applying Interface Segregation Principle
public class Video implements IVideoActions, IAdsActions {

    @Override
    public void playRandomAd() {

    }

    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }
}
