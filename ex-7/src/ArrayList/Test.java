package ArrayList;

public class Test {

    public static void main(String[] args) {

        School school = School.getInstance();

        school.addStudent(1003, "Hong");
        school.addStudent(1004, "Gong");

        // school.getStudentList() = studentList 객체
        // 자료형 ArrayList
        // 값을 가져올 때 get메서드 사용


        // 첫번째 학생에게 추가
        school.getStudentList().get(0).addSubject("국어", 100);

        // 두번째 학생에게 추가
        // 객체를 중간에 변수에 담아서 사용
        Student stGong = school.getStudentList().get(1); // student객체
        stGong.addSubject("영어", 85);

        // 세번째 방법 -  추가하는 메서드를 만들어서 추가
        school.addSubject(5, "수학", 75);

        school.showSchoolInfo();


    }
}
