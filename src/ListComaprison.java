import java.util.ArrayList;
import java.util.List;

public class ListComaprison {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        List<Integer> listTwo = new ArrayList<>();
        listTwo.addAll(list);
        System.out.println(listTwo);
        compareTwoLists(list, listTwo);
    }

    public static void compareTwoLists(List<Integer> list, List<Integer> listTwo) {
        for (Integer i : list) {
            for (Integer o : listTwo) {
                if (i.equals(o)) {
                    System.out.println(i + " " + o + " Strings are equal");
                }
            }
        }
    }
}
