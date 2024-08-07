package scheduler;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("전화 상담원 할당 방식을 선택하세요");
        System.out.println("R : 한명씩 차례대로");
        System.out.println("L : 대기가 적은 상담원 우선");
        System.out.println("P : 우선순위가 높은 고객우선 숙련도 높은 상담원");

        String choice = sc.next();
        Scheduler scheduler = null;


        switch (choice) {
            case "R", "r" -> scheduler = new RoundRobin();
            case "L", "l" -> scheduler = new LeastJob();
            case "P", "p" -> scheduler = new PriorityAllocation();
            default -> {
                System.out.println("지원되지 않는 기능");
                return ;
            }
        }

        scheduler.getNextCall();
        scheduler.sendCallToAgent();


    }
}
