public class Calculator {

    private int val1;
    private int val2;

    // 1) 내부클래스 객체 변수 선언
    private Calc c;

    public Calculator(int val1, int val2){
        this.val1 = val1;
        this.val2 = val2;

        // 2) 내부 클래스 객체를 할당
        c = new Calc();
    }

    // 3) 내부 클래스의 메서드를 이용하는---> 외부클래스의 메서드를 생성
    public int plus(){
        return c.add();
    }

    public class Calc{

        public int add(){
            return val1 + val2;
        }

    }
}
