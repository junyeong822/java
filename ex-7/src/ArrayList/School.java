package ArrayList;

import java.util.ArrayList;

public class School {

    private static School instance = null
    private String schoolName;
    private ArrayList<Student> studentList = new ArrayList<Student>();
    
    private School() {
        this.schoolName = "한국 고등";
    }

    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(int id, String name){
        Student student = new Student(id, name);
        studentList.add(student);
    }

    public void addSubject(int index, String name, int score){
        if ( index <0 || index > studentList.size()){
            System.out.println("인덱스 번호 오류");
            return;
        }
        studentList.get(index).addSubject(name, score);
    }

    public void showSchoolInfo(){
        System.out.println("-----" + schoolName + "학교의 정보----");
        
        if (studentList.isEmpty()){ // 비어 있으면?
            System.out.println("학생을 추가해주세요.");
            return ; // 메서드 종료, 반환값은 없음
        }

        System.out.println("----- 학생 리스트 출력 -----");
        for(Student student : studentList){
            student.showStudentInfo();
            System.out.println("-----------------");
        }
    }

}
