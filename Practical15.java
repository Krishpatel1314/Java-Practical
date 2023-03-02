/*
Write a method with following method header. public static int 
gcd(int num1, int num2)Write a program that prompts the user to 
enter two integers and compute the gcd of two integers.
 */
import java.util.Scanner;
public class Practical15 {
    public static int gcd(int a, int b){
        while (a!=b) {
            if (a>b) {
                a=a-b;
            }
            else
            b=b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number:");
        int num1=sc.nextInt();  
        System.out.print("Enter Second number:");
        int num2=sc.nextInt();  
        sc.close();  
        System.out.println("GCD of "+num1+" and "+num2+"="+gcd(num1, num2));
    }
}
/*
OUTPUT:
Enter first number:24
Enter Second number:36
GCD of 24 and 36=12
 */