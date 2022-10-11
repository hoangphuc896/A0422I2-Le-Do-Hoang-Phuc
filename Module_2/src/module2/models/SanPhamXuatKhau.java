package module2.models;

public class SanPhamXuatKhau extends TongThe{
    private int giaXuatKhau ;
    private String quocGiaNhapsanPham ;

    public SanPhamXuatKhau (){

    }

    public SanPhamXuatKhau(int idSanPham, int maSanpham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, int giaXuatKhau, String quocGiaNhapsanPham) {
        super(idSanPham, maSanpham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGiaNhapsanPham = quocGiaNhapsanPham;
    }

    public int getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(int giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGiaNhapsanPham() {
        return quocGiaNhapsanPham;
    }

    public void setQuocGiaNhapsanPham(String quocGiaNhapsanPham) {
        this.quocGiaNhapsanPham = quocGiaNhapsanPham;
    }

    @Override
    public String toString() {
        return "SanPhamXuatKhau{" + super.toString()+
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGiaNhapsanPham='" + quocGiaNhapsanPham + '\'' +
                "} ";
    }
}
