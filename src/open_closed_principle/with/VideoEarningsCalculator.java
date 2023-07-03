package open_closed_principle.with;

import open_closed_principle.Video;

// Applying Single-Responsibility Principle.
public class VideoEarningsCalculator {

    public double calculateEarnings(Video video) {
        switch (video.getVideoCategory()) {
            case EDUCATIONAL:
                return new EducationalEarningsCalculator().calculateEarnings(video);
            case GAMING:
                return new GamingEarningsCalculator().calculateEarnings(video);
            case ENTERTAINMENT:
                return new EntertainmentEarningsCalculator().calculateEarnings(video);
            default:
                throw new IllegalArgumentException();
        }
    }
}
