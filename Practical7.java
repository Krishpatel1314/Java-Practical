/*
 * Write a program to find length of string and print second half of 
the string. 
 */
import java.util.Scanner;
public class Practical7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=sc.nextLine();
        sc.close();
        int l=str.length();
        System.out.println("Length of the string: "+l);
        System.out.println("Your sub string is: "+str.substring(l/2));
    }
}
