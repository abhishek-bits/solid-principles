package liskov_substitution_principle.without;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Video> videos = new ArrayList<>();
        videos.add(new Video());
        videos.add(new PremiumVideo());
        // PROBLEM:-
        // If one of the video is a Premium Video
        // then it will through an exception causing
        // our application to crash.
        for(Video video : videos) {
            video.playRandomAd();
        }
    }
}
