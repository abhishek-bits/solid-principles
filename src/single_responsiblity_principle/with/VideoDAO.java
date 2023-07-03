package single_responsiblity_principle.with;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

// Applying Single-Responsibility Principle
public class VideoDAO {

    public void persist(Video video) throws SQLException {
        try(Connection conn = new ConnectionDAO(
                "test",
                "mysql",
                "localhost",
                "3306",
                "abhishek",
                "root@123")
                .createConnection()) {
            String sql = "INSERT INTO video(Title, Time, Likes, Views) " +
                    "VALUES(?, ?, ?, ?);";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, video.getTitle());
            stmt.setLong(2, video.getTime());
            stmt.setInt(3, video.getLikes());
            stmt.setInt(4, video.getViews());
            int rowsUpdated = stmt.executeUpdate();
            System.out.println(rowsUpdated + " rows updated.");
        }
    }
}
