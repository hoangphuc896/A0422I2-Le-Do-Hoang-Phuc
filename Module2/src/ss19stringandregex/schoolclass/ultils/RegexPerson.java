package ss19stringandregex.schoolclass.ultils;

import castudymodule2.ultils.AgeException;
import castudymodule2.validate.Validator;

import java.util.Date;
import java.util.Scanner;

public class RegexPerson {
    public static final String FOMAT_NAME = "([A-Z][a-z ]*)+";
    private static Scanner scanner = new Scanner(System.in);

    public static int inputID() {
        int id;
        do {
            try {
                System.out.println("Enter id :");
                id = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Sai Mời Bạn Nhập Lại");
            }
        } while (true);
        return id;
    }

    public static String inputName() {
        System.out.println("Enter Name : ");
        return RegexData.RegexStr(scanner.nextLine(), FOMAT_NAME, "Bạn Nhập sai định dạnh mời bạn nhập lại");
    }

    public static Date inputBirthDay() {
        Date birthDay;
        do {
            System.out.println("Mời Bạn Nhập Ngày Sinh");
            String birth = scanner.nextLine();
            try {
                birthDay = Validator.validateBirtday(birth);// công thức định dạng ngày sinh để người nhập đúng
                break;
            } catch (AgeException e) {
                System.out.println("Bạn Nhập Sai Ngày sinh Mời Bạn Nhập Lại");
            }
        } while (true);
        return birthDay;
    }

    public static String inputClassification() {
        String classification = null;
        int choose;
        do {
            System.out.println("1.Học Giỏi");
            System.out.println("2.Tiên Tiến");
            System.out.println("3.Khá");
            System.out.println("4.Trung Bình");
            System.out.println("5.Yếu");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    classification = "Học Giỏi";
                    break;
                case 2:
                    classification = "Tiên Tiến";
                    break;
                case 3:
                    classification = "Khá";
                    break;
                case 4:
                    classification = "Trung Bình";
                    break;
                case 5:
                    classification = "Yếu";
                    break;
            }
        } while (choose < 1 || choose > 5);
        return classification;
    }


    public static String inputPosition() {
        String position = null;
        int choose;
        do {
            System.out.println("1.Chủ Nhiệm");
            System.out.println("2.giáo Viên");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    position = "Chủ Nhiệm";
                    break;
                case 2:
                    position = "Giáo viên";
                    break;
            }
        } while (choose < 1 || choose > 2);
        return position;
    }
}
