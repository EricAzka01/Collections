import java.util.LinkedList;

public class Queue {

    public static void main(String[] args) {
        LinkedList<Integer> Q = new LinkedList<>();

        Q.add(5);
        Q.add(10);
        Q.add(25);
        Q.add(30);

        System.out.println("Queue Size: " + Q.size());
        System.out.println("Content: " + Q);


    }

}
