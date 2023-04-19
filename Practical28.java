/*
Write a program using interface inheritance. Make two interfaces 
one is Shape2D which contains a method to calculate the area of 
the circle and the second interface Shape3D which contains method 
to calculate the volume of the sphere. Both the classes, Circle and 
Sphere extends one abstract class Shape which contains a method 
display( ) to display the area and volume. 
*/
interface Shape2D{
    double getarea();
}
interface Shape3D{
    double getvolume();
}
abstract class Shape{
    public abstract void display();
}
class circle extends Shape implements Shape2D{
    double r;
    circle(double r){
        this.r=r;
    }
    public double getarea(){
        return (3.14)*r*r;
    }
    public void display(){
        System.out.println("Area of Circle"+getarea());
    }
}
class Sphere extends Shape implements Shape3D{
    double r;
    Sphere(double r){
        this.r=r;
    }
    public double getvolume(){
        return (4/3)*(3.14)*r*r*r;
    }
    public void display(){
        System.out.println("Volume of sphere:"+getvolume());
    }
}
public class Practical28 {
    public static void main(String[] args) {
        circle c=new circle(5);
        Sphere s=new Sphere(5);
        c.display();
        s.display();
    }
}
/*
OUTPUT:
Area of Circle78.5
Volume of sphere:392.5
 */