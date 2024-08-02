package customer;

/*
    회사에서 고객 정보 활용한 맞춤 서비스 제공
    - 일반 고객과 우수고객에 따른 서비스 제공
        ㄴ 할인을 포인트 적립율
        ㄴ 우수고객은 전문 상담사를 지정함 - 추가
        ㄴ 고객 등급도 변경

    - GoldCustomer
    - 할인율 : 3% 적립율 : 5%
    - 상담사 지정x
*/

public class Customer {
    protected int customerId;
    protected String customerName;
    protected String grade;
    protected double bonusPoint;
    protected double bonusRatio;


    public Customer() {}

    public Customer (int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.grade = "silver";
        this.bonusPoint = 0;
        this.bonusRatio = 0.01;
    }

    private int agent;
    private double discountRatio;

    public int calcPrice(int price) {
        bonusPoint += (price * bonusRatio);
        return price;
    }

    @Override
    public String toString() {
        return customerName + "님 : " + grade + " 등급 / 포인트 : " + bonusRatio;
    }

}
