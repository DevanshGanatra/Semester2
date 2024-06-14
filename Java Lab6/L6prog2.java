import java.util.Scanner;

class Book {
   private String  authorname ;
   Book(String authorname){
    this.authorname=authorname;
   }
   public void setDetails(){
    System.out.println("Author: "+authorname);
   }
}

class bookpublication extends Book{
    private String title;

    bookpublication(String authorname, String title){
        super(authorname);
        this.title=title;
    }
    public void setDetails(){
        System.out.println("--- Book Details ---");
        super.setDetails();
        System.out.println("Title: "+title);
       }
}
class paperpublication extends Book{
private String title;

paperpublication(String authorname, String title){
    super(authorname);
    this.title=title;
}
public void setDetails(){
    System.out.println("--- Paper Details ---");
    super.setDetails();
    System.out.println("Title: "+title);
   }
}
class L6prog2{
    public static void main(String[] args) {
        if(args.length!=3)
        {
            System.out.println("OOPS!  Invaid Input.");
        }
        else{
                Book a;
                if(args[1].equalsIgnoreCase("book"))
                {
                a= new bookpublication(args[0],args[2]);
                }
                else if(args[1].equalsIgnoreCase("paper"))
                {
                a= new paperpublication(args[0], args[2]);
                }
                else
                {
                    a=new Book(args[0]);
                }
                a.setDetails();
        }
               
    }
}