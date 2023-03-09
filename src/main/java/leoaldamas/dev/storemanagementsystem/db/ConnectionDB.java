package leoaldamas.dev.storemanagementsystem.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private final String URL = "jdbc:mysql://localhost:3306/store_management_system";
    private final String USER = "LeoAldamas";
    private final String PASSWORD = "admin";
    private Connection connection = null;


    public Connection getConnection() {
        try {
            // MySQL Driver.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the given database URL.
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException("Connection to the database failed");
        }
        return connection;
    }

    public void close() {
        // Check if the connection is different from null.
        if (connection != null) {
            try {
                // Close the connection.
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
