package single_responsiblity_principle.without;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.sql.*;

@Data
@AllArgsConstructor
public class Video {

    private String title;
    private Long time;
    private int likes;
    private int views;

    public double getNumberOfHoursPlayed() {
        return (time / 3600.0) * views;
    }

    // Persist method is not a responsibility of the Video class
    // If our application grows, and we need to store other objects
    // then we have to duplicate this code to every other object
    // We can tackle this by applying the Single-Responsibility principle.
    public void persist() throws SQLException {
        String db = "test";
        String url = "jdbc:mysql://localhost:3306/" + db;
        String username = "abhishek";
        String password = "root@123";
        Connection conn = DriverManager.getConnection(url, username, password);
        String sql = "INSERT INTO video(Title, Time, Likes, Views) " +
                "VALUES(?, ?, ?, ?);";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, this.title);
        stmt.setLong(2, this.time);
        stmt.setInt(3, this.likes);
        stmt.setInt(4, this.views);
        int rowsUpdated = stmt.executeUpdate();
        System.out.println(rowsUpdated + " rows updated.");
    }
}
