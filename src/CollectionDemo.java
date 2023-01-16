import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        toDoList();
        arrayListDemo();

    }
    public static void toDoList(){
        List<String> l = new LinkedList<>();
        l.add(0,"AddedOne");
        l.add(1,"AddedAtZero");
        l.add(2,"Added at Second");
        l.remove(1);
        Iterator iterator = l.iterator();
           while(iterator.hasNext() ){
               System.out.println(iterator.next());
           }

    }
    public static void arrayListDemo(){
        List<String> l = new ArrayList<>();
        l.add(0,"asd");
        l.add(1,"qe");
        l.add(2,"fdg");
        Iterator iterator = l.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
