package open_closed_principle;

import lombok.Data;

@Data
public class Video {

    private String title;
    private Long time;
    private Integer likes;
    private Integer views;
    private VideoCategory videoCategory;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }
}
