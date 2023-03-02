/*
Write a test program that prompts the user to enter ten numbers, 
invoke a method to reverse the numbers, display the numbers.
*/
import java.util.Scanner;
public class Practical16 {
    public static void reverse(int[] list){
        int temp;
        for (int i = 0, j = list.length-1; i<list.length/2; i++,j--) {
            temp=list[i];
            list[i]=list[j];
            list[j]=temp;
        }
    }
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
        reverse(num);
        System.out.print("Reverse:");
        for(int i:num){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
/*
OUTPUT:
Enter no. of elements you want to enter:5
Enter the elements:13 14 22 56 20
Reverse:20 56 22 14 13 
*/