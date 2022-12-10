package module2.ultils;

import castudymodule2.ultils.AgeException;
import castudymodule2.validate.Validator;
import module2.validate.Validate;

import java.util.Date;
import java.util.Scanner;

public class RexgexManageBank {
    public static final String FOMAT_CODING="[0-9]+";
    public static final String FOMAT_MONEYSAVE="[0-9]+";
    public static final String FOMAT_IDCARD="[0-9]+";
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

    public static String inputCoding(){
        System.out.println("Nhập Mã khách Hàng");
        return RegexDate.RegexStr(scanner.nextLine(),FOMAT_CODING,"Mời bạn Nhập Lại");
    }

    public static String inputName(){
        System.out.println("Nhập Tên khách Hàng");
        return RegexDate.RegexStr(scanner.nextLine(),FOMAT_NAME,"Mời bạn Nhập Lại");
    }
    public static Date inputCreatDate() {
        Date creatDate;
        do {
            System.out.println("Mời Bạn Nhập Ngày");
            String date = scanner.nextLine();
            try {
                creatDate = Validate.validateCreatedate(date);// công thức định dạng ngày sinh để người nhập đúng
                break;
            } catch (AgeException e) {
                System.out.println("Bạn Nhập Sai Ngày Mời Bạn Nhập Lại");
            }
        } while (true);
        return creatDate;
    }
    public static String inputMoneySave(){
        System.out.println("Nhập Tiền Gửi khách Hàng");
        return RegexDate.RegexStr(scanner.nextLine(),FOMAT_MONEYSAVE,"Mời bạn Nhập Lại");
    }
    public static Date inputDateSave() {
        Date dateSave;
        do {
            System.out.println("Mời Bạn Nhập Ngày");
            String date = scanner.nextLine();
            try {
                dateSave = Validate.validateCreatedate(date);// công thức định dạng ngày sinh để người nhập đúng
                break;
            } catch (AgeException e) {
                System.out.println("Bạn Nhập Sai Ngày Mời Bạn Nhập Lại");
            }
        } while (true);
        return dateSave;
    }
    public static int inputInterestRate() {
        int interestRate;
        do {
            try {
                System.out.println("Enter InterestRate :");
                interestRate = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Sai Mời Bạn Nhập Lại");
            }
        } while (true);
        return interestRate;
    }
    public static int inputterm() {
        int term;
        do {
            try {
                System.out.println("Enter term :");
                term = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn Nhập Sai Mời Bạn Nhập Lại");
            }
        } while (true);
        return term;
    }
    public static String inputIdCard(){
        System.out.println("Nhập IdCard khách Hàng");
        return RegexDate.RegexStr(scanner.nextLine(),FOMAT_IDCARD,"Mời bạn Nhập Lại");
    }
    public static String inputMoneyBank(){
        System.out.println("Nhập MoneyBank khách Hàng");
        return RegexDate.RegexStr(scanner.nextLine(),FOMAT_MONEYSAVE,"Mời bạn Nhập Lại");
    }
}
