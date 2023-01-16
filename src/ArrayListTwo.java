import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            list.add(i);
        }
        ArrayList<Integer> listP = new ArrayList<>();
        primeFilter(list, listP);
    }

    public static void primeFilter(ArrayList<Integer> list, ArrayList<Integer> listP) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            int range = num / 2;
            int flag = 0;

            if (num == 1 || num == 2) {
                System.out.println("1 And 2 are not prime ");
            } else {
                for (int j = 2; j <= range; j++) {
                    if (num % j == 0) {
                        flag = 1;

                    }
                }
                if (flag == 0) {
                    listP.add(num);
                    count++;
                }
            }
        }
        for (int i = 0; i < listP.size(); i++) {
            System.out.print(listP.get(i) + " ");
        }
    }
}
