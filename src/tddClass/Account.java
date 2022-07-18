package tddClass;

public class Account {

    private int balance;
    private int withdraw;
    public void deposit(int amount) {
        balance = balance + amount;
    }

    public int getBalance() {
        return balance;
    }

    public int withdraw(int amount) {

        return withdraw = getBalance() - amount;
    }

    public int getWithdraw() {
        return withdraw;
    }
}
