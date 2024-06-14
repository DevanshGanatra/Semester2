// Refine the student manager program to manipulate the student information
// from files by using the BufferedReader and BufferedWriter

import java.io.*;
import java.util.*;

class StudentManager {
    int rollno;
    String name;
    String email;
    public StudentManager(int rollno,String name, String email)
    {
        this.rollno=rollno;
        this.name=name;
        this.email=email;
    }
        
    }
public class L11aprog1{

    
    public static void main(String[] args) {
        try{
            BufferedReader temp=new BufferedReader(new FileReader("students.csv"));
            ArrayList<StudentManager> studentTemp= new ArrayList<StudentManager>();
            while(temp.ready()){
                String stringTemp =temp.readLine();
                String[] data = stringTemp.split(",");
                StudentManager StudentManagertemp =new StudentManager(Integer.parseInt(data[0]), data[1], data[2]);
                studentTemp.add(StudentManagertemp);
            }
           java.util.Iterator<StudentManager> itr=studentTemp.iterator();
            while(itr.hasNext()){
                StudentManager var=itr.next();
                System.out.println(var.name);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
       

    }
}