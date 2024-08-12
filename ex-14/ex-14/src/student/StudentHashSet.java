package student;

import java.util.HashSet;

public class StudentHashSet {

    HashSet<Student> hashSet;

    public StudentHashSet() {
        this.hashSet = new HashSet<Student>();
    }

    public void addStudent(Student student){
        hashSet.add(student);
    }

    public boolean removeStudent(int studentId){

        for(Student student : hashSet){

            if (student.getStudentId() == studentId){
                hashSet.remove(student);
                return true;
            }
        }

        return false;
    }
    public void printAll(){

        for(Student student : hashSet){
            System.out.println(student);
        }

    }
}
