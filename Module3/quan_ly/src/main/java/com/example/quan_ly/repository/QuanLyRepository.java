package com.example.quan_ly.repository;

import com.example.quan_ly.model.Danhsach;
import com.example.quan_ly.model.Iphone;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuanLyRepository implements IQuanLyRepository {
    public static final String ADD_NEW_DANH_SACH = "INSERT INTO danh_sach" + "(nameIphones,phone_number,note,id_thanh_toan) values(?,?,?,?)";
    public static final String UPDATE_DANH_SACH = "UPDATE danh_sach SET nameIphones = ? , phone_number = ? , note = ? WHERE id = ? and id_thanh_toan=?";
    public static final String  FIND_ALL_DANH_SACH = "SELECT * FROM danh_sach ";
    public static final String FIND_ADD_IPHONE = "SELECT * FROM iphone";
    public static final String DELETE_BY_ID = "DELETE FROM danh_sach WHERE id=?";
    public static final String FiND_BY_ID = "SELECT * FROM danh_sach WHERE id=? and id_thanh_toan=?";
    public static final String SEARCH_BY_NAME = "SELECT*FROM danh_sach WHERE nameIphones like ?";
    public static final String FIND_IPHONE = "SELECT * FROM iphone WHERE id=?";

    @Override
    public List<Danhsach> findAllDanhsach() {
        List<Danhsach> danhsaches = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_ALL_DANH_SACH)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nameIphones = rs.getString("nameIphones");
                String phoneNumber = rs.getString("phone_number");
                String note = rs.getString("note");
                int id_thanh_toan = rs.getInt("id_thanh_toan");
                danhsaches.add(new Danhsach(id, nameIphones, phoneNumber, note, id_thanh_toan));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return danhsaches;
    }

    @Override
    public List<Iphone> findAllIphone() {
        List<Iphone> iphones = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_ADD_IPHONE)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt(1);
                String nameIphone = rs.getString("nameIphone");
                iphones.add(new Iphone(id, nameIphone));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return iphones;
    }

    @Override
    public void addNew(Danhsach danhsach) {
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(ADD_NEW_DANH_SACH)) {
            statement.setString(1, danhsach.getNameIphones());
            statement.setString(2, danhsach.getPhone_number());
            statement.setString(3, danhsach.getNote());
            statement.setInt(4, danhsach.getId_thanh_toan());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Danhsach danhsach) {
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(UPDATE_DANH_SACH)) {
            statement.setString(1, danhsach.getNameIphones());
            statement.setString(2, danhsach.getPhone_number());
            statement.setString(3, danhsach.getNote());
            statement.setInt(5, danhsach.getId());
            statement.setInt(4, danhsach.getId_thanh_toan());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteById(int id) {
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(DELETE_BY_ID)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Danhsach findById(int id, int id_thanh_toan) {
        Danhsach danhsach = null;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FiND_BY_ID)) {
            statement.setInt(1, id);
            statement.setInt(2, id_thanh_toan);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nameIphones = rs.getString("nameIphones");
                String phonenumber = rs.getString("phone_number");
                String note = rs.getString("note");
                danhsach = new Danhsach(id, nameIphones, phonenumber, note, id_thanh_toan);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return danhsach;
    }

    @Override
    public List<Danhsach> searchName(String name) {
        List<Danhsach> danhsaches = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(SEARCH_BY_NAME)) {
            statement.setString(1, "%" + name + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int id =rs.getInt("id");
                name =rs.getString("nameIphones");
                String phonenumber = rs.getString("phone_number");
                String note = rs.getString("note");
                int id_thanh_toan = rs.getInt("id_thanh_toan");
                danhsaches.add(new Danhsach(id,name, phonenumber, note, id_thanh_toan));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return danhsaches;
    }

    @Override
    public Iphone findIphone(int id) {
        Iphone iphone = null;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_IPHONE)) {
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String nameIphone = rs.getString("nameIphone");
                iphone = new Iphone(id, nameIphone);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return iphone;
    }
}
