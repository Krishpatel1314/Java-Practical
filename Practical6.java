/*
 Write a program that prompts the user to enter a letter and check 
whether a letter is a vowel or consonant.
 */
import java.util.Scanner;
public class Practical6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a letter:");
        char x=sc.next().charAt(0);
        sc.close();
        if (x=='a'||x=='e'||x=='i'||x=='o'||x=='u'||x=='A'||x=='E'||x=='I'||x=='O'||x=='U') {
            System.out.println("The letter is Vowel!!");
        }
        else
        System.out.println("The letter is Consonant!!");
    }
}

/*
OUTPUT:
Enter a letter:r
The letter is Consonant!!
----------------------------
Enter a letter:e
The letter is Vowel!!
 */