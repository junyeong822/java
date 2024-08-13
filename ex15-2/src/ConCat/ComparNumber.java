package ConCat;

// 문제 : 숫자 2개(num1 num2) num1 > num2 -1 / num1 == num2 0 / num1 < num2 -1
@FunctionalInterface
public interface ComparNumber {
    public int comparNumber(int x, int y);
}
