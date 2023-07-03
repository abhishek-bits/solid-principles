package open_closed_principle.with;

import open_closed_principle.Video;

// Applying Open-Closed Principle
public class EntertainmentEarningsCalculator implements IEarningsCalculator {
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.011 + video.getViews() * 0.0011;
    }
}
