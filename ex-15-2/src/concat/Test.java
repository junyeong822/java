package concat;

public class Test {

    public static void main(String[] args) {

        Concat concat = (str1, str2) -> str1 + "/" + str2;
        System.out.println(concat.concat("apple","juice"));

        CompareNumber compare = (x, y) -> ( x > y) ? 1 : (x == y) ? 0 : -1;
        System.out.println(compare.compareTo(10, 30));

        // 지름을 입력하면, 원의 넓이를 구해주는 람다식을 만드시오.
        // Math.PI 를 이용하여 계산하시오.
        CircleArea cicleArea = diameter -> {
            double radius = diameter/2;
            return Math.pow( radius, 2) * Math.PI;
        };

        System.out.println(cicleArea.areaSize(5) + "제곱미터");

    }
}
