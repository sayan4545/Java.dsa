package OOPS.Generics;

public class Implementation {
    public static void main(String[] args) {
        CustomArrauList list = new CustomArrauList();
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(7);
        list.add(10);
        System.out.println(list);
        CustomGenericArrayList<Integer> list2 = new CustomGenericArrayList<>();
        list2.add(12);
        list2.add(13);
        list2.add(34);
        list2.add(45);
        System.out.println(list2);
        CustomGenericArrayList<String> list3 = new CustomGenericArrayList<>();
        list3.add("Sayan");
        list3.add("Chandrika");
        list3.add("Bishal");
        list3.add("Arka");
        System.out.println(list3);

    }
}
