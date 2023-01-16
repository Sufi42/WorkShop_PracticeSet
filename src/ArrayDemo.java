import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1100");
        list.add("0011");
        list.add("111000");
        list.add("11110000");
        list.add("1111");
        list.add("1000");

        demoArray(list);
    }

    public static void demoArray(List<String> list) {
        int count = 0;
        int countOne = 0;
        List<String> list1 = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            char ch[] = list.get(i).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (ch[j] == '1') {
                    count++;
                } else {
                    countOne++;
                }
            }
            if (count == countOne) {
                list1.add(list.get(i));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
