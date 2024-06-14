import java.util.*;
public class QueueDemo {
    public static void main(String[] args) {
        try{

            Queue<String> q=new LinkedList<String>();
            q.add("Devansh");
            q.add("Dev");
            q.add("Devarsh");
            q.add("Devang");
            q.add("Devesh");
            System.out.println(q.peek());
            System.out.println(q.poll());
            System.out.println(q.element());
            System.out.println(q.remove());
            System.out.println(q.element());
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
