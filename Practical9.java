/* Write a program to find that given number or string is palindrome 
or not. */
import java.util.Scanner;
public class Practical9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str,rev="";
        System.out.print("Enter number/string:");
        str=sc.nextLine();
        sc.close();
        int l=str.length();
        for (int i = (l-1); i >=0; i--) {
            rev=rev+str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println("Entered number/string is a palindrome");
        }
        else
        System.out.println("Entered number/string is not a palindrome");
    }
}