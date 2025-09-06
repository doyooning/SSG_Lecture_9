package java_basic_02.day12.test250807.test3;

public class CheckingAccount extends Account {
    private String cardNo;

    public CheckingAccount(String accid, String ownerName, long balance, String cardNo) {
        super(accid, balance, ownerName);
        this.cardNo = cardNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void pay(String cardNo, long amount) {
        if ((getCardNo().equals(cardNo)) && (amount < getBalance())) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("지불이 불가능합니다.");
        }
    }

    @Override
    public void calcRate() {

    }
}
