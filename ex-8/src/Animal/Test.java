package Animal;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<Animal>();

        Test test = new Test();
        animalList.add(new Human());
        animalList.add(new Tiger());
        animalList.add(new Eagle());

        for (Animal animal : animalList) {
            animal.move();
            test.downCasting(animal);
            System.out.println("----------------------------");
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }

    public void downCasting(Animal animal) {
        if (animal instanceof Human) {
            // 명시적 형변환 - 강제형변환
            Human h = (Human) animal; // 자식 자료형으로 다시 형변환 - 다운캐스팅
            h.readBooks();
        } else if (animal instanceof Tiger) {
            Tiger t = (Tiger) animal;
            t.hunting();
        } else if (animal instanceof Eagle) {
            Eagle e = (Eagle) animal;
            e.flying();
        }
    }
}
