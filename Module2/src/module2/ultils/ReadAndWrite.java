package module2.ultils;

import module2.model.Account;
import module2.model.PayAccount;
import ss19stringandregex.schoolclass.model.Student;
import ss19stringandregex.schoolclass.model.Teacher;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReadAndWrite {
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public static void writeAccount(List<Account> accountList, String filer) {
        FileWriter fileWriter;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filer, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Account account : accountList) {
                bufferedWriter.write(account.getInfo() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static List<Account> readAccount(String filer) {
        List<Account> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filer);
            bufferedReader = new BufferedReader(fileReader);
            String[] temp;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id= Integer.parseInt(temp[0]);
                String coding =temp[1];
                String name =temp[2];
                Date createdate=dateFormat.parse(temp[3]);
                String moneySave =temp[4];
                Date dateSave = dateFormat.parse(temp[5]);
                int interestRate= Integer.parseInt(temp[6]);
                int term= Integer.parseInt(temp[7]);
                Account account= new Account(id, coding, name, createdate,moneySave,dateSave,interestRate,term);
                arrayList.add(account);

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }

    public static List<PayAccount> readPayAccount(String filer) {
        List<PayAccount> arrayList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fileReader = new FileReader(filer);
            bufferedReader = new BufferedReader(fileReader);
            String[] temp ;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id= Integer.parseInt(temp[0]);
                String coding =temp[1];
                String name =temp[2];
                Date createdate=dateFormat.parse(temp[3]);
                String idCard= temp[4];
                String moneyBank=temp[5];
                PayAccount payAccount = new PayAccount(id, coding, name, createdate,idCard,moneyBank);
                arrayList.add(payAccount);

            }
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
    public static void writePayAccount(List<PayAccount> payAccountList, String filer) {
        FileWriter fileWriter ;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(filer, false);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (PayAccount payAccount : payAccountList) {
                bufferedWriter.write(payAccount.getInfo() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
