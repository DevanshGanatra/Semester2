public class L4prog6 
{
    public static void main(String[] args) {
        int i =0;
        for(i=0;i<args.length;i++){
            if(args[i].charAt(0)>=65  &&  args[i].charAt(0)<=91){
                System.out.println(args[i]);
            }
            else{
                System.out.println("Error Occuerd at "+ args[i]);
                return;
            }
        }
    }
}