package sirName;

// 함수형 인터페이스 - 메서드를 반드시 1개만 만들어야 함. 여러개x
// 메서드가 여러개 만들면 오류가 나도록 @FunctionalInterface 애노테이션 붙여줌
// 2개 이상 메서드가 될때 오류 띄워준다
@FunctionalInterface
public interface SirName {
    // 이름을 넣으면 "님" 호칭을 붙여서 반환하는 메서드
    public String sirName(String name);
}
