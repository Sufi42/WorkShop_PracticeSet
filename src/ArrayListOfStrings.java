import java.util.ArrayList;
import java.util.List;

public class ArrayListOfStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
       // list.add("Sufiyan");
       list.add("Sufi");
       list.add("WelcOme");
        list.add("ssss");

        char ch[] = {'a', 'e', 'i', 'o', 'u'};
        countingVovels(list, ch);
    }

    public static void countingVovels(List<String> list, char ch[]) {
        int count = 0;
        for (String s : list) {
            System.out.println(s);
            for (int k = 0; k < s.length(); k++) {
                s.toLowerCase();
                for (int j = 0; j < ch.length; j++) {
                    if ((s.toLowerCase().charAt(k)) == ch[j]) {
                        count++;
                    }
                }
            }
        }
        if(count == 0){
            System.out.println("Character not present");
        }
        System.out.println(count);
    }
}
