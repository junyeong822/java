import java.util.Arrays;
import java.util.Comparator;

public class Test01 {

    public static void main(String[] args) {

        // 문제1 번 1~100사이 랜덤 정수 5개 배열에 저장 후 출력
        // 최대값, 최소값 찾아서 출력하기.

        int[] arr = new int[5];
        int max= 0;
        int min = 0;

        for(int i = 0; i < 5 ; i++){
            arr[i] = (int) ( Math.random() * 100 ) + 1 ;
        }

        max = arr[0];
        min = arr[0];

        for(int i = 0; i < 5 ; i++){
            if(max < arr[i] ){
                max = arr[i];
            }
            if(min > arr[i]){
                min = arr[i];
            }
        }

        System.out.println(max);
        System.out.println(min);

        // 배열을 출력하는 방법
        System.out.println( Arrays.toString(arr) ); // 정렬전
        Arrays.sort(arr);
        System.out.println( Arrays.toString(arr) ); // 오름차순 정렬

        //Arrays.sort(arr, Comparator.reverseOrder() );
        System.out.println( Arrays.toString(arr) ); // 내림차순 정렬
    }
}
