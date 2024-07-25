public class Exam02 {

    public static void main(String[] args) {
        // 연산자
        /*

        1) 사칙연산
        + : 숫자-덧셈, 문자열 - 이어붙이기
        -
        *
        / : 정수의 나눗셈은 몫만 구해줌.
            ㄴ 정수의 나눗셈에서 소수점 얻으려면?
                (double) 10 / 3 = 3.3333
                (자료형) - 형변환, 캐스트 연산자
        % : 나머지 구하기


        2) 복합대입 연산자
        - 사칙연산 후, 나에게 다시 저장
        num += 10; -------> num = num + 10;
        num -= 3;
        num *= 3;
        num /= 3;
        num %= 3;

        3) 비교연산자
        결과값은 항상 - ture / false 값으로 나온다.
        > : 초과      < : 미만
        >= : 이상     <= : 이하
        == : 같다     != : 다르다

        4) 증감 연산자
        1씩 더하거나
        1씩 빼는것

        i++;  i--; 후위 연산자 : 연산 우선순위가 가장 마지막

        ++i; --i; 전위 연산자 : 연산 우선순위가 가장 첫번째


        */

        int n1 = 10;
        int n2 = 3;

        System.out.println( n1 += 3 );
        System.out.println( n1 -= 3 );
        System.out.println( n1 *= 3 );
        System.out.println( n1 /= 3 );
        System.out.println( n1 %= 3 );

        System.out.println( n1 > n2 );
        System.out.println( n1 < n2 );
        System.out.println( n1 >= n2 );
        System.out.println( n1 <= n2 );
        System.out.println( n1 == n2 );
        System.out.println( n1 != n2 );


        int result = 3;
        int i = 0;

        System.out.println("i : " + i); // 0
        System.out.println( result * i++); // r 0 ,
        System.out.println("i : " + i); // 1
        System.out.println( result * ++i); // 6
        System.out.println("i : " + i);



    }
}
