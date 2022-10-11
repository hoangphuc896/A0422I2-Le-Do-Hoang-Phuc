package module2.models;

public class SanPhamNhapKhau extends TongThe{
    private int giaNhapKhau ;
    private String tinhThanhPho ;
    private String ThueNhapKhau ;

    public SanPhamNhapKhau(){

    }

    public SanPhamNhapKhau(int idSanPham, int maSanpham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, int giaNhapKhau, String tinhThanhPho, String thueNhapKhau) {
        super(idSanPham, maSanpham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhPho = tinhThanhPho;
        ThueNhapKhau = thueNhapKhau;
    }

    public int getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(int giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhPho() {
        return tinhThanhPho;
    }

    public void setTinhThanhPho(String tinhThanhPho) {
        this.tinhThanhPho = tinhThanhPho;
    }

    public String getThueNhapKhau() {
        return ThueNhapKhau;
    }

    public void setThueNhapKhau(String thueNhapKhau) {
        ThueNhapKhau = thueNhapKhau;
    }

    @Override
    public String toString() {
        return "SanPhamNhapKhau{" +super.toString()+
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhThanhPho='" + tinhThanhPho + '\'' +
                ", ThueNhapKhau='" + ThueNhapKhau + '\'' +
                "} " ;
    }
}
