package module2.controllers;


import module2.services.SanPhamNhapKhauMoi;
import module2.services.SanPhamXuatKhauMoi;

import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

public class HeThongQuanLy {
    public static void main(String[] args) throws IOException {
        boolean check = true;
        while (check) {
            System.out.println("Chọn các chức năng theo số");
            System.out.println("1. Thêm Mới");
            System.out.println("2. Xóa ");
            System.out.println("3. Xem danh sách Các Sản Phẩm");
            System.out.println("4. Tiềm Kiếm");
            System.out.println("5.Thoát");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    ThemMoiSanPham();
                    break;
                case 2:
                    break;
                case 3:
                    XemDanhSachSanPham();
                    break;
                case 4:
                    TimKiemDanhSach();
                case 5:
                    System.out.println("cảm ơn quý khách đã sử dụng dịch vụ");
                    check = false;
                    return;
            }
            scanner.nextLine();
        }
    }

    public static void ThemMoiSanPham() throws IOException {
        SanPhamNhapKhauMoi sanPhamNhapKhauMoi = new SanPhamNhapKhauMoi();
        SanPhamXuatKhauMoi sanPhamXuatKhauMoi = new SanPhamXuatKhauMoi();
        boolean check = true;
        while (check) {
            System.out.println("Chọn các chức năng theo số");
            System.out.println("1. Sản Phẩm Nhập Khẩu");
            System.out.println("2. Sản Phẩm Xuất Khẩu ");
            System.out.println("3.Thoát");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    sanPhamNhapKhauMoi.themMoi();
                    break;
                case 2:
                    sanPhamXuatKhauMoi.themMoi();
                    break;

                case 3:
                    System.out.println("cảm ơn quý khách đã sử dụng dịch vụ");
                    check = false;
                    return;
            }
            scanner.nextLine();
        }
    }

    public static void XemDanhSachSanPham() {
        SanPhamNhapKhauMoi sanPhamNhapKhauMoi = new SanPhamNhapKhauMoi();
        SanPhamXuatKhauMoi sanPhamXuatKhauMoi = new SanPhamXuatKhauMoi();
        boolean check = true;
        while (check) {
            System.out.println("Chọn các chức năng theo số");
            System.out.println("1. Sản Phẩm Nhập Khẩu");
            System.out.println("2. Sản Phẩm Xuất Khẩu ");
            System.out.println("3.Thoát");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    sanPhamNhapKhauMoi.xemDanhSach();
                    break;
                case 2:
                    sanPhamXuatKhauMoi.xemDanhSach();
                    break;

                case 3:
                    System.out.println("cảm ơn quý khách đã sử dụng dịch vụ");
                    check = false;
                    return;
            }
            scanner.nextLine();
        }
    }

    public static void TimKiemDanhSach() {
        SanPhamNhapKhauMoi sanPhamNhapKhauMoi = new SanPhamNhapKhauMoi();
        SanPhamXuatKhauMoi sanPhamXuatKhauMoi = new SanPhamXuatKhauMoi();
        boolean check = true;
        while (check) {
            System.out.println("Chọn các chức năng theo số");
            System.out.println("1. Sản Phẩm Nhập Khẩu");
            System.out.println("2. Sản Phẩm Xuất Khẩu ");

            System.out.println("3.Thoát");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    sanPhamNhapKhauMoi.timKiem();
                    break;
                case 2:
                    sanPhamXuatKhauMoi.timKiem();
                    break;

                case 3:
                    System.out.println("cảm ơn quý khách đã sử dụng dịch vụ");
                    check = false;
                    return;
            }
            scanner.nextLine();
        }
    }

}