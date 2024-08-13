/*

선언되는 위치
선언방법
실행방법

 */



public class LocalExam {

    private int speed = 10;

    public void getUnit (String unitName){
        // 메서드 안에 선언되는 클래스
        // 해당 메서드에서만 유효하다
        // 해당하는 메서드를 실행하면, 그 안에서 객체가 생성되고 실행이 된다.

        class Unit{
            public void move(){
                System.out.println(unitName +"/" + speed);
            }
        }

        // 클래스 바깥에서 객체 선언
        Unit unit = new Unit();
        unit.move();
    }

    public static void main(String[] args) {
        LocalExam local = new LocalExam();
        local.getUnit("마린");
    }


}
