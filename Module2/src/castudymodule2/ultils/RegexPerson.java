package castudymodule2.ultils;

import castudymodule2.validate.Validator;

import java.util.Date;
import java.util.Scanner;

public class RegexPerson {
    public static final String FOMAT_ADRESS="[0-9]+ ([A-Z][a-z ]*)+";
    public static final String FOMAT_SALARY = "[0-9](.[0-9]{3})+";
    public static final String FOMAT_ID = "[0-9]+";
    public static final String FOMAT_NAME = "([A-Z][a-z ]*)+";
    public static final String FOMAT_IDCARD = "[0-9]{10,11}";
    public static final String FOMAT_EMAIL = "[a-z]*@[a-z]+[.][a-z]+";
    static Scanner scanner = new Scanner(System.in);

    public static String inputLever() {
        System.out.println("Mời Bạn Chọn Trình Độ Học Vấn :");
        System.out.println("1.Trung Cấp");
        System.out.println("2.Cao Đẳng");
        System.out.println("3.Đại Học");
        System.out.println("4.Sau Đại Học");
        String lever = null;
        int choose;
        do {
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    lever = "Trung Cấp";
                    break;
                case 2:
                    lever = "Cao Đẳng";
                    break;
                case 3:
                    lever = "Đại Học";
                    break;
                case 4:
                    lever = "Sau Đại Học";
                    break;
            }
        } while (choose <= 1 || choose >= 4);
        return lever;
    }

    public static String inputName() {
        System.out.println("Nhập tên bạn :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_NAME, "Bạn Nhập sai định dạng Mời Banh Nhập Lại");
    }

    public static String inputSex() {
        String sex = null;
        int choose;
        do {
            System.out.println("Mời Bạn Chọn Giới tính");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    sex = "Nam";
                    break;
                case 2:
                    sex = "Nữ";
                    break;
            }
        } while (choose < 1 || choose > 2);
        return sex;
    }

    public static String inputIdCard() {
        System.out.println("Mời Bạn Nhập Chứng Minh :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_IDCARD, "Bạn Nhập Sai Chứng Minh Mời Bạn Nhập Lại");
    }

    public static String inputEmail() {
        System.out.println("Mời Bạn Nhập Email :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_EMAIL, "Bạn Nhập Sai Email Mời Bạn Nhập Lại");
    }

    public static String inputPosition() {
        String position = null;
        int choose;
        do {
            System.out.println("Chức Vụ Bạn Hiện Tại Là Gì");
            System.out.println("1.Lễ Tân");
            System.out.println("2.Phục Vụ");
            System.out.println("3.Chuyên Viên");
            System.out.println("4.Giám Sát");
            System.out.println("5.Quản Lý");
            System.out.println("6.Giám Đốc");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    position = "Lễ Tân";
                    break;
                case 2:
                    position = "Phục Vụ";
                    break;
                case 3:
                    position = "Chuyên Viên";
                    break;
                case 4:
                    position = "Giám Sát";
                    break;
                case 5:
                    position = "Quản Lý";
                    break;
                case 6:
                    position = "Giám Đốc";
                    break;
            }
        } while (choose < 1 || choose > 6);
        return position;
    }

    public static String inputId() {
        System.out.println("Mời Bạn Nhập ID :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_ID, "Bạn Nên Nhập Lại :");
    }

    public static String inputSalary() {
        System.out.println("Mời Bạn Nhập Mức Lương :");
        return RegexData.regexStr(scanner.nextLine(), FOMAT_SALARY, "Bạn Nên Nhập Lại :");
    }

    public static Date inputBirthDay(){
        Date birthDay;
        do {
            System.out.println("Mời Bạn Nhập Ngày Sinh:");
            String DateAsString = scanner.nextLine();
            try {
                birthDay = Validator.validateBirtday(DateAsString);
                break;
            } catch (AgeException e) {
                System.out.println("Bạn đã Nhập Sai Định Dạng Ngày");
            }
        } while (true);
        return birthDay;
    }

    public static String inputCustomerType(){
        String type = null;
        int choose;
        do {
            System.out.println("Mời Bạn Chọn Loại Khách Hàng :");
            System.out.println("1.Kim Cương");
            System.out.println("2.Bạch Kim");
            System.out.println("3.Vàng");
            System.out.println("4.Bạc");
            System.out.println("5.Thành Viên");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    type = "Kim Cương";
                    break;
                case 2:
                    type = "Bạch Kim";
                    break;
                case 3:
                    type = "Vàng";
                    break;
                case 4:
                    type = "Bạc";
                    break;
                case 5:
                    type ="Thành Viên";
                    break;
            }
        } while (choose < 1 || choose > 5);
        return type;
    }

    public static String inputAdress(){
        System.out.println("Mời Bạn Nhập Địa Chỉ :");
        return RegexData.regexStr(scanner.nextLine(),FOMAT_ADRESS,"Mời Bạn Nhập Lại Địa Chỉ");
    }
}
