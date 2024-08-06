package Exam;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        // Animal animal = new Animal();
        // 오류, 추상메서드는 객체생성x. 왜? 미완성 클래스.
        // 자식 클래스의 생성자 super()를 통해 추상클래스의 생성자를 호출함,
        // 부모 객체를 생성한 후 자식 객체를 생성함

        ArrayList<Animal> animals = new ArrayList<>();

        // 추상 메서드를 상속받아서,
        // 자식마다 내용을 재정의(내용이 다르다)
        // 하지만 메서드는 동일
        // 각 자식마다 추가되는 변수와 메서드는 없는 상태

        animals.add( new Dog("사랑", 7) ); // 형변환 - 다형성 적용
        animals.add( new Dog("카니", 3) );
        animals.add( new Cat("봉식", 5) );
        animals.add( new Cat("냐옹", 2) );

        // 자료형변환 없이도 통일된 규격(메서드)로 객체 사용
        for(Animal animal : animals){
            animal.showInfo();
            animal.cry();
        }


    }
}
