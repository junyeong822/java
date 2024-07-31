package Student;

public class StuendTest {

    public static void main(String[] args) {


        // School school = new School(); // 생성자가 private 호출x = 객체 생성x
        // static이 붙으면 객체를 생성하지 않고도, 호출하여 실행가능
        // school에 대한 객체가 생성된적이 없기 때문에
        // 클래스명.메서드명(); 과 같은 형식으로 호출할수 있다.
        School school = School.getSchool();

        System.out.println(school);


        System.out.println("\n\n");

        Subject subjectKor = new Subject(1001,"국어",85);
        Subject subjectEng = new Subject(1002,"영어",75);

        Student stLee = new Student("이순신", subjectKor);
        Student stKim = new Student("김유신", subjectEng);
        Student stHong = new Student("홍길동", subjectEng);
        Student stKang = new Student("강감찬", subjectEng);

        stLee.showInfo(); // 객체 이름을 출력하면 toString 내용 출력
        stKim.showInfo();
        stHong.showInfo();
        stKang.showInfo();

    }

}
