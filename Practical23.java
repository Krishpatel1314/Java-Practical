/*
Write a program that defines a Circle class with two constructors. 
The first form accepts a double value that represents the radius of 
the circle. The second form accepts the integer radius of the circle 
and calculates the area of the circle. 
 */
import java.util.Scanner;
class circle{
    circle(double r){
        System.out.println("Area of circle:"+3.14*r*r);
    }
    circle(int r1){
        System.out.println("Area of circle:"+3.14*r1*r1);
    }
}
public class Practical23 { 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter radius in double:");
        double r=sc.nextDouble();
        System.out.print("Enter radius in integer:");
        int r1=sc.nextInt();
        circle c1=new circle(r);
        circle c2=new circle(r1);
        sc.close();
    }
}
/*
OUTPUT:
Enter radius in double:3.445
Enter radius in integer:5
Area of circle:37.265598499999996
Area of circle:78.5
 */