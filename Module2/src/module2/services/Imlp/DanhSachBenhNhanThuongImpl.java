package module2.services.Imlp;


import module2.model.DanhSachBenhNhan;
import module2.services.DanhSachBenhNhanThuong;
import module2.ultils.ReadAndWrite;
import module2.ultils.SuaLoiDanhSachBenhNhan;

import ss19stringandregex.schoolclass.ultils.RegexPerson;

import java.util.*;

public class DanhSachBenhNhanThuongImpl implements DanhSachBenhNhanThuong {
    private Scanner scanner =new Scanner(System.in);
    private List<DanhSachBenhNhan> danhSachBenhNhans = new ArrayList<>();
    private static final String FILE_PATH="D:\\Codegym\\Module2\\src\\module2\\data\\DanhSachBenhNhan.csv";
    @Override
    public void addNew() {
        danhSachBenhNhans= ReadAndWrite.readAccount(FILE_PATH);
        int id = 1;
        if (!danhSachBenhNhans.isEmpty()) {
            id = danhSachBenhNhans.size();
            System.out.println("second customer :"+id);
        }
        String maBenhNhan = SuaLoiDanhSachBenhNhan.maBenhNhan();
        String ten = SuaLoiDanhSachBenhNhan.ten();
        Date ngayNhapVien= SuaLoiDanhSachBenhNhan.ngayNhapVien();
        Date ngayRaVien= SuaLoiDanhSachBenhNhan.ngayRaVien();
        String lyDo= SuaLoiDanhSachBenhNhan.lyDo();
        int phiNamVien= SuaLoiDanhSachBenhNhan.phiNamVien();
        DanhSachBenhNhan danhSachBenhNhan = new DanhSachBenhNhan(id, maBenhNhan, ten, ngayNhapVien,ngayRaVien,lyDo,phiNamVien);
        danhSachBenhNhans.add(danhSachBenhNhan);
        ReadAndWrite.writeAccount(danhSachBenhNhans, FILE_PATH);
    }

    @Override
    public void delete() {
        danhSachBenhNhans= ReadAndWrite.readAccount(FILE_PATH);
        for (DanhSachBenhNhan danhSachBenhNhan : danhSachBenhNhans){
            System.out.println(danhSachBenhNhan.toString());
        }
        String coding = SuaLoiDanhSachBenhNhan.maBenhNhan();
        DanhSachBenhNhan account1 = null;
        for (DanhSachBenhNhan account : danhSachBenhNhans) {
            if (Objects.equals(account.getMaBenhNhan(), coding)) {
                account1 = account;
                break;
            }
        }
        if (account1 != null) {
            danhSachBenhNhans.remove(account1);
            System.out.println("Delete Account");
            for (DanhSachBenhNhan account : danhSachBenhNhans) {
                System.out.println(account.toString());
            }
        } else {
            System.out.printf("Coding = %s not existed.\n", coding);
        }
        ReadAndWrite.writeAccount(danhSachBenhNhans,FILE_PATH);
    }

    @Override
    public void display() {
        danhSachBenhNhans= ReadAndWrite.readAccount(FILE_PATH);
        for (DanhSachBenhNhan account :danhSachBenhNhans){
            System.out.println(account.toString());
        }
    }

    @Override
    public void search() {
        danhSachBenhNhans= ReadAndWrite.readAccount(FILE_PATH);
        for (DanhSachBenhNhan account : danhSachBenhNhans){
            System.out.println(account.toString());
        }
        String name = RegexPerson.inputName();
        DanhSachBenhNhan account1 = null;
        for (DanhSachBenhNhan account : danhSachBenhNhans) {
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
