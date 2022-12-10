package module2.services.Imlp;

import module2.model.Account;
import module2.model.PayAccount;
import module2.services.PayAccountServices;
import module2.ultils.ReadAndWrite;
import module2.ultils.RexgexManageBank;
import ss19stringandregex.schoolclass.ultils.RegexPerson;

import java.util.*;

public class PayAccountServicesImpl implements PayAccountServices {
    private List<PayAccount> payAccounts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    @Override
    public void addNew() {
        payAccounts = ReadAndWrite.readPayAccount("D:\\Codegym\\Module2\\src\\module2\\data\\PayAccount.csv");
        int id= RexgexManageBank.inputID();
        String coding =RexgexManageBank.inputCoding();
        String name =RexgexManageBank.inputName();
        Date createdate=RexgexManageBank.inputCreatDate();
        String idCard= RexgexManageBank.inputIdCard();
        String moneyBank=RexgexManageBank.inputMoneyBank();
        PayAccount payAccount = new PayAccount(id, coding, name, createdate,idCard,moneyBank);
        payAccounts.add(payAccount);
        ReadAndWrite.writePayAccount(payAccounts,"D:\\Codegym\\Module2\\src\\module2\\data\\PayAccount.csv");
    }

    @Override
    public void delete() {
        payAccounts = ReadAndWrite.readPayAccount("D:\\Codegym\\Module2\\src\\module2\\data\\PayAccount.csv");
        for (PayAccount payAccount : payAccounts){
            System.out.println(payAccount.toString());
        }
        String coding = RexgexManageBank.inputCoding();
        PayAccount payAccount1 = null;
        for (PayAccount payAccount : payAccounts) {
            if (Objects.equals(payAccount.getCoding(), coding)) {
                payAccount1 = payAccount;
                break;
            }
        }
        if (payAccount1 != null) {
            payAccounts.remove(payAccount1);
            System.out.println("Delete product");
            for (PayAccount payAccount : payAccounts) {
                System.out.println(payAccount.toString());
            }
        } else {
            System.out.printf("Coding = %s not existed.\n", coding);
        }
        ReadAndWrite.writePayAccount(payAccounts,"D:\\Codegym\\Module2\\src\\module2\\data\\PayAccount.csv");
    }

    @Override
    public void display() {
        payAccounts = ReadAndWrite.readPayAccount("D:\\Codegym\\Module2\\src\\module2\\data\\PayAccount.csv");
        for (PayAccount payAccount :payAccounts){
            System.out.println(payAccount.toString());
        }
    }

    @Override
    public void search() {
        payAccounts = ReadAndWrite.readPayAccount("D:\\Codegym\\Module2\\src\\module2\\data\\PayAccount.csv");
        for (PayAccount payAccount : payAccounts){
            System.out.println(payAccount.toString());
        }
        String name = RegexPerson.inputName();
        PayAccount payAccount1 = null;
        for (PayAccount payAccount : payAccounts) {
            if (payAccount.getName().equals(name)) {
                payAccount = payAccount1;
                break;
            }
        }
        if (payAccount1 != null) {
            System.out.println("PayAccount you are looking for" + payAccount1);
        } else {
            System.out.println("Not PayAccount in list :" + name);
        }
    }
}
