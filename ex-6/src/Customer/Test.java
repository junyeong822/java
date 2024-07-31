package Customer;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {

        Company company = Company.getInstance();
        System.out.println(company);

        Customer cus01 = new Customer("홍길동", "서울");
        Customer cus02 = new Customer("이몽룡", "남원");

        System.out.println(cus01);
        System.out.println(cus02);

    }


}
