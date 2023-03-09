/*Write an interactive program to print a string entered in a pyramid. 
For instance, the string “stream” has to be displayed as follows: 
     S
    S t
   S t r
  S t r e
 S t r e a
S t r e a m */
public class Practical10 {
    public static void main(String[] args) {
        char ch[]={'s','t','r','e','a','m'};
        String s=new String(ch);
        int n,j,k;
        n=s.length();
        for (int l = 0; l < n; l++) {
            j=0;
            for (int l2 = 0; l2 < n-1-l; l2++) {
                System.out.print(" ");
            }
            for ( k = 0; k <=l ; k++) {
                System.out.print(ch[j]+"  ");
                j++;
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}
/*
OUTPUT:
     s
    s  t
   s  t  r
  s  t  r  e
 s  t  r  e  a
s  t  r  e  a  m
 */