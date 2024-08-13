package ConCat;

public class Test01 {
    public static void main(String[] args) {
        // 문자열 2개를 받으면 2개 문자열을 연결해서 출력하는 람다식 구현
        Concat concat = (str1, str2) -> str1 + "/" + str2;
        System.out.println(concat.concat("apple","juice"));

        // 숫자 2개(num1 num2) num1 > num2 -1 / num1 == num2 0 / num1 < num2 -1
        ComparNumber comparNumber = (x,y) -> (x > y) ? 1 : (x==y) ? 0 : -1;
        System.out.println(comparNumber.comparNumber(10,30));

        // 지름을 입력하면 원의 넓이를 구해주는 람다식
        // Math.PI를 이용하여 계산
        Circle circle = diameter -> {
            double radius = diameter/2;
            return Math.pow((diameter/2),2) * Math.PI;
        };
        System.out.println(circle.Circlesize(5) + "제곱미터");
    }
}
