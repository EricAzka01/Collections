import java.util.ArrayList;
import java.util.Collections;

public class List {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("E");
        list1.add("R");
        list1.add("I");
        list1.add("C");
        System.out.println("List: " + list1);
        Collections.sort(list1);
        System.out.println("After Sort: " +list1);
    }



}
