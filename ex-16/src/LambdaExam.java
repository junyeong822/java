@FunctionalInterface
interface StringLength {
    public int getLength(String s);
}

@FunctionalInterface
interface NumberCheck{
    public boolean isOdd(int num);
}

@FunctionalInterface
interface GenderCheck{
    public boolean isMale(String juminNumber);
}

public class LambdaExam {
    public static void main(String[] args) {


        // 1) 문자열의 길이를 반환해주는 람다식
        StringLength stringLength = s -> s.length();

        int length = stringLength.getLength("hello world!");
        System.out.println("글자 길이 : " + length);

        // 2) 숫자가 홀수인지 짝수인지 판단해주는 람다식
        //      ㄴ 홀수 : true / 짝수 : false

        NumberCheck numberCheck = n -> ( n % 2 == 1)? true : false;
        System.out.println("길이 홀수 여부 : " + numberCheck.isOdd(length));

        // 3) 주민번호를 넣으면 주민번호를 보고 남자인지 여자인지 판정해주는 람다식
        //      ㄴ 남자 : true / 여자 : false 반환
        //    String에서 문자열의 일부를 추출하는 메서드, 찾아보기

        String juminNumber = "240814-4111222";

        GenderCheck genderCheck = number -> {
            char ch = number.charAt(7); // 특정 인덱스의 글자를 char 형태로 추출
            switch (ch) {
                case '1', '3' -> {
                    return true;
                }
                case '2', '4' -> {
                    return false;
                }
            }
            System.out.println(ch);
            return false;
        };

        String gender = genderCheck.isMale(juminNumber) ? "남" : "여";
        System.out.println(gender);



    }
}