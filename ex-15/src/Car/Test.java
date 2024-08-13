package Car;

public class Test {
    public static void main(String[] args) {

        // 실행방법 2가지
        // 속도를 증가 또는 감속할 때마다 현재속도 같이 출력
        // 현재 속도가 0 이하면 감속할 수 없게함
        // 최대 속도는 100까지만 가능하도록함 MAX_SPEED 상수 선언
        // 최대 속도입니다 출력
        Car car = new Car("현대","152가 1234");

        // 방법 1
        car.turnOn();
        car.acceleration();
        car.deceleration();
        car.turnOff();
        System.out.println(car);

        // 방법 2
        Car.Engine engine = car.new Engine();
        engine.engineOn();
        engine.speedUp();
        engine.speedDown();
        engine.engineOff();
    }
}
