import java.util.Scanner;

public class hello{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        //  sc.close();
        // System.out.println("Sum:"+(a+b));
        // System.out.println("Sub:"+(a-b));
        // System.out.println("Div:"+(a/b));
        // System.out.println("Multi:"+(a*b));
        //---------------------------
        // int a=sc.nextInt();
        // sc.close();
        // System.out.println("Area od circle:"+(3.14*a*a));
        // ---------------------------
        // int a=sc.nextInt();
        // sc.close();
        // if (a%2==0) {
        //     System.out.println("Even");
        // }
        // else
        // System.out.println("Odd");
        // -----------------------------
        int a=sc.nextInt();
        sc.close();
        // for (int i = 1; i <=a; i++) {
        //     System.out.println(i);
        // }
        int i=0;
        // while (i<=a) {
        //     System.out.println(i);
        //     i++;
        // }
        do {
            System.out.println(i);
            i++;
        } while (i<=a);
    }
}