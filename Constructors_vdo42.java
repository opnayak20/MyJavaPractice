/*class Employee {
    private int id;
    private String name;
    private int Salary;
    public Employee(){
        id=45;
        name="Omm";
    }
    public Employee(String myName,int myId){
        id=myId;
        name=myName;
    }
    public Employee(int mySalary){
       Salary=mySalary;
    }

    public int getSalary() { return Salary;}
    public String getName() { return name;}
    public int getId() { return id;}
}
public class Constructors_vdo42 {
    public static void main(String[] args) {
       // Employee obj=new Employee(5000);
        Employee obj=new Employee("omm",90);
        //System.out.println(obj.getSalary());
       // System.out.println(obj.getId()+":"+obj.getName());
        System.out.println(obj.getId()+":"+obj.getName());
    }
}*/

class Cylinder1{
    private int radius;
    private int height;

    public Cylinder1 (int r,int h){
        this.radius=r;
        this.height=h;
    }
    //overloaded constructer
    public Cylinder1 (){
       this.radius=4;
       this.height=5;
    }
    public Cylinder1 (int r){
        this.radius=r;
        this.height=5;
    }
    public double Area(){
        double area = 3.14*radius*radius*height;
        return area;
    }
}
public class Constructors_vdo42{
    public static void main(String[] args) {
        Cylinder1 obj=new Cylinder1(2,5);
        Cylinder1 omm=new Cylinder1();
        Cylinder1 harry=new Cylinder1(2);
        System.out.println("The area of cylinder is :"+obj.Area());
        System.out.println("The area of cylinder is :"+omm.Area());
        System.out.println("The area of cylinder is :"+harry.Area());
    }
}

















