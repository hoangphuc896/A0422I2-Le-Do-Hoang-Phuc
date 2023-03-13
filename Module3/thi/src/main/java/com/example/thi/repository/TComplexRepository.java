package com.example.thi.repository;

import com.example.thi.model.ChoThue;
import com.example.thi.model.Homestay;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TComplexRepository implements ITComplexRepository {
    public static final String ADD_NEW_HOMESTAY = "INSERT INTO HOMESTAY" + "(dTich,soTang,MoTa,gia,ngayBD,ngayKT) values(?,?,?,?,?,?)";
    public static final String UPDATE_DANH_SACH = "UPDATE homestay SET dTich = ? , MoTa = ?,gia=?,ngayBD=? ,ngayKT=? WHERE maMB = ? and soTang=?";
    public static final String FIND_ALL_HOMESTAY = "SELECT * FROM HOMESTAY ";
    public static final String FIND_ADD_IPHONE = "SELECT * FROM Chothue";
    public static final String DELETE_BY_ID = "DELETE FROM homestay WHERE maMB=?";
    public static final String FiND_BY_ID = "SELECT * FROM Homestay WHERE maMB=? and soTang=?";
    public static final String SEARCH_BY_NAME = "SELECT*FROM Homestay WHERE soTang like ?";
    public static final String FIND_IPHONE = "SELECT * FROM chothue WHERE soTang=?";

    @Override
    public List<Homestay> findAllHomestay() {
        List<Homestay> homestays = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_ALL_HOMESTAY)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int maMB = rs.getInt(1);
                String dTich = rs.getString("dTich");
                int soTang = rs.getInt("soTang");
                String Mota = rs.getString("Mota");
                String gia = rs.getString("gia");
                String NgayBD = rs.getString("NgayBD");
                String NgayKT = rs.getString("NgayKT");
                homestays.add(new Homestay(maMB, dTich, soTang, Mota, gia, NgayBD, NgayKT));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return homestays;
    }

    @Override
    public List<ChoThue> findAllChothue() {
        List<ChoThue> choThues = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_ADD_IPHONE)) {
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int soTang =rs.getInt(1);
                String TrangThai =rs.getString("TrangThai");
                String Loai=rs.getString("Loai");
                choThues.add(new ChoThue(soTang,TrangThai,Loai));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return choThues;
    }


    @Override
    public void addNew(Homestay homestay) {
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(ADD_NEW_HOMESTAY)) {
            statement.setString(1, homestay.getdTich());
            statement.setInt(2,homestay.getSoTang());
            statement.setString(3, homestay.getMota());
            statement.setString(4, homestay.getGia());
            statement.setString(5, homestay.getNgayBD());
            statement.setString(6, homestay.getNgayKT());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Homestay homestay) {
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(UPDATE_DANH_SACH)) {
            statement.setString(1, homestay.getdTich());
            statement.setString(2, homestay.getMota());
            statement.setString(3, homestay.getGia());
            statement.setString(4, homestay.getNgayBD());
            statement.setString(5, homestay.getNgayKT());
            statement.setInt(6, homestay.getMaMB());
            statement.setInt(7,homestay.getSoTang());
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void deleteById(int maMB) {
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(DELETE_BY_ID)) {
            statement.setInt(1, maMB);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Homestay findById(int maMB, int soTang) {
        Homestay homestay = null;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FiND_BY_ID)) {
            statement.setInt(1, maMB);
            statement.setInt(2, soTang);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String dTich=rs.getString("dTich");
                String Mota=rs.getString("Mota");
                String gia=rs.getString("gia");
                String NgayBD=rs.getString("NgayBD");
                String NgayKT=rs.getString("NgayKT");
                homestay = new Homestay(maMB, dTich,soTang, Mota, gia,NgayBD,NgayKT);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return homestay;
    }

    @Override
    public List<Homestay> searchName(int soTang) {
        List<Homestay> homestays = new ArrayList<>();
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(SEARCH_BY_NAME)) {
            statement.setString(1, "%" + soTang + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                int maMB = rs.getInt(1);
                String dTich = rs.getString("dTich");
                soTang = rs.getInt("soTang");
                String Mota = rs.getString("Mota");
                String gia = rs.getString("gia");
                String NgayBD = rs.getString("NgayBD");
                String NgayKT = rs.getString("NgayKT");
                homestays.add(new Homestay(maMB, dTich, soTang, Mota, gia, NgayBD, NgayKT));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return homestays;
    }

    @Override
    public ChoThue findchothue(int SoTang) {
        ChoThue choThue = null;
        try (PreparedStatement statement = DBConnection.getConnection().prepareStatement(FIND_IPHONE)) {
            statement.setInt(1, SoTang);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String TrangThai = rs.getString("TrangThai");
                String Loai = rs.getString("Loai");
                choThue = new ChoThue(SoTang, TrangThai,Loai);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return choThue;
    }
}
