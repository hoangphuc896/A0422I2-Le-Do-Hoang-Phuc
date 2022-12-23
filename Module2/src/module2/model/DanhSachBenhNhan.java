package module2.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DanhSachBenhNhan extends DanhSachBenhNhanThuong{
    private int phiNamVien;

    public DanhSachBenhNhan() {

    }

    public DanhSachBenhNhan(int id, String maBenhNhan, String tenBenhNhan, Date ngayNhapVien, Date ngayRaVien, String lyDo, int phiNamVien) {
        super(id, maBenhNhan, tenBenhNhan, ngayNhapVien, ngayRaVien, lyDo);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    @Override
    public String toString() {
        return "DanhSachBenhNhan{" +super.toString()+
                "phiNamVien=" + phiNamVien +
                "} ";
    }
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",getId(),getMaBenhNhan(),getTenBenhNhan(),dateFormat.format(getNgayNhapVien()),dateFormat.format(getNgayRaVien()),getLyDo(),getPhiNamVien());
    }
}
