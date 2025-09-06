package java_basic_02.day10;

public class Account {
    private String accNum;
    private String accOwner;
    private int balance;

    public Account(String accNum, String accOwner, int balance) {
        this.accNum = accNum;
        this.accOwner = accOwner;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public String getAccOwner() {
        return accOwner;
    }

    public int getBalance() {
        return balance;
    }

    public int addBalance(int input) {
        balance += input;
        return balance;
    }

    public int reduceBalance(int input) {
        balance -= input;
        return balance;
    }
}
