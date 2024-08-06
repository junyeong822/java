package Exam02;

public class Test {

    public static void main(String[] args) {

        // 인터페이스 이름을 자료형으로 사용
        // 객체 생성은 - 구현 클래스 이름으로 사용


        Phone phone = new ApplePhone();
        Person me = new Person(phone);


        me.turnOn();
        me.chargePhone();
        me.chargePhone();
        for(int i = 0; i < 6; i++){
            me.watchUtube();
        }

        me.turnOff();

        me.buyNewPhone( new Galaxy());

        me.turnOn();
        me.chargePhone();
        me.chargePhone();
        for(int i = 0; i < 6; i++){
            me.watchUtube();
        }

        me.turnOff();


    }
}
