/*
Write a program that reads a number in meters, converts it to feet, and displays the result.
 */
import java.util.Scanner;
public class Practical3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter distance in meters:");
        double m =sc.nextDouble();
        sc.close();
        System.out.println("Distance in feet= "+m*3.28084+"ft");
    }  
}
/*
OUTPUT:
Enter distance in meters:2.5
Distance in feet= 8.2021ft
 */