//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

        powderPrinter.setMaterial(new Powder()); // powder 자료 객체 저장

        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);


        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);


    }
}