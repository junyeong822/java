package Exam;

public class TryCatch {

    public static void main(String[] args) {



        String str1 = "11";
        String str2 = "11.2";

        int num01 = Integer.parseInt(str1); // 문자열->숫자 변환하는 공식
        int num02 = Integer.parseInt(str2); // NumberFormatException : 실수라서 정수로 변환이 안됨

        System.out.println(num01);
        System.out.println(num02);


        // ArrayIndexOutOfBoundsException : 인덱스번호 오류
        /*int []arr = {1,2,3};
        System.out.println(arr[10]);*/



        // ArithmeticException : 0으로 나눔
        // System.out.println( 10 / 0);


        /*


        String [] strArr = null;

        *//*
        System.out.println(strArr[0]);g
*/
    }
}
