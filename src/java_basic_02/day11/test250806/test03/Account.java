package java_basic_02.day11.test250806.test03;

public class Account {
    private String accNo;
    private int balance;

    public void save(int num) {
        balance += num;
        System.out.printf("%s 계좌에 %d만원이 입금되었습니다.\n", getAccNo(), num);
    }

    public void deposit(int num) {
        balance -= num;
        System.out.printf("%s 계좌에 %d만원이 출금되었습니다.\n", getAccNo(), num);
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
        System.out.printf("%s 계좌가 개설되었습니다.\n", getAccNo());
    }

    public String getAccNo() {
        return accNo;
    }

    public int getBalance() {
        return balance;
    }
}
