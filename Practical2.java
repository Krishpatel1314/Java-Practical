/* 
Body Mass Index (BMI) is a measure of health on weight. It can be 
calculated by taking your weight in kilograms and dividing by the 
square of your height in meters. Write a program that prompts the 
user to enter a weight in pounds and height in inches and displays 
the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters 
*/
import java.util.Scanner;
public class Practical2 {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter weight in pounds:");
        double w=sc.nextDouble();
        System.out.print("Enter height in inches:");
        double h=sc.nextDouble();
        sc.close();
        double kg=(w*.45359237);
        double m=(h*.0254);
        double bmi=(kg/(m*m));
        System.out.println("BMI="+bmi);
    }
}

/*
OUTPUT:
Enter weight in pounds:40
Enter height in inches:12
BMI=195.29710545532208
 */