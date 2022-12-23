package module2.services.Imlp;

import module2.model.DanhSachBenhNhan;
import module2.services.DanhSachBenhNhanVip;
import module2.ultils.ReadAndWrite;
import module2.ultils.SuaLoiDanhSachBenhNhan;
import ss19stringandregex.schoolclass.ultils.RegexPerson;

import java.util.*;

public class DanhSachBenhNhanVipImpl implements DanhSachBenhNhanVip {
    private Scanner scanner = new Scanner(System.in);
    private List<module2.model.DanhSachBenhNhanVip> danhSachBenhNhanVips = new ArrayList<>();
    private static final String FILE_PATH="D:\\Codegym\\Module2\\src\\module2\\data\\DanhSachBenhNhanVip.csv";
    @Override
    public void addNew() {
        danhSachBenhNhanVips= ReadAndWrite.readPayAccount(FILE_PATH);
        int id = 1;
        if (!danhSachBenhNhanVips.isEmpty()) {
            id = danhSachBenhNhanVips.size();
            System.out.println("second customer :"+id);
        }
        String maBenhNhan = SuaLoiDanhSachBenhNhan.maBenhNhan();
        String ten = SuaLoiDanhSachBenhNhan.ten();
        Date ngayNhapVien= SuaLoiDanhSachBenhNhan.ngayNhapVien();
        Date ngayRaVien= SuaLoiDanhSachBenhNhan.ngayRaVien();
        String lyDo= SuaLoiDanhSachBenhNhan.lyDo();
        String loaiVip=SuaLoiDanhSachBenhNhan.loaiVip();
        String thoiHan=SuaLoiDanhSachBenhNhan.thoiHan();
        module2.model.DanhSachBenhNhanVip danhSachBenhNhanVip = new module2.model.DanhSachBenhNhanVip(id, maBenhNhan, ten, ngayNhapVien,ngayRaVien,lyDo,loaiVip,thoiHan);
        danhSachBenhNhanVips.add(danhSachBenhNhanVip);
        ReadAndWrite.writePayAccount(danhSachBenhNhanVips, FILE_PATH);
    }

    @Override
    public void delete() {
        danhSachBenhNhanVips= ReadAndWrite.readPayAccount(FILE_PATH);
        for (module2.model.DanhSachBenhNhanVip danhSachBenhNhanVip : danhSachBenhNhanVips){
            System.out.println(danhSachBenhNhanVip.toString());
        }
        String coding = SuaLoiDanhSachBenhNhan.maBenhNhan();
        module2.model.DanhSachBenhNhanVip account1 = null;
        for (module2.model.DanhSachBenhNhanVip account : danhSachBenhNhanVips) {
            if (Objects.equals(account.getMaBenhNhan(), coding)) {
                account1=account;
                break;
            }
        }
        if (account1 != null) {
            danhSachBenhNhanVips.remove(account1);
            System.out.println("Delete Account");
            for (module2.model.DanhSachBenhNhanVip account : danhSachBenhNhanVips) {
                System.out.println(account.toString());
            }
        } else {
            System.out.printf("Coding = %s not existed.\n", coding);
        }
        ReadAndWrite.writePayAccount(danhSachBenhNhanVips,FILE_PATH);
    }

    @Override
    public void display() {
        danhSachBenhNhanVips= ReadAndWrite.readPayAccount(FILE_PATH);
        for (module2.model.DanhSachBenhNhanVip account :danhSachBenhNhanVips){
            System.out.println(account.toString());
        }
    }

    @Override
    public void search() {
        danhSachBenhNhanVips= ReadAndWrite.readPayAccount(FILE_PATH);
        for (module2.model.DanhSachBenhNhanVip account : danhSachBenhNhanVips){
            System.out.println(account.toString());
        }
        String name = RegexPerson.inputName();
        module2.model.DanhSachBenhNhanVip account1 = null;
        for (module2.model.DanhSachBenhNhanVip account : danhSachBenhNhanVips) {
            if (account.getTenBenhNhan().equals(name)) {
                account1 = account;
                break;
            }
        }
        if (account1 != null) {
            System.out.println("Account you are looking for" + account1);
        } else {
            System.out.println("Not Account in list :" + name);
        }
    }
}
