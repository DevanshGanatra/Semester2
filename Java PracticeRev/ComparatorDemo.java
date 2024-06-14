import java.util.*;

class Students {
    String Name;
    int Age;

    Students(String Name, int Age) {
        this.Name = Name;
        this.Age = Age;
    }
}

class AgeComparator implements Comparator<Students> {

    public int compare(Students s1, Students s2) {
        return Integer.compare(s1.Age, s2.Age);
    }

}

public class ComparatorDemo {
    public static void main(String[] args) {
        try {
            ArrayList<Students> als = new ArrayList<Students>();
            als.add(new Students("Devansh", 18));
            als.add(new Students("Dev", 17));
            als.add(new Students("Xyz", 2));
            als.add(new Students("Dannabappa", 69));
            Collections.sort(als, new AgeComparator());;
            System.out.println("Now arranging acc to age:");
            Iterator itr = als.iterator();
            while (itr.hasNext()) {
                Students st = (Students) itr.next();
                System.out.println(st.Name + " " + st.Age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
