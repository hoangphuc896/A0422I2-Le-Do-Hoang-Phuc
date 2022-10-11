package module2.services;

import module2.models.DocVaGhi;
import module2.models.SanPhamNhapKhau;
import module2.models.SanPhamXuatKhau;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class SanPhamXuatKhauMoi implements TongTheHeThong {
    public List<SanPhamXuatKhau> sanPhamXuatKhaus = new ArrayList<>();
    public Scanner scanner = new Scanner(System.in);

    @Override
    public void themMoi() throws IOException {
        System.out.println("Nhập Id San Phẩm");
        int idSanPham;
        try {
            idSanPham = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập Id San Phẩm");
            idSanPham = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập Mã San Phẩm");
        int maSanPham;
        try {
            maSanPham = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập Mã San Phẩm");
            maSanPham = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập Tên San Phẩm");
        String TenSanPham = scanner.nextLine();
        System.out.println("Nhập Giá San Phẩm");
        double giaBan;
        try {
            giaBan = Double.parseDouble(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập Giá San Phẩm");
            giaBan = Double.parseDouble(scanner.nextLine());
        }
        System.out.println("Nhập Số Lượng San Phẩm");
        int soLuong;
        try {
            soLuong = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập Số Lượng San Phẩm");
            soLuong = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập Ngày nhà Sản Xuất San Phẩm");
        String nhaSanXuat = scanner.nextLine();
        int giaXuatKhau;
        System.out.println("Nhập Giá Nhập Khẩu San Phẩm");
        try {
            giaXuatKhau = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập Giá Nhập Khẩu San Phẩm");
            giaXuatKhau = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập Tỉnh Thành Phố Nhập San Phẩm");
        String tinhThanhPho = scanner.nextLine();
        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(idSanPham, maSanPham, TenSanPham, giaBan, soLuong, nhaSanXuat, giaXuatKhau, tinhThanhPho);
        sanPhamXuatKhaus.add(sanPhamXuatKhau);
        DocVaGhi.ghi(sanPhamXuatKhaus , "D:\\Codegym\\Module_2\\src\\module2\\data\\SanPhamXuatKhau");

    }

    @Override
    public void xoa(int id) {

        SanPhamXuatKhau sanPhamXuatKhau = null;
        int size = sanPhamXuatKhaus.size();
        for (int i = 0; i < size; i++) {
            if (sanPhamXuatKhaus.get(i).getMaSanpham() == id) {
                sanPhamXuatKhau = sanPhamXuatKhaus.get(i);
                break;
            }
        }
        if (sanPhamXuatKhau != null) {
            sanPhamXuatKhaus.remove(sanPhamXuatKhau);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    @Override
    public void xemDanhSach() {
        sanPhamXuatKhaus = (List<SanPhamXuatKhau>) DocVaGhi.doc("D:\\Codegym\\Module_2\\src\\module2\\data\\SanPhamXuatKhau");
        for (SanPhamXuatKhau sanPhamXuatKhau : sanPhamXuatKhaus) {
            System.out.println(sanPhamXuatKhau.toString());
        }
    }

    @Override
    public void timKiem() {
        System.out.println("nhập Mã Sản Phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        int size = sanPhamXuatKhaus.size();
        for (int i = 0; i < size; i++) {
            if (sanPhamXuatKhaus.get(i).getGiaXuatKhau() == id) {
                isExisted = true;
                System.out.println(sanPhamXuatKhaus.toString());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            System.out.println(sanPhamXuatKhaus);
        }
    }
}

