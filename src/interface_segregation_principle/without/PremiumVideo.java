package interface_segregation_principle.without;

public class PremiumVideo implements IVideoActions {
    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }

    // OH NO!
    // We have again fallen into the same problem
    // that we had with the Interface based solution
    @Override
    public void playRandomAd() {}
}
