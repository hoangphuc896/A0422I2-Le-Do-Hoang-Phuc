package module2.controllers;

import module2.services.Imlp.DanhSachBenhNhanThuongImpl;
import module2.services.Imlp.DanhSachBenhNhanVipImpl;

import java.util.Scanner;

public class DanhSachBenhNhan {
    public static void main(String[] args) {
        boolean check = true;
        while (check) {
            System.out.println("1. Them moi benh nhan");
            System.out.println("2. Xoa Benh Nhan");
            System.out.println("3. Xem Danh Sach Benh Nhan");
            System.out.println("4. Thoat");
            System.out.println("Chon tu 1-4");
            Scanner scanner = new Scanner(System.in);

            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    displayAddNewBank();
                    break;
                case 2:
                    displayDeleteBank();
                    break;
                case 3:
                    displayBank();
                    break;
                default:
                    check = false;
            }
        }
    }

    public static void displayAddNewBank() {
        DanhSachBenhNhanThuongImpl accountServices = new DanhSachBenhNhanThuongImpl();
        DanhSachBenhNhanVipImpl payAccountServices = new DanhSachBenhNhanVipImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Them Moi Benh Nhan");
            System.out.println("2. Them Moi Benh Nhan Vip");
            System.out.println("3. Quay Ve Menu Chinh");
            System.out.println("Chon tu 1-3");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    accountServices.addNew();
                    break;
                case 2:
                    payAccountServices.addNew();
                    break;
                default:
                    return;
            }
        }
    }

    public static void displayDeleteBank() {
        DanhSachBenhNhanThuongImpl accountServices = new DanhSachBenhNhanThuongImpl();
        DanhSachBenhNhanVipImpl payAccountServices = new DanhSachBenhNhanVipImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Xoa Benh Nhan");
            System.out.println("2. Xoa Benh Nhan Vip");
            System.out.println("3. Quay Ve Menu Chinh");
            System.out.println("Chon tu 1-3");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    System.out.println("You may want to delete");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("3. Return Menu");
                    System.out.println("Choose from 1-3");
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            accountServices.delete();
                            break;
                        case 2:
                            return;
                    }
                    break;
                case 2:
                    System.out.println("You may want to delete");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    System.out.println("3. Return Menu");
                    System.out.println("Choose from 1-3");
                    switch (Integer.parseInt(scanner.nextLine())) {
                        case 1:
                            payAccountServices.delete();
                            break;
                        case 2:
                            return;
                    }
                    break;
                default:
                    return;
            }
        }
    }


    public static void displayBank() {
        DanhSachBenhNhanThuongImpl accountServices = new DanhSachBenhNhanThuongImpl();
        DanhSachBenhNhanVipImpl payAccountServices = new DanhSachBenhNhanVipImpl();
        boolean check = true;
        while (check) {
            System.out.println("1. Xem Danh Sach Benh Nhan");
            System.out.println("2. Xem Danh Sach Benh Nhan Vip");
            System.out.println("3. Ve Menu Chinh");
            System.out.println("Chon Tu 1-3");
            Scanner scanner = new Scanner(System.in);
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1:
                    accountServices.display();
                    break;
                case 2:
                    payAccountServices.display();
                    break;
                default:
                    return;
            }
        }
    }

}
