package Exam;

public class calculatorTest {

    public static void main(String[] args) {

        // 객체명 = 참조변수 (객체의 주소값을 담는 변수)
        // 클래스이름 객체명 = new 클래스이름();

        // Caculator 설계도 모양대로 calc가 생산이 되었다(메모리에 할당)
        // calc이름으로 클래스 안에 있는 변수 또는 메서드에 접근해서 사용 가능
        Caculator calc = new Caculator();

        int x = 10;
        int y = 10;

        double r4 = calc.divide(x, y);
        int r5 = calc.remainder(x, y);

        System.out.println( calc.add(x, y) );
        System.out.println( calc.subtract(x, y));
        System.out.println( calc.multiply(x, y));
        System.out.println( r4 );
        System.out.println( r5 );

    }

}
