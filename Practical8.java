/*Write a program to count the number of words that start with 
capital letters.*/
import java.util.Scanner;
public class Practical8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String str=sc.nextLine();
        sc.close();
        char c;
        int ct=0;
        for(int i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if (c>=65 && c<=90) {
                ct++;            
            }
        }
        System.out.println("Total no. of words start with capital letters:"+ct);
    }
}

/*
OUTPUT:
Enter a String:Java is Case sensitive Language.
Total no. of words start with capital letters:3
 */