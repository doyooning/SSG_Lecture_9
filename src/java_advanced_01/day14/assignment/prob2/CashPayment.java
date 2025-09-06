package java_advanced_01.day14.assignment.prob2;

public class CashPayment extends Payment {
    private String cashReceiptNumber;

    public String getCashReceiptNumber() {
        return cashReceiptNumber;
    }

    public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber) {
        super(shopName, productName, productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }

    @Override
    public String toString() {
        return String.format("상점명 : %s\n상품명 : %s\n상품가격 : %d\n현금영수증번호 : %s\n",
                this.getShopName(), this.getProductName(), this.getProductPrice(), this.getCashReceiptNumber());
    }


}
