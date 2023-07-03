package interface_segregation_principle.with;

// Applying Interface Segregation Principle
public class PremiumVideo implements IVideoActions {

    // Now, the PremiumVideo class will only implement
    // the method that it needs.
    @Override
    public double getNumberOfHoursPlayed() {
        return 0;
    }
}
