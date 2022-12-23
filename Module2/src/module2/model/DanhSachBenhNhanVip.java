package module2.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DanhSachBenhNhanVip extends DanhSachBenhNhanThuong {
    private String loaiVip;
    private String thoiHan;

    public DanhSachBenhNhanVip() {

    }

    public DanhSachBenhNhanVip(int id, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDo, String loaiVip, String thoiHan) {
        super(id, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo);
        this.loaiVip = loaiVip;
        this.thoiHan = thoiHan;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String getThoiHan() {
        return thoiHan;
    }

    public void setThoiHan(String thoiHan) {
        this.thoiHan = thoiHan;
    }

    @Override
    public String toString() {
        return "DanhSachBenhNhanVip{" + super.toString() +
                "loaiVip='" + loaiVip + '\'' +
                ", thoiHan='" + thoiHan + '\'' +
                "} ";
    }

    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getId(), getMaBenhNhan(), getTenBenhNhan(), dateFormat.format(getNgayNhapVien()), dateFormat.format(getNgayRaVien()), getLyDo(), getLoaiVip(), getThoiHan());
    }
}
