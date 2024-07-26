
public class Exam01 {
    public static void main(String[] args) {


        // switch --> if~ else if ~else

        // EX1
        int score = 87;
        String grade = "";

        switch (score / 10){
            case 9 :
                grade = "A";
                break; // switch문 탈출해라
            case 8 :
                grade = "B";
                break;
            case 7 :
                grade = "C";
                break;
            case 6 :
                grade = "D";
                break;
            default:
                System.out.println("F");
                break;
        }

        System.out.println(grade);

        // EX 2
        // case가 같은 유형끼리 처리하는 방법
        // 1~3 : a 그룹, 4~6 : b그룹 , 7~9 : c그룹/ 오류

        int studentClass = 7;

        switch (studentClass){
            case 1:
            case 2:
            case 3:
                System.out.println("A그룹");
                break;

            case 4: case 5: case 6:
                System.out.println("B그룹");
                break;

            case 7: case 8: case 9:
                System.out.println("C그룹");
                break;
            default:
                System.out.println("오류");
                break;
        }



    }
}