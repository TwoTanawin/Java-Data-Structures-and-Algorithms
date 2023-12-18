import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        System.out.println(queue.isEmpty());

        queue.offer("Keren");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

//        System.out.println(queue.isEmpty());
//        System.out.println(queue.size());
//        System.out.println(queue.peek());
        System.out.println(queue.contains("Harold"));

        queue.poll();
        queue.poll();
        queue.poll();
        queue.element();

        System.out.println(queue);
    }
}