import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        // 배열 특징
        // 같은 자료형만 담을 수 있고, 크기가 한번 정해지변 변경 삭제 불가능

        int []arr = new int[5];
        arr[0] =10;

        // 데이터 공간의 추가, 삭제 가능한 자료형

        // ArrayList<자료형> 변수명 = new ArrayList<자료형>();
        // 작동원리는 배열과 비슷, 데이터의 추가, 삭제등이 가능하다.
        // 자료형 - 클래스만 올수 있다.
        // int = 일반자료형, Integer는 클래스자료형이다.

        ArrayList<Integer> list = new ArrayList<Integer>();

        // 데이터 추가 - add()
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(0, 100); // 삽입
        list.add(2, 3000);

        // 데이터 가져오기 - get()
        for(int i = 0; i < list.size() ; i++){
            System.out.println( list.get(i));
        }
        System.out.println("------------");
        // 갯수 알고 싶으면?
        System.out.println( "데이터 갯수 : " + list.size() );

        // 삭제 - 인덱스 번호로
        list.remove(3);

        // 값변경
        list.set(1, 123123123); // 인덱스, 값

        System.out.println("------------");

        for(Integer el : list){
            System.out.println(el);
        }

        /*

        배열 vs ArrayList 비교

        Student [] st = new Student[5];

        ArrayLsit<Student> st02 = new ArrayLsit<Student>();

        // 1) 값 가져오기
        st[0]
        st.get(0);

        // 2) 값 저장하기
        st[0] = 10;
        st.set(인덱스, 값);

        // 3) 전체 크기
        st.length
        st.size();

        //----------------------
        ArrayList만 가능한 것
        4) 값 추가하기
        - st.add(인덱스, 값);

        5) 값 삭제하기
        - st.remove(인덱스);

        6) 전체 삭제
        - st.clear()

        7) 해당 값이 있는 검사 - true/false
        - st.contains(객체)

        8) 해당 값의 위치 찾기 - 인덱스 번호 찾아주기
        - st.indexOf(값)
         */

    }
}









