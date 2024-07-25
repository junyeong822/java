public class Exam02_2 {

    public static void main(String[] args) {

        // 비교연산자 - 조건이 2개 이상일때
        /*

        ## and 조건- ~이고, 둘다, 모두, 전부
        * 조건이 모두 맞아야  true)
        - 국어, 영어 점수가 모두 70점 이상
        - 국여, 영어 점수 둘다 70점 이상
        - 영어 점수가 70점 이상, 국어 점수가 70점 이상이면

        국어>=70 && 영어>=70

        ## or조건 - ~이거나, 또는, ~~중 하나라도..
        * 조건이 하나라도 맞아야  true
        - 국어 또는 영어 점수가 90점 이상이면
        - 국어, 영어 중 하나라도 90점 이상이면
        - 국어가 90점 이상 이거나, 영어가 90점 이상이면..

        국어>=70 || 영어>=70

        예시)
        숫자 구간 - and 조건
        ex)
        0~100 사이 값이라면 = 0보다 이상이고, 100이하인 값
        --> num >=0 && num <= 100

        0~100사이 값이 아니라면 = 0 미만, 100초과 둘 중에 하나라도 해당
        --> num < 0 || num > 100

         */

        // 1) 놀이공원 놀이기구 이용 조건 - 나이가 12세 이상, 키 120cm 이상
        System.out.println("test");

        // age >= 12 && height >= 120

        // 2) 승진 조건 - 면담 60점 이상, 영업이익 또는 매출 총이익이 100 이상 인 경우
        // interview >= 60 && operating >=100 || sales>=100


        // 3) 윤년 계산
        // - 연도가 4로 나누어 떨어지고, year % 4== 0
        // - 연도가 100으로 나누어 떨어지지 않거나, year % 100 != 0
        // - 연도가 400으로 나누어 떨어진다  year % 400 == 0

        // year % 4== 0 && year % 100 != 0 || year % 400 == 0

        // 4) 할인혜택
        // - 도서관에 입장하려면 회원증을 가지고 있어야 하고, 마스크를 착용해야 합니다.
        // - 적절한 자료형을 선택하여 변수를 선언하고 작명하시오.
        // - Q. YES/NO 또는 true/false, on/off와 같은 두가지 값을 저장할 수 있는 자료형은?

        // is~ 상태 , has ~ : 보유여부

        boolean hasMembership = true;
        boolean wearingMask = true;

        System.out.println(hasMembership == true && wearingMask == true);


        // not 연산자
        // true -> false , false -> true
        // 상태 반전

        boolean isOn = false; // off

        // 3번 반복
        isOn = !isOn; // 상태를 반전해서 저장
        System.out.println(isOn); // true -> false --- on -> off
        isOn = !isOn;
        System.out.println(isOn); // false -> true --- off -> on
        isOn = !isOn;
        System.out.println(isOn); // true -> false --- on -> off

        // 반복문으로
        for(int i = 0; i < 3; i++){
            isOn = !isOn;
            System.out.println(isOn); // true -> false --- on -> off
        }

    }
}
