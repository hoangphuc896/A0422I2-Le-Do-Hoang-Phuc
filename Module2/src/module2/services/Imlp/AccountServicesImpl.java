package module2.services.Imlp;

import module2.model.Account;
import module2.services.AccountServices;
import module2.ultils.ReadAndWrite;
import module2.ultils.RexgexManageBank;

import ss19stringandregex.schoolclass.ultils.RegexPerson;

import java.util.*;

public class AccountServicesImpl implements AccountServices {
    private static Scanner scanner = new Scanner(System.in);
    private List<Account> accounts = new ArrayList<>();

    @Override
    public void addNew() {
        accounts= ReadAndWrite.readAccount("D:\\Codegym\\Module2\\src\\module2\\data\\Account.csv");
        int id= RexgexManageBank.inputID();
        String coding =RexgexManageBank.inputCoding();
        String name =RexgexManageBank.inputName();
        Date createdate=RexgexManageBank.inputCreatDate();
        String moneySave =RexgexManageBank.inputMoneySave();
        Date dateSave = RexgexManageBank.inputDateSave();
        int interestRate= RexgexManageBank.inputInterestRate();
        int term= RexgexManageBank.inputterm();
        Account account = new Account(id, coding, name, createdate,moneySave,dateSave,interestRate,term);
        accounts.add(account);
        ReadAndWrite.writeAccount(accounts,"D:\\Codegym\\Module2\\src\\module2\\data\\Account.csv");
    }

    @Override
    public void delete() {
        accounts= ReadAndWrite.readAccount("D:\\Codegym\\Module2\\src\\module2\\data\\Account.csv");
        for (Account account : accounts){
            System.out.println(account.toString());
        }
        String coding = RexgexManageBank.inputCoding();
        Account account1 = null;
        for (Account account : accounts) {
            if (Objects.equals(account.getCoding(), coding)) {
                account1 = account;
                break;
            }
        }
        if (account1 != null) {
            accounts.remove(account1);
            System.out.println("Delete Account");
            for (Account account : accounts) {
                System.out.println(account.toString());
            }
        } else {
            System.out.printf("Coding = %s not existed.\n", coding);
        }
        ReadAndWrite.writeAccount(accounts,"D:\\Codegym\\Module2\\src\\module2\\data\\Account.csv");
    }

    @Override
    public void display() {
        accounts= ReadAndWrite.readAccount("D:\\Codegym\\Module2\\src\\module2\\data\\Account.csv");
        for (Account account :accounts){
            System.out.println(account.toString());
        }
    }

    @Override
    public void search() {
        accounts= ReadAndWrite.readAccount("D:\\Codegym\\Module2\\src\\module2\\data\\Account.csv");
        for (Account account : accounts){
            System.out.println(account.toString());
        }
        String name = RegexPerson.inputName();
        Account account1 = null;
        for (Account account : accounts) {
            if (account.getName().equals(name)) {
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
