package school;

import java.util.ArrayList;
import java.util.Iterator;

public class School {

    private static School instance = null;
    ArrayList<Student> studentList;

    private School (){
        studentList = new ArrayList<>();
    }

    public static School getInstance(){
        if (instance == null)
            instance = new School();
        return instance;
    }


    public void addStudnet(Student student){
        studentList.add(student);
    }

    public Boolean removeStudent(int studentId){

        Iterator<Student> ir = studentList.iterator();

        while( ir.hasNext() ){

            Student student = ir.next();
            int tempId = student.getStudentId();

            if(tempId == studentId){
                studentList.remove(student);
                return true;
            }
        }

        System.out.println(studentId + "가 존재하지 않음!");
        return false;
    }

    public void printAll(){

        Iterator<Student> ir = studentList.iterator();

        while( ir.hasNext() ){
            Student student = ir.next();
            System.out.println(student);
        }
        System.out.println();
    }


}
