package contructors.exercise;

import java.util.Random;
import java.text.MessageFormat;

public class Account {
    private int ID;
    private String ownerName;
    private double ammount;

    public Account(String ownerName, double initialAmmount) {

        Random random = new Random();
        int randomNumber = 1000 + random.nextInt(9000); //between 1000 and 9999

        this.ID = randomNumber;
        this.ownerName = ownerName;
        this.ammount = initialAmmount;
    }

    public int getID() {
        return ID;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getAmmount() {
        return ammount;
    }

    public void depositAmmount(double valueToDeposit) {
        if (valueToDeposit >= 0) {
            this.ammount += valueToDeposit;
        }
    }

    public void withdrawAmmount(double valueToWithdraw) {
        double withdrawTax = 5.00;

        if (valueToWithdraw >= 0) {
            this.ammount -= (valueToWithdraw + withdrawTax);
        }
    }

    public String toString() {
        return MessageFormat.format("Account {0}, Holder: {1}, Balance: R${2}", ID, ownerName, ammount);
    }
}
