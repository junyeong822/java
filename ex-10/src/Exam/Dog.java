package Exam;

public class Dog extends Animal{

    // 추상 클래스를 상속 받은 경우,
    // 반드시, 추상메서드를 재정의 해서 기능 구현 해야 함.

    public Dog (String name, int age){
        super(name, age);
    }

    @Override
    public void cry(){
        System.out.println("멍멍");
    }

}
