package SirName;

public class Test {
    public static void main(String[] args) {
        SirName test = new sirName() {
            @Override
            public String sirName(String naem){
                return name + "님";
            }
        };
    }
}
