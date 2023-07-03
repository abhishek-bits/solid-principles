package open_closed_principle.without;

import open_closed_principle.Video;

// Applying Single Responsibility Principle
// Here, the sole purpose of this class is to calculate
// earnings based on the category of the video.
// PROBLEM:
// The problem here is that if a new video-category will be added
// We will have to open this class and modify it to accommodate the
// earnings for the new category.
// This violates the Open-Closed Principle.
public class VideoEarningsCalculator {

    public double calculateEarnings(Video video) {
        switch (video.getVideoCategory()) {
            case EDUCATIONAL:
                return calculateEducationalEarnings(video);
            case GAMING:
                return calculateGamingEarnings(video);
            case ENTERTAINMENT:
                return calculateEntertainmentEarnings(video);
            default:
                throw new IllegalArgumentException();
        }
    }

    private double calculateEducationalEarnings(Video video) {
        return video.getLikes() * 0.013 + video.getViews() * 0.0013;
    }

    private double calculateGamingEarnings(Video video) {
        return video.getLikes() * 0.012 + video.getViews() * 0.0012;
    }

    private double calculateEntertainmentEarnings(Video video) {
        return video.getLikes() * 0.011 + video.getViews() * 0.0011;
    }
}
