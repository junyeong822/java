package Exam03;

public class JapanTour implements Tour{

    @Override
    public void header(){
        System.out.println("------------------");
        System.out.println("\t 일본 여행");
        System.out.println("------------------");
    }

    @Override
    public void program(){
        System.out.println("---여행지----");
        System.out.println("- 나라 사슴공원");
        System.out.println("- 디즈니 랜드");
        System.out.println("- 해리포터 스튜디오");
    }

    @Override
    public void meal(){
        System.out.println("--- 식사 ---");
        System.out.println("- 초밥");
        System.out.println("- 우동");
        System.out.println("- 라멘");
    }

    @Override
    public void hotel(){
        System.out.println("--- 숙박 ---");
        System.out.println("- 도쿄호텔");

    }
}
