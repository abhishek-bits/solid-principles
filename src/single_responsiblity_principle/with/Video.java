package single_responsiblity_principle.with;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Video {
    private String title;
    private Long time;
    private Integer likes;
    private Integer views;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }
}
