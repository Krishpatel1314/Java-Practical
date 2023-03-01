/*
Write a program that prompts the user to enter three integers and 
display the maximum number among these numbers.
*/

import java.util.Scanner;
public class Practical5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number A:");
        int a=sc.nextInt();
        System.out.print("Enter number B:");
        int b=sc.nextInt();
        System.out.print("Enter number C:");
        int c=sc.nextInt();
        sc.close();
        if(a>b && a>c)
        {
            System.out.println("A is Maximum");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is Maximum");
        }
        else
        System.out.println("C is Maximum");
    }
}
