package leoaldamas.dev.storemanagementsystem.service.impl;

import leoaldamas.dev.storemanagementsystem.db.ConnectionDB;
import leoaldamas.dev.storemanagementsystem.model.User;
import leoaldamas.dev.storemanagementsystem.service.ILogin;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ILoginImpl implements ILogin {

    private final ConnectionDB connection;

    public ILoginImpl(ConnectionDB connection) {
        this.connection = connection;
    }

    @Override
    public User validate(User u, String query) {
        User user = null;
        try (PreparedStatement statement = connection.getConnection().
                prepareStatement(query)) {

            statement.setString(1, u.getUsername());
            statement.setString(2, u.getPassword());

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    int idUser = resultSet.getInt("id_user");
                    String name = resultSet.getString("name");

                    // Create user
                    user = new User();
                    user.setIdUser(idUser);
                    user.setName(name);
                    user.setUsername(u.getUsername());
                    user.setPassword(u.getPassword());
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return user;
    }
}
