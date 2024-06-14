import java.util.*;
public class IteratorDemo {
    public static void main(String[] args) {
        try{

            ArrayList<String> al=new ArrayList<String>();
            al.add("H");
            al.add("I");
            al.add("K");
            al.add("a");
            al.add("y");
            Iterator<String> itr=al.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next()+" ");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
