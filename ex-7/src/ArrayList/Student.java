package ArrayList;


// 학생 - 과목리스트, 과목 추가 기능, 과목내역 출력 기능

// 학교 - 학생리스트, 학생 추가 기능, 학생내역을 출력 기능

import java.util.ArrayList;

public class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(){}

    public Student(int studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    // getter, setter

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ArrayList<Subject> getSubjectList() {
        return subjectList;
    }

    public void setSubjectList(ArrayList<Subject> subjectList) {
        this.subjectList = subjectList;
    }

    public void addSubject(String name, int score){
        Subject subject = new Subject(name, score);
        subjectList.add(subject);
    }

    public void showStudentInfo()
    {
        // 객체간 협력

        int total = 0;

        // 객체를 하나씩 꺼내와서, 그 안에 들어 있는 점수를 꺼낸다. - get메서드로 꺼내온다
        
        for(Subject s : subjectList){

            total += s.getScorePoint(); // += 누적
            System.out.println(
                    "학생 " + studentName +
                    " - " + s.getName() + " : " +
                    s.getScorePoint() + "점");
            // s.getName() = 과목명
        }

        System.out.println("학생 " + studentName + "의 총점 : " + total);
    }

    @Override
    public String toString(){
        return studentID + "/" + studentName;
    }

}
