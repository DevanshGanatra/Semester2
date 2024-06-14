import java.util.*;
public class ListDemo {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try{
            @SuppressWarnings("rawtypes")
            List students =new ArrayList();
            students.add("Devansh");
            students.add("Dev");
            students.add("samarth");
            students.add("Utsav");
            students.add("baakinav");
            System.out.println("\t"+students);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
