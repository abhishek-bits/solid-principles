package single_responsiblity_principle.with;

import lombok.AllArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Applying Single Responsibility Principle
// The sole purpose of this class is to establish
// connection to the database via the constructor parameters.
@AllArgsConstructor
public class ConnectionDAO {

    private final String dbName;    // test
    private final String dbms;      // mysql / postgres
    private final String host;      // localhost
    private final String port;      // 3306
    private final String username;
    private final String password;

    // Creates the connection and returns it
    // based on the given properties
    public Connection createConnection() throws SQLException {
        String url = "jdbc:" + dbms + "://" + host + ":" + port + "/" + dbName;
        return DriverManager.getConnection(url, username, password);
    }
}
