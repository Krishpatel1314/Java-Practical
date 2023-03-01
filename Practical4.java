/*
 Write a program to check the given number is Prime or not.
*/

import java.util.Scanner;
public class Practical4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number:");
        int a = sc.nextInt();
        sc.close();
        int i,m=0,flag=0;
        m=a/2;
        if(a==0||a==1)
        {
            System.out.println(a+" is the number is not prime number.");
        }
        else
        {
            for(i=2;i<=m;i++)
            {
                if (a%i==0) 
                {
                    System.out.println(a+" is the number is not prime number.");
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                System.out.println(a+" is the number is prime number.");
            }  
        }
    }
}
