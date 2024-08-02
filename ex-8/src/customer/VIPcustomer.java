package customer;

public class VIPcustomer extends Customer{

    // 추가
    // 상담사 배정 - 상담사의 고유번호를 저장할 수 있도록 한다
    // 할인율

    // 변경
    // 고객등급
    // calcPoint에서 할인율 계산
    // 포인드 적립율

    private int agent;
    private double discountRatio;

    public VIPcustomer() {
    }

    // 자식 클래스로 객체를 만들면
    //  ㄴ 부모 생성자를 먼저 호출해서 객체로 생성하고
    //  ㄴ 자식 생성자를 호출해서 자식 객체의 추가/변경되는 부분을 입력
    //  ㄴ 그래서 반드시 부모 생성자 먼저 호출
    public VIPcustomer(int customerId, String customerName) {
        super(customerId,customerName); // 부모 생성자 호출
        this.agent = 100;
        this.grade = "VIP";
        this.bonusRatio = 0.05;
        this.discountRatio = 0.1;
    }

    public int getAgent() {
        return agent;
    }

    public void setAgent(int agent) {
        this.agent = agent;
    }

    // 상속 관계에서 메서드의 내용 변경
    @Override
    public int calcPrice(int price) {
        bonusPoint += (price * bonusRatio);
        return (int) (price * (1 - discountRatio)); // 할인된 가격 계산
    }
}
