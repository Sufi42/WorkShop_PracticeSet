import java.util.ArrayList;
import java.util.List;

public class ArrayListOfOneAndZero {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("1100");
        list.add("0011");
        list.add("1111");
        list.add("0000");
        list.add("1010");
        list.add("11110000");
        list.add("111111000000");
        list.add("1110");
        list.add("2212");
        list.add("1000");

        returnEqual(list);
    }

    public static void returnEqual(List<String> list) {
        int count = 0;
        int count1 = 0;
        List<String> list1 = new ArrayList<String>();

        for(int i =0; i < list.size(); i++){
            for(int j = 0; j < list.get(i).length(); j++){
                char ch = list.get(i).charAt(j);
                for(int k = j+1; k < list.get(i).length(); k++){
                    char ch1 = list.get(i).charAt(k);

                    if(ch == '1'){
                        count++;
                    }else{
                        count1++;
                    }
                }
            }
            if(count1 == count){
                list1.add(list.get(i));
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
    }
}
