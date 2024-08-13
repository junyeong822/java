package SirName;

// 펑셔널 인터페이스 - 메서드를 반드시 1개만 만들어야됨
// 메서드가 여러개 만들면 오류가 나도록 @FunctionalInterface 에노데이션 붙여줌
// 2개 이상 메서드가 될때 오류 띄워준다
@FunctionalInterface
public interface SirName {

    // 이름을 담으면 "님" 호칭을 붙여서 변환하는 메서드
    public String sirName(String name);
}
