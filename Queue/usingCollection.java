import java.util.*;

public class usingCollection {
    public static void main(String[] args) {
        // Queue q = new Queue(5); 
        Queue<Integer> q = new LinkedList<>(); 
        // Queue<Integer> q = new ArrayDequeue<>(); 
        q.add(1); 
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
