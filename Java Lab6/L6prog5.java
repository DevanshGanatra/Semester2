// Design a class named MyPoint to represent a point with x and ycoordinates. The class contains: 
//a. The data fields x and y that represent the coordinates with getter methods. 
//b. A no-arg constructor that creates a point (0, 0). 
//c. A constructor that constructs a point with specified coordinates. 
//d. A method named distance that returns the distance from this point to a specified point of the MyPoint type. 
//e. A method named distance that returns the distance from this point to another point with specified x- and y-coordinates. 
class MyPoint{
     double x_coordinate;
     double y_coordinate;
    public void getcoordinates()
    {
        System.out.println(x_coordinate+","+y_coordinate);
    }
    MyPoint(){
        x_coordinate=0;
        y_coordinate=0;
    }
    MyPoint(double x_coordinate,double y_coordinate){
        this.x_coordinate=x_coordinate;
        this.y_coordinate=y_coordinate;
    }
    public double distance(MyPoint p1){
        double dist=(int)(Math.sqrt(Math.pow(p1.x_coordinate-this.x_coordinate,2 )+Math.pow(p1.y_coordinate-this.y_coordinate,2 )));
        return dist;
    }
    public double distance(double x,double y)
    {
        double dist=(int)(Math.sqrt(Math.pow(x-this.x_coordinate, 2)+Math.pow(y-this.y_coordinate, 2)));
        return dist;
    }
}




public class L6prog5 {
    public static void main(String[] args) {
        MyPoint p1=new MyPoint();
        MyPoint p2=new MyPoint(1,1);
        System.out.println(p1.distance(p2));
        System.out.println(p1.distance(5, 5));
    }
}