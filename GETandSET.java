/*class Employee {

    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int i ) {
        this.id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n ) {
        this.name= n;
    }

    public class GETandSET{
        public static void main(String [] args) {
            Employee obj = new Employee();
            obj.setId(40);
            obj.setName("Omm");
            System.out.println(obj.getId() + ":" + obj.getName());
        }
    }
}


import java.util.Objects;

class Circle{
    private double radius;
    private double perimeter;
    private double area;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius=r;
    }

    public double getPerimeter(){
        return 2*3.14*radius;
    }
//    public void setPerimeter(double p){
//        this.perimeter=p;
//    }
    public double getArea(){
        return 3.14*radius*radius;
    }
//    public void setArea(double a){
//        this.area=a;
//    }
}
public class GETandSET{
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.setRadius(3.00);
//        obj.setPerimeter(12.00);
//        obj.setArea(30.00);
        System.out.println("The radius of the circle is when "+obj.getRadius()+" then it's area is "+obj.getArea()+" and perimeter is "+obj.getPerimeter()+".");
    }
}*/

class Cylinder{
    int radius;
    int height;

    //area of cyclinder method
    public double AreaofCylinder(){
        double area=3.14*radius*radius*height;
        return area;
    }

    //setter for radius
    public void setRadius(int r) {
        this.radius =r ;
    }
    //getter for radius
    public int getRadius(){ return radius;}

    //setter for height
    public void setHeight(int h) {
        this.height = h;
    }
    //getter for height
    public int getHeight(){ return height;}
}
public class GETandSET{
    public static void main(String[] args) {
        Cylinder obj=new Cylinder();
        obj.setRadius(3);
        obj.setHeight(7);
//        obj.getRadius();
        System.out.println(obj.getRadius()+":"+ obj.getHeight());
        System.out.println(obj.AreaofCylinder());
    }
}




























