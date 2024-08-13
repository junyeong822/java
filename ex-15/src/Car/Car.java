package Car;

/*
외부 클래스 : Car
    변수 : company carName speed isPowerOn
           초기값 : 현대 차번호(152가 1234) 0 false
    메서드 : 엔진 클래스의 speedUp을 실행하는 메서드
            엔진 클래스의 speedDown을 실행하는 메서드
            turnOn; : 엔진 클래스의 engineOn 실행
            turnOff; : 엔진 클래스의 engineOff 실행

내부 클래스 : Engine
    메서드 : 가속 : speedUp(); - 속도를 + 10 가속시킵니다 메시지 출력 - speed +10
            감속 : speedDown(); - 속도를 - 10 감속시킵니다 메시지 출력 - speed -10
            engineOn; : (메시지) 시동이 켜졌습니다 - isPowerOn - true
            engineOff; : (메시지) 시동이 꺼졌습니다 - isPowerOff - false
 */

public class Car {
    private final int MAX_SPEED = 100;

    private String company;
    private String carNumber;
    private int speed;
    private boolean isPowerOn;

    private Engine engine;

    private Car(String company, String carNumber, int speed) {
        this.company = company;
        this.carNumber = carNumber;
        speed = 0;
        isPowerOn = false;
        engine = new Engine();
    }

    public void turnOn() {
        engine.engineOn();
    }
    public void turnOff() {
        engine.engineOff();
    }
    public void acceleration() {
        engine.speedUp();
    }
    public void deceleration() {
        engine.speedDown();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return company + carNumber + speed + isPowerOn;
    }

    public class Engine {

        public void engineOn() {
            System.out.println("시동 On");
            isPowerOn = true;
        }

        public void engineOff() {
            System.out.println("시동 Off");
            isPowerOn = false;
        }

        public void speedUp() {
            if (!isPowerOn) {
                System.out.println("시동을 켜주세요");
                return;
            }

            System.out.println("속도 +10 증가 / 현재 속도 :" + speed);

            if (speed >= MAX_SPEED) {
                System.out.println("최대 속도입니다");
                return;
            }
            speed += 10;
        }

        public void speedDown() {
            System.out.println("속도 -10 감소 / 현재 속도 : " + speed);
            if (speed == 0) {
                System.out.println("감속할 수 없습니다");
                return;
            }
            speed -= 10;
        }
    }
}
