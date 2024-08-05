package MyArray;

public class Test {


    public static void main(String[] args) {

        MyArray arr = new MyArray();

        System.out.println( arr.getSize() );

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        arr.insert(1, 123);


        System.out.println("-----------");

        arr.printAll();


    }




}
