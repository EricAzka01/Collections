import java.util.LinkedList;

public class Stack {

    public static void main(String[] args) {
        LinkedList<Integer> Stack = new LinkedList<>();

        Stack.push(20);
        Stack.push(30);
        Stack.push(5);
        Stack.push(2);

        System.out.println("LinkedList: " + Stack);
    }
}
