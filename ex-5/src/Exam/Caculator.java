package Exam;
// 클래스 안에 기능을 만들어 두었음

public class Caculator {
    // 값은 2개씩 정수를 받음.
    // 사칙 연산을 수행하는 메서드 구현

    public int add(int x, int y ){
        return x + y;
    }

    // 메서드 오버로딩
    // 메서드의 이름은 같고, 매개변수 자료형, 갯수를 다르게 한 것을 허용
    public double add(double x, double y ){
        return x + y;
    }

    public double add(int x, double y ){
        return x+y;
    }

    public double add(double x, int y ){
        return x+y;
    }

    // 뺄셈
    public int subtract(int x, int y ){
        return x - y;
    }

    // 곱셈
    public int multiply(int x, int y ){
        return x * y;
    }

    // 나눗셈 (반환값이 실수형임)
    public double divide(int x, int y ){
        return (double)x / y;
    }

    // 나머지
    public int remainder(int x, int y ){
        return x % y;
    }

}
