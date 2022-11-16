import java.util.HashSet;

public class Set {

    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(10);
        set1.add(8);
        set1.add(9);
        set1.add(15);
        System.out.println("Set: " +set1);
        set1.clear();
        System.out.println("After Clear: " +set1);

    }
}
