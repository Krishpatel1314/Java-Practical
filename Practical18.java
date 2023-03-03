/*
Write a program to sort the elements from given array of integer. 
Specify size of array and elements of array from command line 
argument. 
*/
import java.util.Arrays;
public class Practical18 {
    public static void main(String[] args) {
        int n=Integer.parseInt(args[0]);                //size of array
        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            num[i]=Integer.parseInt(args[i+1]);
        }
        Arrays.sort(num);
        System.out.print("Sorted array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print(" "+num[i]);
        }
    }
}
/*
OUTPUT:
using cmd line arguments
E:\SEM-4\Java-Practical>java Practical18.java 5 13 54 14 37 22
Sorted array: 13 14 22 37 54
*/