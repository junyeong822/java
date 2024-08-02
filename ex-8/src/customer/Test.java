package customer;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        // 부모 자료형에 자식 자료형을 넣을 수 있다
        // 자식 자료형 -> 부모자료형 넣어서 사용 : 자동형변환 - 업캐스팅
        // 다형성 - 다양한 자료형을 1가지 자료형에 널어서 사용할 수 있는 것

        Customer cusLee = new Customer(100,"홀길동");
        Customer cusHan = new GoldCustomer(105,"한사람");
        Customer cusKim = new VIPcustomer(200,"이몽룡");

        ArrayList<Customer> customerList = new ArrayList<>();

        VIPcustomer cusShin = new VIPcustomer(205,"신사임당");
        cusShin.setAgent(200);
        // 부모 자료형으로 업캐스팅한 경우
        //  ㄴ 자식 자료형에서 추가된 변수/메서드 사용x
        //  ㄴ 메서드 오버라이딩 한 경우 : 오버라이딩 된 내용으로 실행된다
        // cusHan.setAgent(100); - 에러남 왜? 업캐스팅 되었음 setAgent() 사용x

        customerList.add(cusLee);
        customerList.add(cusHan);
        customerList.add(cusKim);

        for (Customer cus : customerList) {
            cus.calcPrice(10000);
            System.out.println(cus);
        }
    }
}
