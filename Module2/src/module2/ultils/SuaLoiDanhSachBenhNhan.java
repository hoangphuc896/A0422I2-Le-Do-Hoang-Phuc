package module2.ultils;

import castudymodule2.ultils.AgeException;

import module2.validate.Validate;

import java.util.Date;
import java.util.Scanner;

public class SuaLoiDanhSachBenhNhan {
    public static final String FOMAT_CODING = "[BA]+[0-9]{3}+";
    public static final String FOMAT_THOIHAN = "[0-9]+";
    public static final String FOMAT_NAME = "([A-Z][a-z ]*)+";
    private static Scanner scanner = new Scanner(System.in);


    public static String maBenhNhan() {
        System.out.println("Nhap Ma Benh Nhan");
        return RegexDate.RegexStr(scanner.nextLine(), FOMAT_CODING, "Mời bạn Nhập Lại");
    }

    public static String ten() {
        System.out.println("Nhap Ten Benh Nhan");
        return RegexDate.RegexStr(scanner.nextLine(), FOMAT_NAME, "Mời bạn Nhập Lại");
    }
    public static String lyDo() {
        System.out.println("Nhap Ly Do");
        return RegexDate.RegexStr(scanner.nextLine(), FOMAT_NAME, "Mời bạn Nhập Lại");
    }

    public static Date ngayNhapVien() {
        Date ngayNhapVien;
        do {
            System.out.println("Moi Ban Nhap Ngay");
            String date = scanner.nextLine();
            try {
                ngayNhapVien = Validate.validateCreatedate(date);// công thức định dạng ngày sinh để người nhập đúng
                break;
            } catch (AgeException e) {
                System.out.println("Ban Nhap Sai Moi Ban Nhap Lai");
            }
        } while (true);
        return ngayNhapVien;
    }

    public static int phiNamVien() {
        int phiNamVien;
        do {
            try {
                System.out.println("Enter phi Nam Vien :");
                phiNamVien = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ban Nhap Sai Moi Ban Nhap Lai");
            }
        } while (true);
        return phiNamVien;
    }

    public static Date ngayRaVien() {
        Date ngayRaVien;
        do {
            System.out.println("Moi Ban Nhap Ngay");
            String date = scanner.nextLine();
            try {
                ngayRaVien = Validate.validateCreatedate(date);// công thức định dạng ngày sinh để người nhập đúng
                break;
            } catch (AgeException e) {
                System.out.println("Ban Nhap Sai Moi Ban Nhap Lai");
            }
        } while (true);
        return ngayRaVien;
    }
    public static String loaiVip() {
            String loaiVip = null;
            int choose;
            do {
                System.out.println("1.Vip 1");
                System.out.println("2.Vip 2");
                System.out.println("3.Vip 3");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        loaiVip = "Vip 1";
                        break;
                    case 2:
                        loaiVip = "Vip 2";
                        break;
                    case 3:
                        loaiVip = "Vip 3";
                }
            } while (choose < 1 || choose > 3);
            return loaiVip;
        }
    public static String thoiHan() {
        System.out.println("Nhap thoi han Benh Nhan");
        return RegexDate.RegexStr(scanner.nextLine(), FOMAT_THOIHAN, "Mời bạn Nhập Lại");
    }
    }
