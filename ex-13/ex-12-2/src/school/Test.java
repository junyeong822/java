package school;

public class Test {

    public static void main(String[] args) {

        School school = School.getInstance();

        Student stHong = new Student(101, "홍길동");
        Student stKim = new Student(102, "김유신");
        Student stLee =  new Student(103, "이순신");
        Student stYoul =  new Student(104, "이율곡");

        school.addStudnet( stHong);
        school.addStudnet(stKim );
        school.addStudnet(stLee);
        school.addStudnet(stYoul);

        school.printAll();

        school.removeStudent(103);
        school.printAll();
    }
}
