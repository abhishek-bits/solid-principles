package single_responsiblity_principle.with;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        Video video = new Video(
                "Some title here",
                System.currentTimeMillis(),
                15,
                204);
        VideoDAO videoDAO = new VideoDAO();
        videoDAO.persist(video);
    }
}
