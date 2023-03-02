/*
Write a program to do the addition of two matrices.
 */
import java.util.Scanner;
public class Practical19 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows you want to enter:");
        int r=sc.nextInt();
        System.out.print("Enter no. of columns you want to enter:");
        int c=sc.nextInt();
        int[][] a=new int[r][c];
        int[][] b=new int[r][c];
        int[][] sum=new int[r][c];
        System.out.println("Enter the elements of first matrix:");
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                b[i][j]=sc.nextInt();
            }
        }
        sc.close();
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("Sum of matrix:");
        for (int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++){
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
/*
OUTPUT:
Enter no. of rows you want to enter:2
Enter no. of columns you want to enter:3
Enter the elements of first matrix:
1 2 3
4 5 6
Enter the elements of second matrix:
6 5 4
3 2 1
Sum of matrix:
7  7  7
7  7  7
*/