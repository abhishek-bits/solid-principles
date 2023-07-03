package open_closed_principle.with;

import open_closed_principle.Video;

// Applying Open-Closed Principle
public class GamingEarningsCalculator implements IEarningsCalculator {
    @Override
    public double calculateEarnings(Video video) {
        return video.getLikes() * 0.012 + video.getViews() * 0.0012;
    }
}
