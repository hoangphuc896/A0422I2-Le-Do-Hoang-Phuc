package module2.model;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PayAccount extends ManageBank {
    private String idCard;
    private String moneyBank;

    public PayAccount() {

    }

    public PayAccount(int id, String coding, String name, Date createdate, String idCard, String moneyBank) {
        super(id, coding, name, createdate);
        this.idCard = idCard;
        this.moneyBank = moneyBank;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getMoneyBank() {
        return moneyBank;
    }

    public void setMoneyBank(String moneyBank) {
        this.moneyBank = moneyBank;
    }

    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s", getId(), getCoding(), getName(), dateFormat.format(getCreatedate()),getIdCard(),getMoneyBank());
    }

    @Override
    public String toString() {
        return "PayAccount{" + super.toString()+
                "idCard='" + idCard + '\'' +
                ", moneyBank='" + moneyBank + '\'' +
                "} ";
    }
}
