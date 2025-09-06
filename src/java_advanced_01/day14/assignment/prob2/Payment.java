package java_advanced_01.day14.assignment.prob2;

public abstract class Payment implements Payable {
    protected String shopName;
    protected String productName;
    protected long productPrice;

    public Payment(String shopName, String productName, long productPrice) {
        this.shopName = shopName;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public String getShopName() {
        return shopName;
    }

    public String getProductName() {
        return productName;
    }

    public long getProductPrice() {
        return productPrice;
    }

    @Override
    public void pay() throws PayException {
        if (this.getProductPrice() <= 0) {
            throw new PayException("가격이 잘못되었습니다.");
        } else {
            System.out.println("현금이 정상적으로 지불되었습니다.\n[ 현금 결제 정보 ]");
        }
    }
}
