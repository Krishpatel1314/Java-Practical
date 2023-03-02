/*
Write a program to sort the elements from given array of integer. 
Specify size of array and elements of array from command line 
argument. 
*/
import java.util.Arrays;
import java.util.Scanner;
public class Practical18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of elements you want to enter:");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.print("Enter the elements:");
        for (int i = 0; i < num.length; i++) {
            num[i]=sc.nextInt();
        }
        sc.close();
        Arrays.sort(num);
        System.out.print("Sorted array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
    }
}
/*
OUTPUT:
Enter no. of elements you want to enter:5
Enter the elements:13 54 14 37 22
Sorted array: 13 14 22 37 54
*/