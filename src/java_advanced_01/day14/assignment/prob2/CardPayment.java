package java_advanced_01.day14.assignment.prob2;

public class CardPayment extends Payment {
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardPassword() {
        return cardPassword;
    }

    public int getMonthlyInstallment() {
        return monthlyInstallment;
    }

    @Override
    public String toString() {
        return String.format("상점명 : %s\n상품명 : %s\n상품가격 : %d\n신용카드번호 : %s\n할부개월 : %d\n",
                this.getShopName(), this.getProductName(), this.getProductPrice(), this.getCardNumber(), this.getMonthlyInstallment());
    }

    @Override
    public void pay() throws PayException {
        if ((this.getProductPrice() <= 0) || (this.getMonthlyInstallment() < 0)) {
            throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
        } else {
            System.out.println("신용카드가 정상적으로 지불되었습니다.\n[ 신용카드 결제 정보 ]");
        }
    }
}
