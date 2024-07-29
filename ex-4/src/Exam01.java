//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
public class Exam01 {
    public static void main(String[] args) {

        // 배열 = 아파트(동, 호수)
        // 지금까지 변수 - 단독주택 - 값이 1개씩만 저장
        // 같은 자료형, 같은 배열의 이름으로 여러개의 변수를 동시에 선언 / 인덱스로 구분

        // 정수형 변수 5개 만들고, 첫번째 주소값을 arr 변수에 넣어라. arr 참조변수다.
        // 참조변수란? 주소값을 가지고 있는 변수.
        // 인덱스번호는 무조건 0 번부터 시작한다.

        // 배열의 특징
        // 1. 배열 선언시 크기 지정
        // 2. 배열 선언 후, 공간 크기 변경 삭제 불가
        // 3. 지정된 자료형의 값만 저장 가능

        // 자료형 []변수명 = new 자료형[갯수];
        int [] arr = new int[5]; // int형 변수 5개를 선언한다.

        // 선언만 하고 초기화x - 0 기본값
        for(int num : arr){
            System.out.println(num);
        }

        System.out.println("-----------------");

        // 초기화
        arr[0] = 10; // 인덱스번호 0번부터 시작
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println("현재 배열의 길이 : " + arr.length);
         // 현재 배열의 길이를 알려준다
        // 배열은 for문과 함께 많이 쓰임
        // arr[i] = 배열이름 + 인덱스 쓰는 것은 값에 직접 접근
        for (int i = 0; i < arr.length; i++){
            System.out.println( i + " / "+ arr[i] ); // 인덱스값을 변수로 대치
        }

        System.out.println("-----------------");

        // 배열 선언과 동시에 초기화
        int [] arr2 = {65, 66, 67, 68};

        // 향상된 for
        // 배열에서 사용할 값을 num에 복사해서 사용 / 원본x
        for (int num : arr2){
            System.out.println(num);
        }

        System.out.println("-----------------");
        int []arr3; // 선언만
        arr3 = new int[3]; // 메모리공간 할당 후, 주소값 연결

    }
}