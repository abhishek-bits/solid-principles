package interface_segregation_principle.without;

public class Video implements IVideoActions {

    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }

    @Override
    public void playRandomAd() {

    }
}
