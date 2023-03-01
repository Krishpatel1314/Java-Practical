/*
Use Cramer's rule to solve the following 2 X 2 system of linear 
equations for x and y: 
ax + by = e x = (ed - bf)/(ad - bc) 
cx + dy = f y = (af - ec)/(ad -bc) 
Write a Java program that prompts the user to enter the constants a, 
b, c, d, e, and f and the display the solution (x =?? and y =??). If 
ad-bc is 0, then your program prints “The equation has no 
solution". 
Note: (1) 3.4x+50.2y=44.5 (2) 2.1x+.55y=5.9
*/
import java.util.Scanner;
public class Practical1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of Equation-1");
        System.out.print("Enter Value of a:");
        double a=sc.nextDouble();
        System.out.print("Enter Value of b:");
        double b=sc.nextDouble();
        System.out.print("Enter Value of e:");
        double e=sc.nextDouble();
        System.out.println("Enter the values of Equation-2");
        System.out.print("Enter Value of c:");
        double c=sc.nextDouble();
        System.out.print("Enter Value of d:");
        double d=sc.nextDouble();
        System.out.print("Enter Value of f:");
        double f=sc.nextDouble();
        sc.close();
        if(((a*d)-(b*c))==0)
        {
            System.out.println("The equation has no solution");
        }
        else
        {
            double x = ((e*d) - (b*f))/((a*d) - (b*c));
            double y = ((a*f) - (e*c))/((a*d) -(b*c));
            System.out.println("X="+x+"    Y="+y);
        }
    }   
}
