package com.example.baithi.service;

import com.example.baithi.model.Quanly;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuanlyServiceImpl implements IQuanlyService {
    private static final String ALL_USERS = "SELECT * FROM sanpham";
    private static final String ADD_NEW_USER = "INSERT INTO sanpham" + "(name1 , gia, soluong,mau,thietbi) VALUES" + "(?,?,?,?,?)";
    private static final String FIND_BY_ID = "SELECT id ,name1 , gia, soluong,mau,thietbi FROM sanpham WHERE id = ?";
    private static final String UPDATE_USER = "UPDATE sanpham SET name1 = ?,gia= ?, soluong =?,mau=?,thietbi=? where id = ?";
    private static final String DELETE_USER = "DELETE from sanpham WHERE id = ? ";
    private static final String SEARCH_USER = "SELECT*FROM sanpham WHERE name1 like ?";

    public List<Quanly> findAll() {
        List<Quanly> quanlies = new ArrayList<>();

        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(ALL_USERS)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String name1 = rs.getString("name1");
                String gia = rs.getString("gia");
                String soluong = rs.getString("soluong");
                String mau = rs.getString("mau");
                String thietbi = rs.getString("thietbi");

                quanlies.add(new Quanly(id, name1, gia, soluong, mau, thietbi));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return quanlies;
    }

    @Override
    public Quanly findById(int id) {
        Quanly quanly = null;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_BY_ID)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name1 = rs.getString("name1");
                String gia = rs.getString("gia");
                String soluong = rs.getString("soluong");
                String mau = rs.getString("mau");
                String thietbi = rs.getString("thietbi");
                quanly = new Quanly(id, name1, gia, soluong, mau, thietbi);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return quanly;
    }

    @Override
    public void addNewUser(Quanly quanly) {
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(ADD_NEW_USER)) {
            statement.setString(1, quanly.getName1());
            statement.setString(2, quanly.getGia());
            statement.setString(3, quanly.getSoluong());
            statement.setString(4, quanly.getMau());
            statement.setString(5, quanly.getThietbi());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean updateUser(Quanly quanly) {
        boolean rowUpdate = false;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(UPDATE_USER)) {
            statement.setString(1, quanly.getName1());
            statement.setString(2, quanly.getGia());
            statement.setString(3, quanly.getSoluong());
            statement.setString(4, quanly.getMau());
            statement.setString(5, quanly.getThietbi());
            statement.setInt(6, quanly.getId());
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
    public List<Quanly> SearchUser(String name1) {
        List<Quanly> quanlies = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(SEARCH_USER)) {
            statement.setString(1, "%" + name1 + "%");

            System.out.println(statement);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                name1 = rs.getString("name1");
                String gia = rs.getString("gia");
                String soluong = rs.getString("soluong");
                String mau = rs.getString("mau");
                String thietbi = rs.getString("thietbi");
                quanlies.add(new Quanly(id, name1, gia, soluong, mau, thietbi));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return quanlies;
    }
}
