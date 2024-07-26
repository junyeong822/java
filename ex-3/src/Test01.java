import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        
        // 문제 1 
        // 월을 입력 받아서 
        // 1) 계절을 출력하시오.
        // 2) 해당 월의 마지막 날짜를 출력

        Scanner sc = new Scanner(System.in);

        System.out.println("년도 입력 : ");
        int year = sc.nextInt();

        System.out.println("월 입력 : ");
        int month = sc.nextInt();

        String seasons = "";
        int lastDay = 0;
        
        // 윤년인지 검사
        boolean isLeapYear = (year % 4 == 0) && year % 100!=0 || year % 400 == 0;


        switch (month){
            case 3: case 4: case 5:
                seasons = "Spring";
                break;
            case 6: case 7: case 8:
                seasons = "Summer";
                break;
            case 9: case 10: case 11:
                seasons = "Autumn";
                break;
            case 12: case 1: case 2:
                seasons = "Winter";
                break;
            default:
                seasons="오류";
                break;
        }

        // 마지막 일
        switch (month){
            case 1: case 3: case 5 : case 7: case 8: case 10 : case 12:
                lastDay = 31;
                break;
            case 2 :
                lastDay = 28 + (isLeapYear ? 1 : 0);
                break;
            case 4 : case 6 : case 9 : case 11 :
                lastDay = 30;
                break;
        }

        System.out.printf("계절 : %s, 마지막 일 : %d", seasons, lastDay);
    }
}
