package module2.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account extends ManageBank {
    private String moneySave;
    private Date DateSave;
    private int interestRate;
    private int term;

    public Account() {

    }

    public Account(int id, String coding, String name, Date createdate, String moneySave, Date dateSave, int interestRate, int term) {
        super(id, coding, name, createdate);
        this.moneySave = moneySave;
        this.DateSave = dateSave;
        this.interestRate = interestRate;
        this.term = term;
    }

    public String getMoneySave() {
        return moneySave;
    }

    public void setMoneySave(String moneySave) {
        this.moneySave = moneySave;
    }

    public Date getDateSave() {
        return DateSave;
    }

    public void setDateSave(Date dateSave) {
        DateSave = dateSave;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }

    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s", getId(), getCoding(), getName(), dateFormat.format(getCreatedate()),getMoneySave(),dateFormat.format(getDateSave()),getInterestRate(),getTerm());
    }

    @Override
    public String toString() {
        return "Account{" +super.toString() +
                "moneySave='" + moneySave + '\'' +
                ", DateSave=" + dateFormat.format(getDateSave()) +
                ", interestRate=" + interestRate +
                ", term=" + term +
                "} ";
    }
}
