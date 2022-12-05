package doanhthuquansi;

public class DoanhThuQuanSi {
    private int ngayBan;
    private double tongTienTrongNgay;
    private double vnPay;
    private double tienKet;
    private double chi;
    private double conLai;

    public DoanhThuQuanSi() {
    }

    public DoanhThuQuanSi(int ngayBan, double tongTienTrongNgay, double vnPay, double tienKet, double chi, double conLai) {
        this.ngayBan = ngayBan;
        this.tongTienTrongNgay = tongTienTrongNgay;
        this.vnPay = vnPay;
        this.tienKet = tienKet;
        this.chi = chi;
        this.conLai = conLai;
    }

    public int getNgayBan() {
        return ngayBan;
    }

    public void setNgayBan(int ngayBan) {
        this.ngayBan = ngayBan;
    }

    public double getTongTienTrongNgay() {
        return tongTienTrongNgay;
    }

    public void setTongTienTrongNgay(double tongTienTrongNgay) {
        this.tongTienTrongNgay = tongTienTrongNgay;
    }

    public double getVnPay() {
        return vnPay;
    }

    public void setVnPay(double vnPay) {
        this.vnPay = vnPay;
    }

    public double getTienKet() {
        return tienKet;
    }

    public void setTienKet(double tienKet) {
        this.tienKet = tienKet;
    }

    public double getChi() {
        return chi;
    }

    public void setChi(double chi) {
        this.chi = chi;
    }

    public double getConLai() {
        return conLai;
    }

    public void setConLai(double conLai) {
        this.conLai = conLai;
    }

    @Override
    public String toString() {
        return "DoanhThuQuanSi{" +
                "ngayBan=" + ngayBan +
                ", tongTienTrongNgay=" + tongTienTrongNgay +
                ", vnPay=" + vnPay +
                ", tienKet=" + tienKet +
                ", chi=" + chi +
                ", conLai=" + conLai +
                '}';
    }
}
