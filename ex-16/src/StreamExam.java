import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExam {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};

        // 배열 스트림 생성 : Arrays.stream(arr)
        int sumVal = Arrays.stream(arr).sum();
        long count = Arrays.stream(arr).count();
        // 개수, 메서드의 반환자료형 - long(8byte 크기 정수 자료형)

        double average = (double)sumVal / count;
        System.out.println(average);


        // 컬렉션 자료
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        // 컬렉션 스트림생성 :  컬렉션객체명.stream()
        Stream<String> stream = sList.stream();
        stream.forEach( s -> System.out.print(s + "/") );
        System.out.println();

        // 스트림은 한번 사용하고 재사용 불가, 그래서 매번 스트림생성해줌

        // 이름의 글자수 출력
        // map() : 가공된 결과물을 돌려준다 stream형태로
        // forEach()가 각각 한개씩 n에 넣어서 처리해준다.
        sList.stream().map( s -> s.length() ).forEach(n -> System.out.print(n + "/"));
        System.out.println();

        // 원본데이터 바뀐다? 안 바뀜? --> 안 바뀐다.
        // sorted() : 정렬해서 출력
        sList.stream().sorted().forEach( s -> System.out.print(s + "/"));
        System.out.println();

        // filter() : 조건에 맞는 데이터만 걸러내기
        // 람다식 :  (매개변수, 매개변수)-> 비교식;
        sList.stream().filter( s -> s.length() >= 5 ).forEach( s -> System.out.print( s+"/"));
        System.out.println("\n");

        // filter() : 조건에 맞는 데이터만 추출 - 람다식 : (매개변수)-> 비교식;
        // map() : 값을 변환 - 람다식 : (매개변수) -> 가공할 내용;
        // sorted() : 값 정렬

        // 배열에 점수가 들어 있고, 가산점 5점씩 추가. 그 목록 출력
        int [] scoreList = {78,85,92,86,97};
        Arrays.stream(scoreList)
                .map( score -> ( score + 5 > 100) ? 100 : score + 5 )
                .forEach( score -> System.out.print(score + "/"));

        // 각 점수에 제곱을 적용하는 람다식 - stream 이용
        // List에 저장하기
        System.out.println();

        List<Integer> scoreList2 = Arrays.asList( 78,85,92,86,97 ); // 배열 직접x
        List<Integer> squareNumbers = scoreList2.stream()
                .map( x -> x * x)
                .collect(Collectors.toList());

        System.out.println(squareNumbers);

    }
}

/*

스트림이란?
- 자료 -> Stream 이라는 형태로 바꿔서 사용한다.
* Stream : 시냇물, 물의 흐름 의미
    개발에서 stream은 - 일련의 데이터 흐름을 의미(연속적인 데이터 흐름)
    자바에서 stream을 이용하면
        데이터를 함수형연산(람다식)을 통해 표준화된 방법으로 쉽게 가공 처리가 가능해진다.
        대량의 데이터를 표준화된 방식으로 처리하기 위한 용도로 만들어짐.

- 자료의 대상과 관계없이 동일한 연산을 수행
    배열, 컬렉션을 대상으로 연산 수행함 (자료형x)
    일관성 있는 연산으로 자료의 처리를 쉽게 간단하게 함
    자료 처리에 대한 추상화가 구현되어 있음
- 한번 생성하고 사용한 스트림은 재사용 불가
    자료에 대한 스트림을 생성하여 연산을 수행하면 스트림은 소모된다
    다른 연산을 수행기 위해서 스트림을 다시 생성해야 한다.

- 스트림 연산의 특징 : 기존 자료 변경x
    ㄴ 기존 자료를 새로운 stream 형태로 생성함, 메모리 공간 별도 생성

*스트림 연산은
 - 중간연산: 최종연산을 위한 데이터 가공의 역할
    ㄴ filter() : 조건에 맞는 요소 추출
    ㄴ map() : 조건에 맞는 요소를 추출하고 원하는 형태로 가공한 데이터를 반환 (= 변환)
    ㄴ sorted() : 정렬
 - 최종연산
    ㄴ forEach() : 스트림에서 요소를 하나씩 꺼내온다(반복)
    ㄴ count () : 요소의 갯수
    ㄴ sum() : 요소의 합계








 */
