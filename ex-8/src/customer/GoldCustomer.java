package customer;

public class GoldCustomer extends Customer{

    private double discountRatio;

    public GoldCustomer() {}

    public GoldCustomer(int customerId, String customerName){
        super(customerId, customerName);
        this.grade = "Gold";
        this.bonusRatio = 0.05;
        this.discountRatio = 0.03;
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += (price * bonusRatio);
        return (int) (price * (1 - discountRatio)); // 할인된 가격 계산
    }
}
