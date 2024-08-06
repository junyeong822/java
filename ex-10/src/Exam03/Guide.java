package Exam03;

public class Guide {

    String name;
    Tour tour;

    public Guide(String name, Tour tour){
        this.name = name;
        this.tour = tour;
    }

    // 메서드 재정의x , 순서 변경 안됨
    public final void tourProgram(){
        tour.header();
        System.out.println("가이드 : " + name);
        tour.program();
        tour.meal();
        tour.hotel();
    }

}
