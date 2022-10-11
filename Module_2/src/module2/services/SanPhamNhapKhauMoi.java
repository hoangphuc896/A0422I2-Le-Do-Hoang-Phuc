package module2.services;

import module2.models.DocVaGhi;
import module2.models.SanPhamNhapKhau;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamNhapKhauMoi implements TongTheHeThong {
    public List<SanPhamNhapKhau> sanPhamNhapKhaus = new ArrayList<>();
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
        System.out.println("Nhập Giá Nhập Khẩu San Phẩm");
        int giaNhapKhau;
        try {
            giaNhapKhau = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nhập Giá Nhập Khẩu San Phẩm");
            giaNhapKhau = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Nhập Tỉnh Thành Phố Nhập San Phẩm");
        String tinhThanhPho = scanner.nextLine();
        System.out.println("Nhập Thuế Nhập Khẩu San Phẩm");
        String thueNhapKhau = scanner.nextLine();

        SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(idSanPham, maSanPham, TenSanPham, giaBan, soLuong, nhaSanXuat, giaNhapKhau, tinhThanhPho, thueNhapKhau);
        sanPhamNhapKhaus.add(sanPhamNhapKhau);
        DocVaGhi.ghi(sanPhamNhapKhaus, "D:\\Codegym\\Module_2\\src\\module2\\data\\SanPhamNhapKhau");
    }


    @Override
    public void xoa(int id) {

        SanPhamNhapKhau sanPhamNhapKhau = null;
        int size = sanPhamNhapKhaus.size();
        for (int i = 0; i < size; i++) {
            if (sanPhamNhapKhaus.get(i).getMaSanpham() == id) {
                sanPhamNhapKhau = sanPhamNhapKhaus.get(i);
                break;
            }
        }
        if (sanPhamNhapKhau != null) {
            sanPhamNhapKhaus.remove(sanPhamNhapKhau);
        } else {
            System.out.printf("id = %d not existed.\n", id);
        }
    }

    @Override
    public void xemDanhSach() {
        sanPhamNhapKhaus = (List<SanPhamNhapKhau>) DocVaGhi.doc("D:\\Codegym\\Module_2\\src\\module2\\data\\SanPhamNhapKhau");
        for (SanPhamNhapKhau sanPhamNhapKhau : sanPhamNhapKhaus) {
            System.out.println(sanPhamNhapKhau.toString());
        }
    }

    @Override
    public void timKiem() {
        System.out.println("nhập Mã Sản Phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        boolean isExisted = false;
        int size = sanPhamNhapKhaus.size();
        for (int i = 0; i < size; i++) {
            if (sanPhamNhapKhaus.get(i).getMaSanpham() == id) {
                isExisted = true;
                System.out.println(sanPhamNhapKhaus.toString());
                break;
            }
        }
        if (!isExisted) {
            System.out.printf("id = %d not existed.\n", id);
        } else {
            System.out.println(sanPhamNhapKhaus);
        }
    }
}
