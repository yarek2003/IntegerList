public class Main {
    public static void main(String[] args) {

        IntegerList stringList = new IntegerListImpl(10);
        stringList.add(1);
        stringList.add(2);
        stringList.add(3);
        stringList.add(5);
        System.out.println(stringList.toString());
        System.out.println();

        stringList.add(3, 4);
        System.out.println(stringList.toString());
        System.out.println();

        stringList.remove(4);
        System.out.println(stringList.toString());

    }
}