package com.example.ss12jdbc.repository;

import com.example.ss12jdbc.model.Users;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UseRepositoryImpl implements IUseRepository {
    private static final String ALL_USERS = "SELECT * FROM users";
    private static final String ADD_NEW_USER = "INSERT INTO users" + "(name,email,country) VALUES" + "(?,?,?)";
    private static final String FIND_BY_ID = "SELECT id ,name , email, country FROM users WHERE id = ?";
    private static final String UPDATE_USER = "UPDATE users SET name = ?,email= ?, country =? where id = ?";
    private static final String DELETE_USER = "DELETE from users WHERE id = ? ";
    private static final String SEARCH_USER = "SELECT*FROM users WHERE country LIKE ?";
    private static final String SORT_USER_OR_BY_NAME = "SELECT*FROM users ORDER BY name = ?";

    @Override
    public List<Users> findAll() {
        List<Users> usersList = new ArrayList<>();

        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(ALL_USERS)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");

                usersList.add(new Users(id, name, email, country));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usersList;
    }

    @Override
    public Users findById(int id) {
        Users users = null;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_BY_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users = new Users(id, name, email, country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return users;
    }

    @Override
    public void addNewUser(Users users) {

        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(ADD_NEW_USER)) {
            statement.setString(1, users.getName());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getCountry());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public boolean updateUser(Users users) {
        boolean rowUpdate = false;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(UPDATE_USER)) {
            statement.setString(1, users.getName());
            statement.setString(2, users.getEmail());
            statement.setString(3, users.getCountry());
            statement.setInt(4, users.getId());
            rowUpdate = statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return rowUpdate;
    }

    @Override
    public boolean deleterUser(int id) {
        boolean rowDelete = false;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(DELETE_USER)) {
            statement.setInt(1, id);
            rowDelete = statement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDelete;
    }

    @Override
    public List<Users> SearchUser(String country) {
        List<Users> usersList = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(SEARCH_USER)) {
            statement.setString(1, "%" + country + "%");
            System.out.println(statement);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                country = rs.getString("country");
                usersList.add(new Users(id, name, email, country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return usersList;
    }

    @Override
    public List<Users> sort() {
        List<Users> usersList = new ArrayList<>();

        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(SORT_USER_OR_BY_NAME)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                usersList.add(new Users(id, name, email, country));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return usersList;
    }
}
